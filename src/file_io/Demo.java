package file_io;

import java.io.File;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {
        // full path
//        File file = new File("C:\\Users\\arun.s\\Basic Programs\\src\\file_io\\test.txt");
        // relative path
        File file = new File("src\\file_io\\test.txt");
        File file1 = new File(".\\test1.txt");

        System.out.println(file.exists());

        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                System.out.println(isCreated);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getCanonicalPath());

        System.out.println("-------------------");

        File f1 = new File("src\\file_io\\data\\file.txt");
        File f2 = new File("src\\file_io\\.\\data\\file.txt");
        File f3 = new File("src\\file_io\\logs\\..\\data\\file.txt");
        File f4 = new File("src\\file_io\\..\\test\\data\\file.txt");

        System.out.println("f1.exists(): "+ f1.exists());
        System.out.println("f2.exists(): "+ f2.exists());
        System.out.println("f3.exists(): "+ f3.exists());
        System.out.println("f4.exists(): "+ f4.exists());

        printDetails("f1", f1);
        printDetails("f2", f2);
        printDetails("f3", f3);
        printDetails("f4", f4);

        System.out.println("Hi, \"Nazrin\"");

        System.out.println(new File("src\\file_io\\test.txt").exists());

        boolean createdDir = new File("src\\file_io\\test").mkdir();
        System.out.println(createdDir);


    }

    static void printDetails(String name, File file) throws IOException {
        System.out.println("---- " + name + " ----");
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute: " + file.getAbsolutePath());
        System.out.println("Canonical: " + file.getCanonicalPath());
        System.out.println();
    }

}
