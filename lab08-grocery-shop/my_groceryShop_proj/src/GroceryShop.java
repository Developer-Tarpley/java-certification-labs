// In this project, you will create a console application for a grocery shop, which will calculate the total of grocery items chosen depending on the unit price and quantity. The tasks in this hands-on project correspond to the activities performed by a Java Developer who is creating a stand-alone console application.

// This final project, which will take about 30 minutes to complete, is comprised of eight tasks.

import java.util.Scanner;

public class GroceryShop {

    private String items[] = {
            "milk", "coffee", "sugar", "apple", "orange", "eggs", "beans",
            "bread", "mayonaise", "tomato", "onion", "pear", "cucumber", "shrimp",
            "duck", "peas", "lettuce", "spinach", "carrot", "chicken", "beef",
            "salmon", "crab", "lobster"
    };// 24 length
    private float unitPrice[] = {
            3.25f, 6.75f, 2.20f, 2.99f, 2.79f, 4.15f, 2.89f,
            0.99f, 2.00f, 4.89f, 0.65f, 0.79f, 1.20f, 0.55f,
            0.59f, 1.99f, 1.00f, 1.89f, 0.79f, 3.69f, 4.00f,
            11.99f, 8.00f, 15.75f
    };// by corresponding index of items;

    private int stock[] = {
            39, 22, 44, 2, 6, 7, 90,
            12, 34, 33, 22, 65, 100, 45,
            1, 43, 55, 77, 67, 84, 32,
            18, 90, 235
    };

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

    public String getItemName() {
        return itemName;
    };

    public void searchItem(String[] items, String item) {
        boolean found = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].indexOf(item) != -1) {
                System.out.println("Item found at index: " + i);
                found = true;
                break;
            }
            ;
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }

    public float calculateAveragePrice(float[] prices) {
        float pricesSum = 0f;
        for (int i = 0; i < unitPrice.length; i++) {
            pricesSum += unitPrice[i];
        }
        float totalPriceAverage = pricesSum / prices.length;
        return totalPriceAverage;
    }

    public void filterItemsBelowPrice(String[] items, float[] prices, int threshold) {
        System.out.println("Items under $" + threshold);
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < threshold) {
                System.out.println(items[i] + ": $" + prices[i]);
            }
        }
    }

    void main(String[] args) {
        // searchItem(this.items, "ketchup");
        // float getAvg = calculateAveragePrice(unitPrice);
        // System.out.println(String.format("Total average of prices is : $%.2f",
        // getAvg));
        // filterItemsBelowPrice(items, unitPrice, 1);

        Scanner sc = new Scanner(System.in);
        int howMany = 0;
        while (true) {

            System.out.println("Welcome to Grocery Mart!");

            while (true) {

                try {
                    System.out.println("\nSearch for an item you would like to add (type Finish when done with cart)");
                    String itemName = sc.nextLine();

                    if (itemName.equalsIgnoreCase("Finish")) {

                        if (total > 100) {
                            float discount = 0.10f;
                            total -= (total * discount);

                            System.out.println(String.format("Your total bill is $%.2f", total));
                            System.out.println("A 10% discount has been applied");
                            System.out.println(String.format("Your new total bill is $%.2f", total));

                            System.out.println("Thanks for shopping with us!");
                            break;
                        }
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
                    if (howMany > stock[itemIndex]) {
                        System.out.println("Sorry insufficient stock. " + stock[itemIndex] + " available");
                    }
                    System.out.println("How many would you like?");
                    howMany = Integer.parseInt(sc.nextLine());

                } catch (ItemNotFoundException infe) {
                    System.out.println(infe.getMessage());
                } catch (Exception e) {
                    System.out.println("Invalid input, Please try again.");
                    howMany = Integer.parseInt(sc.nextLine());
                }
                System.out.println(howMany);
                total += (howMany * unitPrice[itemIndex]);
                System.out.println(total);
                System.out.println(items[itemIndex]);
                System.out.println(
                        String.format("%d x %s added. Your current total is: $%.2f", howMany, items[itemIndex], total));
                    stock[itemIndex] -= howMany;
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
// Test the value typed by user - on purpose and accidental
// implement new methods into program - averagePrice, filter, and the search methods