package Day4;

import javax.print.DocFlavor.STRING;

public class TestStrings {
    public static void main(String[] args) {
    String email = "aaronmat@gmail.com";
    System.out.println("Email Length : " + email.length()); //Length of String
 
    int index = email.indexOf('@'); //First Index of Character
    System.out.println("Index of @ : " + index);
 
    String username = email.substring(0,index); //Sybstring with start and last index (last index charcter not includes)
    System.out.println("User Name : " + username);
 
    int lastindex = email.lastIndexOf('.'); // Last Index of that char in string
    String domain = email.substring(index + 1,lastindex);
    System.out.println("Domain : " + domain.toUpperCase()); // Converts to UPPER CASE
 
    String password = "aaron1234";
    System.out.println("Equals = "+username.equals(password)); //checks if both values are equal or not
 
    String confirmPassword = "aaron1234";
    System.out.println("Password Matches ? " + password.equals(confirmPassword));

    }
}