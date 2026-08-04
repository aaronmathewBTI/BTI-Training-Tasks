package Day1;

import java.util.Scanner;

public class TestOperators {
    public static void main(String[] args) {
        int index=1;
        
        // post increment
        int nextIndex= index++;
        System.out.println("Index ="+index+", Next Index= "+nextIndex); //2 1

        //pre decremenent
        int count = 2;
        int previousCount= --count;
        System.out.println("Count ="+count+", Previous Count = "+previousCount );

        //ternary operator
        String status = count > 0 ? "Available" : "Sold Out";
        System.out.println("Status = "+status);
        count--;
        status = count >0 ? "Available" : "Sold out";
        System.out.println("Status = "+status+", Quantity count = "+count);
        
        // shift operators <<,>>,>>>
        // left shift <<
        int MultipleByTwo= 5<<3; // 5*2*2*2
        System.out.println("Multiples Of Two="+MultipleByTwo);
        int DivideByTwo= 100 >> 2; 
        System.out.println("Divide by Two= "+DivideByTwo);
        // unsigned right shift : converts negative to positive

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks= scan.nextInt();
        System.out.println("The mark is ="+marks);

        String name= scan.nextLine();
        System.out.println("Enter the name");

        scan.close();

    }

}
