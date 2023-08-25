package two;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CopyByteDemo {
    public static void main(String[] args) {
        try( FileInputStream fin = new FileInputStream("in.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("new.txt");) {
            int jedanBajt;
            while ((jedanBajt = fin.read())!= -1){
                System.out.print((char) jedanBajt);
                fileOutputStream.write(jedanBajt);

            }




        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
