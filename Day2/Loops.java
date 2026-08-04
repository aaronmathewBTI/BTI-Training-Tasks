package Day2;

public class Loops {
    public static void main(String[] args) {
        int[] items = {20, 10, 30, 50, 40};
        // items.length returns the size of the items
        for(int index = 0; index < items.length; index++){
            System.out.println(items[index]);
        }
    //enhanced for or for each: automatically begins and ends
    for(int value : items) {
        if(value==30){
            break;
            // continue;

        }
        System.out.println("Value ="+value);
    }

}
}
