package file_io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BufferedByteStreamsDemo {

    public static void main(String[] args) throws FileNotFoundException {

        // 3500
        // r/w 1024 -> buffer full only writes
        // what happens when the buffer is half full or not full and have to write
        // we can call flush when we want to immediately write the changes
        // calling close also calls flush method

        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/file_io/xanadu.txt"));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("src/file_io/outagain.txt"))
        ) {
            long startTime = System.currentTimeMillis();
            int c;
            ArrayList<Integer> lst = new ArrayList<>();
            while ((c = in.read()) != -1) {
                lst.add(c);
                System.out.println((char) c);
                out.write(c);
                out.flush();
            }
            System.out.println(System.currentTimeMillis() - startTime);
            Collections.sort(lst);
            System.out.println(lst);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("some io ex: " + e.getMessage());
        }
    }

}
