package oops.string;

import oops.objectclass.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        // stats, state, tetra, tRt, test
        String name = "nazrin"; // primitive or non-primitive -> non-primitive
        String empID = new String("OKW23");

        System.out.println(name);
        System.out.println(empID);

        for (int i = 0; i < empID.length(); i++) {
            System.out.println(empID.charAt(i));
        }

        System.out.println("name.indexOf(n): "+name.indexOf("n"));
        System.out.println("name.lastIndexOf(n): "+name.lastIndexOf("n"));
        System.out.println("name.contains(a): "+name.contains("a"));

        String s1 = "Hello";
        String s2 = "World";
        String s3 = "Hello";
        String s4 = "hello";

        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // a negative value (e.g., -15 distance bw H and W) because 'H' comes before 'W' in Unicode
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // a negative value (e.g., -32) because 'H' comes before 'h' in Unicode
        System.out.println("s4.compareTo(s1): " + s4.compareTo(s1));

        System.out.println("s1.concat(s2): "+s1.concat(s2));

        System.out.println(s1.replace('l', 'e'));
        System.out.println("state".replaceFirst("t.t", "pac"));

        System.out.println("name.substring(3): "+name.substring(3));
        System.out.println("name.substring(4, 5): "+name.substring(4, 5));

        String words = "stats, state, tetra, tRt, test";

        String[] wordsArr = words.split(", ");
        for (int i = 0; i < wordsArr.length; i++) {
            System.out.println(wordsArr[i]);
        }

        String[] wordsArr1 = words.split("t.t");
        for (int i = 0; i < wordsArr1.length; i++) {
            System.out.println(wordsArr1[i]);
        }

        System.out.println("name.toLowerCase(): "+name.toLowerCase());
        System.out.println("name.toUpperCase(): "+name.toUpperCase());

        System.out.println("name.toCharArray(): "+name.toCharArray());
        System.out.println(name.toCharArray());

        String word = "  word  ";
        System.out.println("word.trim(): "+word.trim());

        String value = String.valueOf(5);
        System.out.println(value+5);

        String test = "test";
        System.out.println("test.matches(t.t): "+test.matches("t.+t"));

        String lit1 = "abc";
        String lit2 = "abc";
        String nonLit = new String("abc");

        System.out.println("lit1 == lit2 "+(lit1 == lit2)); // address comparison
        // only changes this variable value not the all referencing variable values
        // Creates a new object in string constant pool
        // doesn't change the value of existing object
        // and this newly created object is pointed by the variable
        lit2 = "Abc";

        System.out.println("lit1 == lit2 "+(lit1 == lit2));
        System.out.println("lit1 == nonLit "+(lit1 == nonLit));
        System.out.println("lit1.equals(nonLit): "+lit1.equals(nonLit));

        final int a = 10; // immutable
//        a = 11;
        final Laptop laptop = new Laptop(4, "intel", true);
//        laptop = new Laptop(8, "intel", true);
        System.out.println(laptop);
        laptop.setFingerUnlockAvailable(false);
        System.out.println(laptop);

        final ArrayList lst = new ArrayList();
        ArrayList lst1 = new ArrayList();
//        lst = lst1;
        lst.add("s");

        List ls = List.of(1,2,3,4,5);
//        ls.add(15);

        String lit3 = nonLit.intern();
        System.out.println(lit3 == lit1);
    }

}
