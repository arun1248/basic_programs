package oops.abstractclass;

public abstract class Auto extends Vehicle {

    public Auto(int regNo) {
        super(regNo);
    }

    protected abstract void start();
    public abstract void stop();
    protected abstract void drive();

    // standard getters and setters

    protected void service() {
        System.out.println("Check Parts");
        System.out.println("Service");
    }
}