package exception_handling;

import java.util.Scanner;

public class CustomExRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();

        try {
            checkOddNumber(no);
        } catch (OddNumberCheckedException e) {
            System.out.println("Found: " + e.getMessage());
            System.out.println("Enter a new number:");
            no = sc.nextInt();
            // either use a logic common to any number
            // check again if the number is even

            try {
                checkOddNumber(no);
            } catch (OddNumberCheckedException ex) {
                System.out.println("can't go with odd again..");
            }
        }

        int no2 = sc.nextInt();
        try {
            divide(no, no2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (UncheckZeroException e) {
            System.out.println(e.getMessage());
        }

        try {
            divide(no, no2);
        } catch (NullPointerException e) {

        } catch (RuntimeException e) { // UncheckZeroException, ArithmeticException
            System.out.println(e.getMessage());
        }
        /*catch (UncheckZeroException e) {
            System.out.println(e.getMessage());
        }*/

        System.out.println("Enter no3");
        int no3 = sc.nextInt();

        try {
            checkOddNumber(no3);
        } catch (OddNumberCheckedException ex) {
            System.out.println("can't go with odd again for no3..");
        } finally {
            boolean result = isGreater10(no3);
            System.out.println(result);
        }

        try {
            int x = 10 / 0;
        } catch (NullPointerException e) {
            System.out.println("Caught NPE");
        } finally {
            System.out.println("Common logic");
        }

        try {
            int x = 10 / 0;
        } finally {
            System.out.println("Common logic");
        }

        System.out.println("the end");

    }


    static void checkOddNumber(int no) throws OddNumberCheckedException {
        if (no % 2 == 0) {
            System.out.println("no is even");
        } else {
            throw new OddNumberCheckedException("no is not even");
        }
    }

    static void divide(int no1, int no2) throws UncheckZeroException, ArithmeticException {
        if (no2 == 0) {
            throw new ArithmeticException("Dividing no is zero");
        } else if (no1 == 0) {
            throw new UncheckZeroException("one of the no is zero");
        } else {
            System.out.println("result: " + (no1 / no2));
        }
    }

    static boolean isGreater10(int no) {
        return no > 10;
    }
}
