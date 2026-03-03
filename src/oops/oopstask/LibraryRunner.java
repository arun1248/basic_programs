package oops.oopstask;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryRunner {

    public static void main(String[] args) {

        ArrayList books = new ArrayList();

        Book lostKingdom = new Book(1, "The Lost Kingdom", "Arun Kumar", true);
        Book javaBasics = new Book(2, "Java Basics", "Ravi Shankar", true);
        Book mysteryOfTheNight = new Book(3, "Mystery of the Night", "Priya Nair", true);
        Book dataStructures = new Book(4, "Data Structures Made Easy", "Suresh Babu", true);
        Book finalJourney = new Book(5, "The Final Journey", "Meena Das", true);

        books.add(lostKingdom);
        books.add(javaBasics);
        books.add(mysteryOfTheNight);
        books.add(dataStructures);
        books.add(finalJourney);

        ArrayList members = new ArrayList();

        ArrayList borrowedListRaj = new ArrayList();
        borrowedListRaj.add(lostKingdom);
        borrowedListRaj.add(javaBasics);

        Member raj = new Member(11, "Raj", borrowedListRaj);

        ArrayList borrowedListRaja = new ArrayList();
        borrowedListRaja.add(mysteryOfTheNight);
        Member raja = new Member(11, "Raj", borrowedListRaja);

        members.add(raj);
        members.add(raja);

        Library annaLibrary = new Library(books, members);
        Admin admin = new Admin(22, "Muthu");

        // adding new book
        Book codeBook = new Book(6, "Code", "Charles Petzold", true);
        admin.addBook(annaLibrary, codeBook);
        System.out.println("*After Add: ");
        annaLibrary.listBooks(false);

        // removing a book
        admin.removeBook(annaLibrary, finalJourney);
        System.out.println("*After Remove: ");
        annaLibrary.listBooks(false);

        // checking available books
        System.out.println("*Checking Availability after members creation");
        annaLibrary.listBooks(true);

        // returning a book from member
        System.out.println("*Returning Book from a member");
        raja.returnBook(mysteryOfTheNight);
        annaLibrary.listBooks(true);

        // Borrow Book
        System.out.println("*Borrowing Book from a member");
        raja.borrowBook(lostKingdom);
        annaLibrary.listBooks(true);


        /*
        *  show the possible actions using sout as 1, add a book. 2, remove a book. etc.,
        *  get the value from user (1 to 5)
        *  use a switch case -> if 1: get book details, if 2: get book id to remove the book
        *       -> use id's to perform action like remove, return and borrow
        *       -> overload existing functions
        * */


        ArrayList borrowedBooksNazrin = new ArrayList();
        borrowedBooksNazrin.add(dataStructures);
        Member nazrin = new Member("Nazrin", borrowedBooksNazrin);

        annaLibrary.listBooks(true);

        System.out.println("Welcome to Member CLI");
        System.out.println("1, borrow a book");
        System.out.println("2, return a book");

        Scanner sc = new Scanner(System.in);
        int userOption = Integer.parseInt(sc.nextLine());

        switch (userOption) {
            case 1: {
                annaLibrary.listBooks(true);
                System.out.println("Enter book id to borrow:");
                int borrowBookId = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < annaLibrary.books.size(); i++) {
                    if (annaLibrary.books.get(i) instanceof Book book) {
                        if (book.bookId == borrowBookId) {
                            nazrin.borrowBook(book);
                        }
                    }
                }
                break;
            }
            case 2: {
                System.out.println("Enter book id to return");
                int returnBookId = Integer.parseInt(sc.nextLine());
                nazrin.returnBook(returnBookId);
                break;
            }
            default: {
                System.out.println("Invalid number");
            }
        }

        annaLibrary.listBooks(true);

    }
}
