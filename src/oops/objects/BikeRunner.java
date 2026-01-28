package oops.objects;

public class BikeRunner {

    public static void main(String[] args) {
        Bike yamaha = new Bike(200000, "r15");
        // yamaha is a Bike object
        // yamaha is an instance of a Bike

        yamaha.drive(); // instance method

        Bike honda = new Bike(120000, "shine");

        honda.drive();

        BikeRunner runner = new BikeRunner();
        int priceValue = 1000;
        Bike hero = new Bike(100000, "splender");
        runner.changeBikePrice(hero, priceValue);

        System.out.println(hero.model);
        System.out.println(hero.price);
        System.out.println();
        System.out.println("priceValue "+priceValue);
    }

    // pass by value
    // int value direct value like 1000
    // Bike value address of the bike object
    void changeBikePrice(Bike bike, int price) {
        price = price * price;
//        bike = new Bike(123123, "z");
        bike.price = price;
    }

}
