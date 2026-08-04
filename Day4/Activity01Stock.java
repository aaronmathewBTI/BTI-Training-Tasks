package Day4;

import java.util.Scanner;

public class Activity01Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Availabe Stock : ");
        int stock = sc.nextInt();
        System.out.print("Enter Quantity to Order : ");
        int quantity = sc.nextInt();

        try {
            int res = checkAndUpdate(stock, quantity);
            System.out.println("Order confirmed. Remaining stock: " + res);
        } catch (OutOfStockExcpetion e) {
            System.out.println("Exception : " + e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Exception : " + e.getMessage());
        }

        sc.close();
    }

    public static int checkAndUpdate(int stock, int reqQuantity) throws OutOfStockExcpetion {
        if (reqQuantity < 0) {
            throw new IllegalArgumentException("Requested quantity cannot be negative");
        }
        if (reqQuantity > stock) {
            throw new OutOfStockExcpetion("Requested quantity exceeds available stock.");
        }

        return stock - reqQuantity;
    }

}

class OutOfStockExcpetion extends Exception {
    public OutOfStockExcpetion(String msg) {
        super(msg);
    }
}
 