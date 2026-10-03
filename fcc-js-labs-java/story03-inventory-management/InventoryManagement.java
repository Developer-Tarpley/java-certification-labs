// User Stories:


// You should create a function named addProduct that takes a product object as its argument.
// If the product is already present in the inventory, the addProduct function should update its quantity value by adding the quantity passed in to the function to the current quantity and log to the console the product name followed by a space and quantity updated.
// If the product is not present in the inventory, the addProduct function should push the product to the inventory array and log the product name to the console, followed by a space and added to inventory.
// You should create a function named removeProduct that takes the product name and quantity as its arguments.
// The removeProduct function should subtract the passed quantity from the corresponding product object inside the inventory and log the string Remaining <product-name> pieces: <product-quantity> to the console, where <product-name> should be replaced by the product name, and <product-quantity> should be replaced by the product quantity.
// If the quantity after the subtraction is zero, removeProduct should remove the product object from the inventory. If the quantity in the inventory is not enough to perform the subtraction, the removeProduct function should log the string Not enough <product-name> available, remaining pieces: <product-quantity> to the console.
// If the product to remove is not present in the inventory, the removeProduct function should log <product-name> not found to the console.

import java.util.ArrayList;

public class InventoryManagement {

    private ArrayList<Inventory> inventory;
    private int quantity;

    public InventoryManagement(){
        this.inventory = new ArrayList<>();
        this.quantity = 0;
    }

    class Inventory{

        private String name;
        private int quantity;

        public Inventory(String name, int quantity){
            if(name == null || !name.equals(name.toLowerCase())){
                throw new IllegalArgumentException("The name must be all lowercase letters");
            }
            this.name = name;
            this.quantity = quantity;
        }

        public String getName(){
            return name;
        };

        public int getQuantity(){
            return quantity;
        }
    }

// You should declare an empty array named inventory that will store product objects having a key name with the value of a lowercase string, and a key quantity with the value of an integer.
// You should create a function named findProductIndex that takes the product name as its argument and returns the index of the corresponding product object inside the inventory array. The function should always use the lowercase form of the product name to perform the search. If the product is not found, the function should return -1.
    
    void main(String[] args){
        InventoryManagement product = new InventoryManagement();
        product.inventory.add(new Inventory("blue scarf", 3));
        System.out.println(product.inventory.get(0).getName());
    }
}
