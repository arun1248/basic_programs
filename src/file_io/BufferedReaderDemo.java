package file_io;

import java.io.*;

public class BufferedReaderDemo {

    public static void main(String[] args) {

        try (
                BufferedReader inputStream = new BufferedReader(new FileReader("src/file_io/xanadu.txt"));
//                BufferedWriter outputStream = new BufferedWriter(new FileWriter("src/file_io/characteroutput.txt"));
                PrintWriter outputStream = new PrintWriter(new FileWriter("src/file_io/characteroutput.txt"));
        ) {
            long startTime = System.currentTimeMillis();
            String l;
            while ((l = inputStream.readLine()) != null) {
                System.out.println(l);
//                outputStream.write(l+"\n");
                outputStream.println(l); // writes data to the file
            }
            System.out.println(System.currentTimeMillis() - startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
