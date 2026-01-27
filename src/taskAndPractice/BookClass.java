package taskAndPractice;

public class BookClass {

    String bookName = "Treasure Island";
    String authorName = "Robert Louis";
    int pages = 400;
    int readPages = 350;

    void readPages(int pageCount)
    {
        readPages =  pages-pageCount;
    }

    void bookReadStatus()
    {
        System.out.println(bookName);
        System.out.println(authorName);
        System.out.println(pages);
        System.out.println(readPages);
    }

    public static void main(String[] args)
    {
        BookClass book = new BookClass();
        book.bookReadStatus();
        System.out.println("Status of pages read");
        book.readPages(20);
        book.bookReadStatus();
    }
}
