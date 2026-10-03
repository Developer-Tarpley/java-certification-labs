// In this project, you will create a console application for a grocery shop, which will calculate the total of grocery items chosen depending on the unit price and quantity. The tasks in this hands-on project correspond to the activities performed by a Java Developer who is creating a stand-alone console application.

// This final project, which will take about 30 minutes to complete, is comprised of eight tasks.

import java.util.Scanner;

public class GroceryShop {

    private String items[] = {
            "milk", "coffee", "sugar", "apple", "orange", "eggs", "beans",
            "bread", "mayonaise", "tomato", "onion", "pear", "cucumber", "shrimp",
            "duck", "peas", "lettuce", "spinach", "carrot", "chicken", "beef",
            "salmon", "crab", "lobster"
    };// 25 length
    private float unitPrice[] = {
            3.25f, 6.75f, 2.20f, 2.99f, 2.79f, 4.15f, 2.89f,
            0.99f, 2.00f, 4.89f, 0.65f, 0.79f, 1.20f, 0.55f,
            0.59f, 1.99f, 1.00f, 1.89f, 0.79f, 3.69f, 4.00f,
            11.99f, 8.00f, 15.75f
    };// by corresponding index of items;

    private String itemName;
    private int itemIndex;
    private float total;

    public GroceryShop() {
    };

    GroceryShop(String itemName, int itemIndex, int total) {

        this.itemName = itemName;
        this.itemIndex = -1;
        this.total = 0.00f;
    }

    public String getItemName(){
        return itemName;
    }

    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int howMany =0;
        while (true) {

            System.out.println("Welcome to Grocery Mart!");

            while (true) {

                try {
                    System.out.println("\nSearch for an item you would like to add (type Finish when done with cart)");
                    String itemName = sc.nextLine();

                    if (itemName.equalsIgnoreCase("Finish")) {
                        System.out.println(String.format("Your total bill is $%.2f", total));
                        System.out.println("Thanks for shopping with us!");
                        break;
                    }

                    itemIndex = -1;
                    for (int i = 0; i < items.length; i++) {
                        if (items[i].equals(itemName)) {
                            itemIndex = i;
                            break;
                        }
                    }
                    
                    if (itemIndex == -1) {
                        throw new ItemNotFoundException("Sorry, " + itemName + " not found. Please try again.");
                    }

                    System.out.println(
                            String.format("%s costs $%.2f", itemName, unitPrice[itemIndex]));
                    System.out.println("How many would you like?");

                    howMany = Integer.parseInt(sc.nextLine());

                    
                    
                } catch (ItemNotFoundException infe) {
                    System.out.println(infe.getMessage());
                }catch(Exception e){
                    System.out.println("Invalid input, Please try again.");
                    howMany = Integer.parseInt(sc.nextLine());
                }
                System.out.println(howMany);
                total += (howMany * unitPrice[itemIndex]);
    
                 System.out.println(String.format("%d x %s added. Your current total is: $%.2f", howMany, itemName, total));
                
            }
            
            System.out.println("press enter to start a new cart or type exit to leave");

            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using Grocery Mart, Goodbye!");
                break;
            }
        }

        sc.close();

    }
}


// Additional challenges
// In this part of the project you are expected to complete the following tasks:

// Implement item search functionality
// Calculate average price
// Filter items below a certain price
// Calculate the total bill with discounts
// Implement inventory management

// Item Search Functionality
// Write a method called searchItem that takes a String array of items and a
// String item name as parameters.
// Use a for loop to iterate through the items array.
// If the item is found, print its index position. If the item is not found,
// print "Item not found."
// Call this method within your main program and test the method using different
// item names.

// Calculate Average Price
// Write a method called calculateAveragePrice that takes a float array of
// prices as a parameter.
// Use a for loop to sum all the prices in the array.
// Divide the total of all prices by the length of the array to find the
// average.
// Return the average price and print the average price in your main program.

// Filter Items Below a Certain Price
// Write a method called filterItemsBelowPrice that takes a String array of
// items and a float array of prices, along with a float threshold price.
// Use a for loop to check each price against the threshold.
// If the price is below the threshold, print the corresponding item name.
// Call this method using different threshold prices in your main program.
// Total Bill with Discounts
// Use conditional statements to implement the following logic:

// After calculating the total bill, check if the total exceeds $100.
// If the total exeeeds $100, apply a 10% discount on the total bill.
// Print both the original total and the discounted total.

// Inventory Management
// Implement the following logic within your purchase loop.
// Create an integer array named stock that corresponds to your items array,
// representing the stock available for each item.
// After a purchase is made, decrease the stock for that item by the quantity
// purchased.
// If a user tries to purchase an item that has insufficient stock, print a
// message indicating that the item is out of stock.