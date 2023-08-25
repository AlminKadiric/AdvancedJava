package two;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("in.txt");
             FileWriter fileWriter = new FileWriter("output.txt")) {
            int charOfContent;
            while ((charOfContent = fileReader.read()) != -1){
                System.out.print((char) charOfContent);
                fileWriter.write(charOfContent);
            }


        } catch (Exception e) {
            System.err.println(e.getMessage());

        }
    }
}

