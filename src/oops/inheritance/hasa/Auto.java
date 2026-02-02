package oops.inheritance.hasa;

public class Auto {

    // not an object, for object initialization
    Auto() {
        System.out.println("Auto");
    }

    // Auto has a Fair meter
    // instance variable
    FairMeter fairMeter = new FairMeter(); // global variable

    public static void main(String[] args) {
        Auto auto = new Auto();
        float price = auto.fairMeter.calculateFair(7.5F);
        System.out.println(price);
        auto.parkAuto();
    }

    // instance or object method
    void parkAuto() {
        boolean isAutoParked = false; // local variable -> memory valid while the function is running and removed after
        System.out.println("Parking lights");
    }

    void baseFair() {
        System.out.println(fairMeter.pricePerDistance);
    }
}
