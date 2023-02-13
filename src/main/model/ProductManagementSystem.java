package model;

import java.util.ArrayList;

//Product management system, keeps a catalogue of products
public class ProductManagementSystem {

    private ArrayList<Product> catalogue;

    public ProductManagementSystem() {
        catalogue = new ArrayList<>();
    }

    //REQUIRES: product with same id not already in catalogue
    //MODIFIES: this
    //EFFECTS: adds product to catalogue
    public void addProduct(Product p) {
        this.catalogue.add(p);
    }

    //REQUIRES: productId is a 4 digit int
    //EFFECTS: returns true if product with id already in catalogue, otherwise false
    public boolean containsProduct(int productId) {
        boolean contains = false;

        for (Product prod:catalogue) {
            if (prod.getId() == productId) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    //EFFECTS: returns true if product with id already in catalogue, otherwise false
    public boolean containsProduct(Product prod) {
        boolean contains = false;

        for (Product p:catalogue) {
            if (prod.getId() == p.getId()) {
                contains = true;
                break;
            }
        }
        return contains;
    }

    //EFFECTS: returns string representation of catalogue
    public StringBuilder displayCatalogue() {
        StringBuilder str = new StringBuilder();

        for (Product p:catalogue) {
            str.append(p.toString());
        }
        return str;
    }

    //REQUIRES: product in catalogue
    //EFFECTS: returns given product
    public Product getProductById(int id) {
        for (Product p:catalogue) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }


    //GETTERS

    public int getCatalogueSize() {
        return catalogue.size();
    }


}
