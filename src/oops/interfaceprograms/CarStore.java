package oops.interfaceprograms;

public class CarStore {

    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.engine();
        System.out.println(sportsCar.getSeats());

        Car f1Car = new F1Car();
        f1Car.engine();
        System.out.println(f1Car.getSeats());
        System.out.println(Car.seats);

//        Car car = new Car();
//        car.engine();

        Car.headLights(); // just like normal static method we can call using Interface name. Override not possible
        f1Car.steering(); // use object to call a default method form interface. Override is possible

    }

    void displayCar(Car car) {

    }
}
