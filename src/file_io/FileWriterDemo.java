package file_io;

import java.io.Console;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileWriterDemo {

    public static void main(String[] args) {
        try (
                FileReader inputStream = new FileReader("src/file_io/xanadu.txt");
                FileWriter outputStream = new FileWriter("src/file_io/characteroutput.txt", true)
        ) {
            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Console console = System.console();
        System.out.println(console);

    }

}
