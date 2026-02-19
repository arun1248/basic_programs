package oops.oopstask;

public class Admin extends User {

    public Admin(int userId, String name) {
        super(userId, name);
    }

    @Override
    void displayDetails() {
        System.out.println("userId: "+userId);
        System.out.println("name: "+name);
    }

    void addBook(Library library, Book book) {
        library.addBook(book);
    }

    void removeBook(Library library, Book book) {
        library.removeBook(book);
    }
}
