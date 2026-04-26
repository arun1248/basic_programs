package exception_handling;

import oops.objectclass.Laptop;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo {
    /*
     * Run time exception (un-checked)
     *   - while program is running and if an exception happens it's runtime exception
     * Compile time exception (checked)
     *   - while writing a program or compiling a program this type of exception is happening
     * */
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        try {
            FileReader file1 = new FileReader("C:\\Users\\arun.s\\Basic Programs\\src\\exception_handling\\test.txt");
            FileReader file2 = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) { // method(FileNotFoundException e)
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            methodA();
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught in main()");
            e.printStackTrace(); // This prints full stack trace
        }

        try {
            CheckExDemo checkExDemo = new CheckExDemo();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end");
    }

    static void methodA() throws FileNotFoundException {
        System.out.println("Inside methodA()");
        methodB();
    }

    static void methodB() throws FileNotFoundException {
        System.out.println("Inside methodB()");
//        methodC();
        methodD();
    }

    static void methodC() throws FileNotFoundException {
        System.out.println("Inside methodC()");

        // This will throw a checked exception
        FileReader file = new FileReader("non_existing_file.txt");
//        runtimeException();
    }

    static void methodD() throws NullPointerException {
        System.out.println("Inside methodC()");

        runtimeException();
    }

    private static void runtimeException() {
        Demo demo = new Demo();
        Laptop laptop1 = new Laptop(12, "intel", true);
        Laptop laptop = null;
        laptop.setFingerUnlockAvailable(false);
    }

}
