package oops.interfaceprograms;

public interface Car {

    // interface default method visibility is public
    // variables are default final, static and also public

    int seats = 6;

    // abstract method
    void engine();

    int getSeats();

    static void headLights() {
        System.out.println("Head lights");

        Car c = new F1Car();
        c.steering();
        someLoop();
    }

    private static void someLoop() {
        for (int i = 0; i < 5; i++) {

        }
    }

    default void steering() {
        System.out.println("Steer to Move or turn");
        someLoop();
    }

}
