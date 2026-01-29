package oops.staticprogram;

public class BoschEmployee {

    // class is the common place for all the objects created
    // so let's place the common value in class using static
    static String company = "Bosch";

    // called when loading this class in memory
    // loading happens if the class name is used by any running program
    // this used for initialize the static value
    static {
        System.out.println("static block");
//        team();
    }

    // instance specific data
    int salary;
    int id;

    public BoschEmployee(int idVal, int salaryVal) {
        id = idVal;
        salary = salaryVal;
    }

    static void team() {
        System.out.println("static method");
        System.out.println("Bosch Team..");

        // impossible to call a non-static method from a static method because there's no object needed for this static function call
//        displayDetails();
//        System.out.println("id "+id);
    }

    void displayDetails() {
        System.out.println("Company "+company);
        System.out.println("salary "+salary);
        displayID();
        team();
    }

    void displayID() {
        System.out.println("id "+id);
    }

}

