package oops.this_keyword_method_overloading;

public class LaptopStore {

    public static void main(String[] args) {
        Laptop dell = new Laptop((int) 5.0f, 40000, "Aspire");
        dell.displayDetails(); // this here is the current class object
        dell.displayDetails(5);

        Laptop hp = new Laptop();
        Laptop lenova = new Laptop(500L, 50000, "truf");

        System.out.println(dell);
        System.out.println("hp: "+hp);
        System.out.println("lenova: "+lenova);

        dell.displayDetails(dell);

    }
}
