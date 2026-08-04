package Day4;

public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer("Hello");

        //String Buffer is Mutable i.e Changes made in string buffer reflects to the same object
        System.out.println("Buffer 1  : " + buffer1);
        buffer1.append("123");
        System.out.println("Buffer 1 after append : " + buffer1);

        //Reverse method : .reverse() - In Built Method
        System.out.println("Buffer1 after Revesre : " + buffer1.reverse());
        // System.out.println(buffer1);

        //delete = .delete()
        buffer1.delete(0, 3);
        System.out.println("Buffer 1 after deleting : " + buffer1);

        /*
        StringBuffer/StringBuilder-create mutable string object
        String Buffer methods are synchronized which means they are thread safe
        String Buffer methods are not synchronized which are not thread safe
        Thread safe means during concurrent modifcication you don't get unexpected result
         */

    }
}

 