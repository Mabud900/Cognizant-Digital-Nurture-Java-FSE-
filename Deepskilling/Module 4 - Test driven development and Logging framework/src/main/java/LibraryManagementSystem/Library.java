package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<String> availableBooks;

    public Library() {
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Book Title can't be null.");
        }
        availableBooks.add(bookTitle);
    }

    public void borrowBook(String bookTitle) {
        if (!availableBooks.contains(bookTitle)) {
            throw new IllegalArgumentException("This book is not available.");
        }
        availableBooks.remove(bookTitle);
    }

    public void returnBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            throw new IllegalArgumentException("Cannot return an unnamed book.");
        }
        availableBooks.add(bookTitle);
    }

    public int getAvailableBookCount() {
        return availableBooks.size();
    }

    public boolean isBookAvailable(String bookTitle) {
        return availableBooks.contains(bookTitle);
    }
}