package two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannDemo3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new BufferedReader((new FileReader("in.txt"))))) {

            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()){
                    scanner.useLocale(Locale.UK);
               Double number = scanner.nextDouble();
                System.out.println(number);

            }else {
                    scanner.next();
                }
        }

        }catch (Exception e){
            System.err.println(e.getMessage());

        }

    }
}
