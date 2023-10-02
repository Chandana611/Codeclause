package librarycodeclause;

public class Book {
    private int bookId;
    private String title;
    private boolean isAvailable;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Available: " + isAvailable;
    }
}
