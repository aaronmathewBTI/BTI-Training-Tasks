package Day4;
import java.util.Scanner;
public class ExceptionHandling {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter two numbers");
            String number1 = scan.next();
            String number2 = scan.next();

            int num1 = Integer.parseInt(number1);
            int num2 = Integer.parseInt(number2);
            int result = num1/num2;

            System.out.println("Result = "+result);
        } catch(ArithmeticException e) {
            System.out.println("AE ocurred and handled");
            e.printStackTrace();
        } catch(NumberFormatException e){
            System.out.println("NFE ocurred and handled");
            e.printStackTrace();
        } finally {
            System.out.println("Finally block is always executed");
            scan.close();
        }

        System.out.println("Program ends here.");
    }

}
