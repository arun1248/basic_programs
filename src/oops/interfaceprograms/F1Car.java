package oops.interfaceprograms;


public class F1Car implements Car {
    @Override
    public void engine() {
        System.out.println("F1Car Engine");
        F1Car car = new F1Car();
        car.someFun();
    }

    @Override
    public int getSeats() {
        return seats;
    }

    @Override
    public void steering() {
        Car.super.steering();
        System.out.println("F1 Car");
    }

    private void someFun() {
        System.out.println("somefun");
    }

}
