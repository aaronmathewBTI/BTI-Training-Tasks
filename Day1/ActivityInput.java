package Day1;

import java.util.Scanner;

public class ActivityInput {        
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ID details
        System.out.print("Enter ID =");
        int id = scan.nextInt();
        
        scan.nextLine();
        //Name details
        System.out.print("Enter name =");
        String name = scan.nextLine();
        

        //Age details 
        System.out.print("Enter age =");
        int age = scan.nextInt();
        
        scan.nextLine();

        //Address
        System.out.print("Enter address =");
        String Address = scan.nextLine();
        

        //Printing OP
        System.out.println(id+" " + name + " "+  age +" " + Address);

    


    }

}
