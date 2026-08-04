package Day2;

import java.util.Arrays;
import java.util.Scanner;

public class ActivityDay2Q1 {
    public static void main(String[] args) {
        System.out.println("Enter the size: ");
        Scanner scan= new Scanner(System.in);
        int element = scan.nextInt();
        int items[]= new int[element];
        System.out.println("Enter the elements: ");
        for(int i=0;i<items.length;i++){
            items[i]= scan.nextInt();
        }
        scan.nextLine();
        System.out.println("Enter target sum: ");
        int k= scan.nextInt();

        // int items[]={1,5,7,9,2,4};
        int n = items.length;
        Arrays.sort(items);
        System.out.println("Max Element is = "+items[n-1]);
        System.out.println("Min Element is = "+items[0]);
        int count=0;
        for(int i=0; i<items.length-1; i++){
            for(int j=i+1; j<items.length;j++){
                if(items[i]+items[j]==k){
                    count++;
                }
            }
        }
    System.out.println("The number of pairs are = "+count);

    }

}
