package oops.objectclass;

// Diamond problem
// public class Laptop extends Computer, Keyboard {
// Computer -> displayDetails()
// Keyboard -> displayDetails()
// Laptop -> super.displayDetails()
public class Laptop extends Computer {

    boolean isFingerUnlockAvailable;

    public Laptop(int ram, String process, boolean isFingerUnlockAvailable) {
        super(ram, process, 2);
        this.isFingerUnlockAvailable = isFingerUnlockAvailable;
    }

    public void setFingerUnlockAvailable(boolean fingerUnlockAvailable) {
        isFingerUnlockAvailable = fingerUnlockAvailable;
    }

    @Override
    void display() {
        super.display();
        System.out.println(isFingerUnlockAvailable);
        System.out.println(ram);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "isFingerUnlockAvailable=" + isFingerUnlockAvailable +
                ", ram=" + ram +
                ", process='" + process + '\'' +
                '}';
    }
}
