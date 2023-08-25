package two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(new BufferedReader((new FileReader("in.txt"))))){

            while (scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);

            }

        }catch (Exception e){
            System.err.println(e.getMessage());

        }

    }
}
