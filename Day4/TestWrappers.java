package Day4;

public class TestWrappers {
    public static void main(String[] args) {
        String numberText = "5000";
        int amount = 10000;
        int price = Integer.parseInt(numberText);
        int total = amount + price;
        System.out.println("Total = "+total);
        // Character class has methods to validate a character is digit or letter
        String phone = "12345678";
        for(int i=0; i<phone.length(); i++){
            char digit = phone.charAt(i);
            System.out.println(digit + " is a digit: "+Character.isDigit(digit)); 
        }

        // comparing 2 numbers using compare method - useful in sorting -learning it later
        // compare method returns 0 if the numbers are the same, +1 if x>y or -1 if x<y

        System.out.println("Compare 3 and 2: "+Integer.compare(3,2));
    }

}
