package oops.polymorphism;

import oops.objects.Bike;

public class Travels {

    public static void main(String[] args) {
        CarDriver carDriver1 = new CarDriver("ola driver", "TN-1234567", 1000);
        BikeDriver bikeDriver1 = new BikeDriver("rapido driver", "TN-9876543", 100);

        System.out.println(carDriver1);
        System.out.println(bikeDriver1);

        carDriver1.drive();
        bikeDriver1.drive();

        CarDriver carDriver2 = new CarDriver("uber driver", "TN-3245654", 2000);
        BikeDriver bikeDriver2 = new BikeDriver("uber driver", "TN-3446453", 200);

        carDriver1.salary();
        carDriver2.salary();
        bikeDriver1.salary();
        bikeDriver2.salary();

        /*
         *  Driver, BikeDrive, CarDriver
         *  Need to put salary for drivers
         *  instead saying like put salary for BikeDriver and CarDriver we can say put salary for Driver
         *  because putting salary is common for all Driver objects
         * */

        /*
        *  more objects(CarDriver, BikeDriver) of same type is being used to do same task like call salary() we can refer these objects
        *  to its parent type then call the functions on the parent(Driver) type if the functions are overridden in childs that will get called
        *  if not parent's function will get called.
        *
        *  Benefits:
        *   - code readability
        *       - while the code is read we don't have to think about the n of child objects and their unique functions
        *
        *  Drawback:
        *   - can't call the child's unique functions
        * */

        /*
         *  if we are accessing methods that doesn't exist in a parent type
         *  don't need to use polymorphism e.g. bike's wearHelmet()
         * */

        // Driver and driver's subclasses
        System.out.println("put salaries");
        putSalary(carDriver1);
        putSalary(bikeDriver1);
        // Dynamic binding or Runtime polymorphism
        Driver carDriver3 = new CarDriver("uber driver2", "TN234532", 3000);
        carDriver3.salary();

        // type casting child object from parent type
        CarDriver cd = (CarDriver) carDriver3;
        float charges = cd.getDieselCharges();
        System.out.println("charges: "+charges);

        int[] arr = new int[4]; // 0 0 0 0
        int[] arr1 = {1, 2, 3, 4};

        // Dynamic binding
        System.out.println("Using list to call salary()");
        Driver[] drivers = {carDriver1, carDriver2, carDriver3, bikeDriver1, bikeDriver2};
        for (int i=0; i < drivers.length; i++) {
            drivers[i].salary();
        }

        putSalaries(drivers);

        System.out.println("putSalaryAndOtherCharges()");
        Driver carDriver4 = new CarDriver("uber driver3", "TN234222", 4000);
        Driver bikeDriver3 = new BikeDriver("rapido driver2", "TN-3443353", 300);

        putSalaryAndOtherCharges(carDriver4);
        putSalaryAndOtherCharges(bikeDriver3);

    }

    private static void putSalary(Driver driver) {
        driver.salary();
    }

    private static void putSalaries(Driver[] drivers) {
        for (int i=0; i < drivers.length; i++) {
            drivers[i].salary();
        }
    }

    private static void putSalaryAndOtherCharges(Driver driver) {
        driver.salary();
        if (driver instanceof CarDriver) {
            CarDriver carDriver = (CarDriver) driver;
            float dieselCharges = carDriver.getDieselCharges();
            System.out.println("Diesel Charges: "+dieselCharges);
        }
        if (driver instanceof BikeDriver) {
            BikeDriver bikeDriver = (BikeDriver) driver;
            float petrolCharges = bikeDriver.getPetrolCharges();
            System.out.println("Petrol Charges: "+petrolCharges);
        }
    }


}
