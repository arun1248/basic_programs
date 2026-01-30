package oops.this_keyword_method_overloading;

public class Laptop {

    int price;
    String model;
    int id;

    /* this keyword
    * current class object or current class instance
    * this itself is an object
    * this is a current invoking(calling) object
    * */

    public Laptop(int idVal, int priceVal, String modelVal) {
        price = priceVal;
        model = modelVal;
        id = idVal;
        System.out.println("int, int, String");
    }

    public Laptop(long id, int price, String model) {
        // this here is a newly created empty object
        this.price = price;
        this.id = (int) id;
        this.model = model;
        System.out.println("long, int, String");
    }

    public Laptop(double id, int price, String model) {
        this((long) id, price, model);
        System.out.println("double, int, String");
    }

    // no-argument constructor
    public Laptop() {
        System.out.println("no argument");
    }

    // Method Overloading
    /*
    * method name is same but the no of parameter or type of parameters is different
    * having a same method name with different parameters makes the function behave differently
    * this is one kind of polymorphism (static polymorphism) e.g. String.valueOf()
    */

    void displayDetails() {
        System.out.println(this);
        System.out.println(model);
    }

    void displayDetails(int id) {
        System.out.println(this);
        if (id == 0) {
            System.out.println("no laptop present");
        } else {
            System.out.println(model);
            System.out.println(price);
            System.out.println(id);
        }
    }

    void displayDetails(Laptop laptop) {
        System.out.println("this == laptop "+(this == laptop));
        this.displayDetails();
    }

}
