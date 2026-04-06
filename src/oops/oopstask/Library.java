package oops.oopstask;

import collection.User;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> books;
    ArrayList<Member> members;

    public Library(ArrayList<Book> books, ArrayList<Member> members) {
        this.books = books;
        this.members = new ArrayList();
        for (int i = 0; i < members.size(); i++) {
            //if (members.get(i) instanceof Member)
                registerMember(members.get(i));
        }
    }

//    void addBook(Book book) {
//        books.add(book);
//    }
//
//    void removeBook(Book book) {
//        books.remove(book);
//    }

    void registerMember(Member member) {
        // todo add validation for members age
        members.add(member);
    }

    void listBooks(boolean availableOnly) {
        System.out.println("Availability: "+availableOnly);

        for (int i = 0; i < books.size(); i++) {
          //  if (books.get(i) instanceof Book) {
                if (availableOnly) {
                    //Book book = (Book) books.get(i);
                    Book book = books.get(i);
                    if (book.isAvailable) {
                        System.out.println(book.title);
                    } // else do nothing
                } else {
                    System.out.println((books.get(i)).title);
                }
           // }
        }
    }


}
