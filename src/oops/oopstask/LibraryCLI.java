package oops.oopstask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibraryCLI {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Book Details");

            int bookId = Integer.parseInt(sc.nextLine());
            String title = sc.nextLine();
            String author = sc.nextLine();
            boolean isAvailable = true;

            Book book = new Book(bookId, title, author, isAvailable);
            books.add(book);

            System.out.println("Press q to stop, Enter to continue");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
        }
        System.out.println("Before sorting : "+books);
        Collections.sort(books);
        System.out.println("After sorting : "+books);

        ArrayList<Member> members = new ArrayList();

//        Member member = new Member("arun", books);

        while (true) {
            System.out.println("Enter Member Details");

            String name = sc.nextLine();

            System.out.println("Enter books to borrow:");
            System.out.println("press q to quit or c to continue");
            String userChoice = sc.nextLine();
            if (userChoice.equals("q")) {
                members.add(new Member(name, new ArrayList()));
                break;
            } else if (userChoice.equals("c")) {
                ArrayList<Book> borrowedBooks = new ArrayList();

                while (true) {
                    System.out.println("Enter book id");

                    int bookId = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < books.size(); i++) {
                        //if (books.get(i) instanceof Book book) {
                        Book book = books.get(i);
                            if (book.bookId == bookId) {
                                borrowedBooks.add(books.get(i));
                            }
                        //}
                    }
                    // add a print to say if book id is not available

                    System.out.println("Press q to stop, Enter to continue");
                    String input = sc.nextLine();
                    if (input.equals("q")) {
                        members.add(new Member(name, borrowedBooks));
                        break;
                    }
                }
            }

            System.out.println("Press q to stop, Enter to continue");
            String input = sc.nextLine();
            if (input.equals("q")) {
                break;
            }
        }

        System.out.println("members: "+members);

        Library annaLibrary = new Library(books, members);
        Admin admin = new Admin(22, "Muthu");

        annaLibrary.listBooks(false);

    }

}
