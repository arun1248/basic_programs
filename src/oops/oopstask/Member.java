package oops.oopstask;

import java.util.ArrayList;

public class Member extends User {

    // common type meaning we can add any type of object to this list
    ArrayList borrowedBooks;

    public Member(int userId, String name, ArrayList borrowedBooks) {
        super(userId, name);
        this.borrowedBooks = new ArrayList<>();

        System.out.println("this.borrowedBooks: " + this.borrowedBooks);
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i) instanceof Book)
                borrowBook((Book) borrowedBooks.get(i));
        }
    }

    public Member(String name, ArrayList borrowedBooks) {
        this(name.length(), name, borrowedBooks);
    }

    @Override
    void displayDetails() {
        System.out.println("userId: " + userId);
        System.out.println("name: " + name);
        System.out.println("borrowedBooks: " + borrowedBooks.size());
    }

    void borrowBook(Book book) {
        if (book.isAvailable) {
            book.isAvailable = false;
            borrowedBooks.add(book);
        } else {
            System.out.println(book.title + ": " + "is not available");
        }
    }

    void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.isAvailable = true;
            borrowedBooks.remove(book);
        } else {
            System.out.println("Book is not available...");
        }
    }

    void returnBook(int bookId) {
        boolean flag = false;
        for (int i = 0; i < borrowedBooks.size(); i++) {
            if (borrowedBooks.get(i) instanceof Book borrowedBook) {
                if (borrowedBook.bookId == bookId) {
                    borrowedBook.isAvailable = true;
                    borrowedBooks.remove(borrowedBook);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("Book is not available...");
        }

    }

    @Override
    public String toString() {
        return "Member{" +
                "borrowedBooks=" + borrowedBooks +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
