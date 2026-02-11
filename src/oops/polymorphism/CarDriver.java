package oops.polymorphism;

public class CarDriver extends Driver{

    float dieselCharges;

    public CarDriver(String driverName, String licenseNumber, float dieselCharges) {
        super(driverName, licenseNumber);
        this.dieselCharges = dieselCharges;
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("remove hand brake");
        System.out.println("change gear");
        System.out.println("Driving Car..");
    }

    @Override
    void salary() {
        System.out.println("Car Driver Salary: 25000");
    }

    void wearSeatBelt() {
        System.out.println("Wearing seat belts");
    }

    float getDieselCharges() {
        int tips = 200;
        return dieselCharges + tips;
    }

}
