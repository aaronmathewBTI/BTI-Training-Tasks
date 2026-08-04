package Day4;

import java.util.Scanner;
// we are creating custom exception - every exception has a message property which stores 
// error message, that you can initialize using super keyword
// there's a getMessage() method to return the error message - useful in the catch block

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException() {
        super("Transaction declined")
    }
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class TestThrowAndThrows {

    // view layer method - atm monitor - gets ISBE
    public static void atm() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount");
        try {
            double amount = scan.nextDouble();
            debit(amount);
        
    } catch(InsufficientBalanceException e) {
        System.out.println(e.getMessage());
    }
    scan.close();
}
// debit propogates the exception only if balance is insufficient
public static void debit(double amount) throws InsufficientBalanceException {
    double balance = 5000;
    if( amount < balance) {
        throw new InsufficientBalanceException("Amount "+amount+" is invalid,  insufficient balance");
    } else {
        balance = balance - amount;
        // in real time you don't print here, instead you return an object that will have balance and 
        // other account details so that caller can show them
        System.out.println("Amount debited, balance is : "+balance);
    }
}
    
public static void main(String[] args) {
    atm();
}
}
