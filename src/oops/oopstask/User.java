package oops.oopstask;

public abstract class User {

    int userId;
    String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    abstract void displayDetails();

}
