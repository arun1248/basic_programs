package file_io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileReaderDemo {

    public static void main(String[] args) {
        // reads data by using 2 bytes unlike byte streams which uses 1 byte
        try (
                FileReader inputStream = new FileReader("src/file_io/xanadu.txt");
                FileWriter outputStream = new FileWriter("src/file_io/characteroutput.txt")
        ) {
            long startTime = System.currentTimeMillis();
            int c;
            ArrayList<Integer> lst = new ArrayList<>();
            while ((c = inputStream.read()) != -1) {
                lst.add(c);
                System.out.println((char) c);
                outputStream.write(c);
            }
            System.out.println(System.currentTimeMillis() - startTime);
            Collections.sort(lst);
            System.out.println(lst);
            System.out.println(lst.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
