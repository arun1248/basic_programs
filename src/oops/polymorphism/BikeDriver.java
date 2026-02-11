package oops.polymorphism;

public class BikeDriver extends Driver {

    float petrolCharges;

    public BikeDriver(String driverName, String licenseNumber, float petrolCharges) {
        super(driverName, licenseNumber);
        this.petrolCharges = petrolCharges;
    }

    @Override
    void drive() {
        super.drive();
        System.out.println("remove stands");
        System.out.println("change gear");
        System.out.println("Driving Bike..");
    }

    @Override
    void salary() {
        System.out.println("Bike Driver Salary: 15000");
    }

    void wearHelmet() {
        System.out.println("Wearing helmet...");
    }

    float getPetrolCharges() {
        int tips = 100;
        return petrolCharges + tips;
    }

}
