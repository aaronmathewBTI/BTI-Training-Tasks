package Day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity02ProductInventory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Rice", 25);
        inventory.put("Sugar", 15);
        inventory.put("Milk", 20);
        inventory.put("Bread", 12);
        inventory.put("Eggs", 30);

        char choice;

        do {
            displayProducts(inventory);

            try {
                System.out.print("\nEnter Product Name: ");
                String product = sc.nextLine();

                System.out.print("Enter Quantity: ");
                int quantity = Integer.parseInt(sc.nextLine());


                if (!inventory.containsKey(product)) {
                    throw new ProductNotFoundException("Product '" + product + "' is not available in the inventory.");
                }

                if (quantity <= 0) {
                    throw new InvalidQuantityException("Quantity should be greater than zero.");
                }

                int available = inventory.get(product);

                if (quantity > available) {
                    throw new InsufficientStockException("Only " + available + " units of " + product + " are available.");
                }

                // Successful Order
                inventory.put(product, available - quantity);

                System.out.println("\nOrder placed successfully.");
                System.out.println("\nRemaining Stock:");
                System.out.println(product + " : " + inventory.get(product));

            } catch (ProductNotFoundException e) {
                System.out.println("\nProductNotFoundException:");
                System.out.println(e.getMessage());

            } catch (InvalidQuantityException e) {
                System.out.println("\nInvalidQuantityException:");
                System.out.println(e.getMessage());

            } catch (InsufficientStockException e) {
                System.out.println("\nInsufficientStockException:");
                System.out.println(e.getMessage());

            } catch (NumberFormatException e) {
                System.out.println("\nInvalid input! Please enter a valid number.");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            choice = sc.next().charAt(0);
            sc.nextLine(); // consume newline

        } while (choice == 'Y' || choice == 'y');

        System.out.println("\nThank you for using the Product Inventory Management System.");

        sc.close();
    }

    public static void displayProducts(HashMap<String, Integer> inventory) {
        System.out.println("\nAvailable Products");
        for (Map.Entry<String, Integer> product : inventory.entrySet()) {
            System.out.println(product.getKey() + " : " + product.getValue());
        }
    }
}

class ProductNotFoundException extends Exception {
    ProductNotFoundException(String msg) {
        super(msg);
    }
}

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}

class InsufficientStockException extends Exception {
    InsufficientStockException(String msg) {
        super(msg);
    }
}