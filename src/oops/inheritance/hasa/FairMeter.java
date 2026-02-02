package oops.inheritance.hasa;

public class FairMeter {

    float pricePerDistance = 25;

    FairMeter() {
        System.out.println("Fair Meter");
    }

    float calculateFair(float distance) {
        return distance * pricePerDistance;
    }

}
