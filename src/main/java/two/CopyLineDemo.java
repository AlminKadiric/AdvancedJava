package two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class CopyLineDemo {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("in.txt"));
            PrintWriter printWriter = new PrintWriter("novi.txt")) {
            String line;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
                printWriter.write(line);

            }

        }catch (Exception e){
            System.err.println(e.getMessage());

        }
    }
}
