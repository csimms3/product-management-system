# Store Inventory Manager

## What will it do?
The Store Inventory Manager will allow a store owner to manage their product inventory by:
- Creating **digital versions of their products**, with pricing, descriptions and images
- Keeping track of their **stock numbers**
- Processing **sales and shipments**
- Allowing them to **search** through their products digitally

## Who will use it?
The Store Inventory Manager will be used by any store employees 
to perform job duties, as well as by customers, who may search the
store's inventory and view products online. When used by customers,
certain actions may be restricted to prevent unauthorized price
alterations and similar activity.

## Why this project?
During high school, I had a part-time retail job which used an
inventory manager to do the things listed above, as
almost all stores do. As I became more interested in
programming and software development, I began to think
about how such a system could be designed and implemented.
This project will allow me to further pursue my curiosity
around this topic, allowing me to dive deeper into the specifics.

## User Stories
- As a user, I want to be able to create a new product and add this product to the catalogue
- As a user, I want to be able to browse the catalogue (view all products)
- As a user, I want to be able to search for a product by product number
- As a user, I want to be able to process sales, updating stock numbers in doing so
- As a user, I want to be able to save the state of my inventory to file (if I want)
- As a user, I want to be given the option to load my inventory from file when I start the application

## Instructions for Grader
- Start the application by running ProductSystemUI.main().
- Note the graphic that shows up while loading, this is the visual element.
- Now, you may click "load from file" to optionally load the application state.
- Whether you loaded the file or not, you can click "create product" to create a new product. 
- Enter a name, a price in form (xx.xx), and a 4-digit id. If you load from file make sure
that this id is unique (see below).
- Now, go back to the main menu, and click "view catalogue".
- Here you see all products, note the unique id proceeded by "#". This is how you will search.
- Now, make note of one of these id's, and return to the main menu.
- Click on "search", and enter the given product number.
- This will display a product view that will allow you to update its stock, or delete the product.