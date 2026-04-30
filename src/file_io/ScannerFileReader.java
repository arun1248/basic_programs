package file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class ScannerFileReader {

    public static void main(String[] args) {
        try(Scanner s = new Scanner(new BufferedReader(new FileReader("src/file_io/xanadu.txt")))) {
            s.useDelimiter(",");
            while (s.hasNext()) {
                System.out.println(s.next()+"-");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        double sum = 0;

        try (Scanner s = new Scanner(new BufferedReader(new FileReader("src/file_io/usnumbers.txt")))) {
//            s.useLocale(Locale.US);

            while (s.hasNext()) {
                if (s.hasNextDouble()) {
                    sum += s.nextDouble();
                } else {
                    s.next();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sum);

        int i = 2;
        double r = Math.sqrt(i);

        System.out.format("The square root of %d is %f.%n", i, r);
    }

}
