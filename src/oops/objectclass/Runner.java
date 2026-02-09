package oops.objectclass;

public class Runner {

    public static void main(String[] args) {
        Laptop hp = new Laptop(16, "intel", true);

        hp.display();
        System.out.println(hp.toString());

        System.out.println(hp);

        final int size = 10;
        int size1 = 10;
        System.out.println(size1 = 20);
//        System.out.println(size = 20);
    }
}
