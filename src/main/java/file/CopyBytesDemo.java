package file;


// byte po byte

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytesDemo {
    public static void main(String[] args) {





        try( FileInputStream inputStream = new FileInputStream("in.txt");
             FileOutputStream outputWriter = new FileOutputStream("out.txt");) {


            int dataByte;
            while ((dataByte=inputStream.read())!= -1){
                System.out.print((char)dataByte);
                outputWriter.write(dataByte);

            }

        } catch (IOException e) {
            System.out.println(e.getMessage());


        }


    }
}
