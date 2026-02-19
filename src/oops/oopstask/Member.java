package oops.oopstask;

import java.util.ArrayList;

public class Member extends User {

    // common type meaning we can add any type of object to this list
    ArrayList borrowedBooks;

    public Member(int userId, String name, ArrayList borrowedBooks) {
        super(userId, name);
        this.borrowedBooks = new ArrayList<>();
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i) instanceof Book)
                borrowBook((Book) borrowedBooks.get(i));
        }
    }

    @Override
    void displayDetails() {
        System.out.println("userId: "+userId);
        System.out.println("name: "+name);
        System.out.println("borrowedBooks: "+borrowedBooks.size());
    }

    void borrowBook(Book book) {
        book.isAvailable = false;
        borrowedBooks.add(book);
    }

    void returnBook(Book book) {
        book.isAvailable = true;
        borrowedBooks.remove(book);
    }

}
