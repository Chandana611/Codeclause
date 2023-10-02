package librarycodeclause;
import java.util.ArrayList;
import java.util.List;


public class Library {

    private List<Book> catalog = new ArrayList<>();

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void displayCatalog() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    public Book findBook(int bookId) {
        for (Book book : catalog) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
