package librarycodeclause;
import java.util.Scanner;
public class LibrarySystem {

    private Library library;

    public LibrarySystem() {
        library = new Library();
    }

    public void issueBook(int bookId) {
        Book book = library.findBook(bookId);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book " + book.getTitle() + " has been issued.");
        } else {
            System.out.println("Book not found or already issued.");
        }
    }

    public void returnBook(int bookId) {
        Book book = library.findBook(bookId);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("Book " + book.getTitle() + " has been returned.");
        } else {
            System.out.println("Book not found or already returned.");
        }
    }

    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();
        librarySystem.library.addBook(new Book(1, "Introduction to Java"));
        librarySystem.library.addBook(new Book(2, "Data Structures and Algorithms"));
        librarySystem.library.addBook(new Book(3, "Object-Oriented Programming"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Display Catalog");
            System.out.println("2. Issue a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    librarySystem.library.displayCatalog();
                    break;
                case 2:
                    System.out.print("Enter the book ID to issue: ");
                    int issueBookId = scanner.nextInt();
                    librarySystem.issueBook(issueBookId);
                    break;
                case 3:
                    System.out.print("Enter the book ID to return: ");
                    int returnBookId = scanner.nextInt();
                    librarySystem.returnBook(returnBookId);
                    break;
                case 4:
                    System.out.println("Exiting the library system.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
