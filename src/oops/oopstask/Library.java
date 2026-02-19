package oops.oopstask;

import java.util.ArrayList;

public class Library {

    ArrayList books;
    ArrayList members;

    public Library(ArrayList books, ArrayList members) {
        this.books = books;
        this.members = members;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void removeBook(Book book) {
        books.remove(book);
    }

    void registerMember(Member member) {
        members.add(member);
    }

    void listBooks(boolean availableOnly) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i) instanceof Book) {
                if (availableOnly) {
                    System.out.println(((Book) books.get(i)).title);
                } else {
                    System.out.println(((Book) books.get(i)).title);
                }
            }
        }
    }

}
