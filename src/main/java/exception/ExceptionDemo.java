package exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Unesite neki broj....");
        int [] numbers = new int[3];
        int number = new Scanner(System.in).nextInt();
      numbers[3] = number;
        System.out.println("Uneseni broj je: " + number);

        try {
            readFile("hamo.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }

    static void readFile(String imeFajla) throws FileNotFoundException {
        //blok code koji se kaci na neki file

    }
}
