package Day2;

public class ActivityDay2Q2 {
    public static void main(String[] args) {
        
        int arr[]={2,-1,3,-6,20,-3,15,-2};

        int positiveCount=0;
        int negativeCount=0;

        // Separate positive and negative integers
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                // positive[positiveCount]= arr[i];
                positiveCount++;
            }else{
                // negative[negativeCount]= arr[i];
                negativeCount++;
            }
        }
        int positive[] = new int[positiveCount];
        int negative[] = new int[negativeCount];

        int tempA=0;
        int tempB=0;

        for(int i=0; i<arr.length;i++){
             if(arr[i]>=0){
                positive[tempA]= arr[i];
                tempA++;
            }else{
                negative[tempB]= arr[i];
                tempB++;
            }
        }
        // Sort positive array
        for(int i = 0; i < positive.length - 1; i++) {
            for(int j = 0; j < positive.length - 1 - i; j++) {
                if(positive[j] > positive[j + 1]) {
                    int temp = positive[j];
                    positive[j] = positive[j + 1];
                    positive[j + 1] = temp;
                }
            }
        }

        // Sort negative array
        for(int i = 0; i < negative.length - 1; i++) {
            for(int j = 0; j < negative.length - 1 - i; j++) {
                if(negative[j] > negative[j + 1]) {
                int temp = negative[j];
                negative[j] = negative[j + 1];
                negative[j + 1] = temp;
                }
            }
        }

        // Print positives
        System.out.print("Positive numbers in ascending order: ");
        for(int i = 0; i < positive.length; i++) {
            System.out.print(positive[i] + " ");
        }

        System.out.println();

        // Print negatives
        System.out.print("Negative numbers in ascending order: ");
        for(int i = 0; i < negative.length; i++) {
        System.out.print(negative[i] + " ");
        }
        
        }



    }
