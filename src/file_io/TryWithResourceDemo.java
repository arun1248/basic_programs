package file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class TryWithResourceDemo {

    public static void main(String[] args) throws FileNotFoundException {

        try (
                FileInputStream in = new FileInputStream("src/file_io/xanadu.txt");
                FileOutputStream out = new FileOutputStream("src/file_io/outagain.txt")
        ) {
            long startTime = System.currentTimeMillis();
            int c;
            ArrayList<Integer> lst = new ArrayList<>();
            while ((c = in.read()) != -1) {
                lst.add(c);
                System.out.println((char) c);
                out.write(c);
            }
            System.out.println(System.currentTimeMillis() - startTime);
            Collections.sort(lst);
            System.out.println(lst);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("some io ex: " + e.getMessage());
        }

        final BufferedReader reader = new BufferedReader(new FileReader("src/file_io/test.txt"));

        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("can't close manually");
        }

        try(reader) {
            System.out.println("inside try");
        } catch (IOException e) {
            System.out.println("can't read");
        }

    }

}
