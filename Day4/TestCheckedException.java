package Day4;

import java.io.FileReader;

public class TestCheckedException {

    public static void main(String[] args) {
        try{
        FileReader reader = new FileReader("readme.text");
        int ch = 0;
        // read until the last character, if character not found read returns -1
        while((ch = reader.read()) !=-1){
            System.out.println(ch);
        }
        reader.close();
        System.out.println();
    }

}
}
