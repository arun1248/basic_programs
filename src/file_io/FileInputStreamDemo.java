package file_io;

import javax.annotation.processing.FilerException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//https://docs.oracle.com/javase/tutorial/essential/io/index.html
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src/file_io/xanadu.txt");
            out = new FileOutputStream("src/file_io/outagain.txt");
            int c;
            ArrayList<Integer> lst = new ArrayList<>();
            while ((c = in.read()) != -1) {
                lst.add(c);
                System.out.println((char) c);
                out.write(c);
            }
            Collections.sort(lst);
            System.out.println(lst);
            System.out.println(lst.size());
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("some io ex: " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("can't close in");
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("can't close out");
                }
            }
        }

        // in.read(); // Stream Closed
    }

}
