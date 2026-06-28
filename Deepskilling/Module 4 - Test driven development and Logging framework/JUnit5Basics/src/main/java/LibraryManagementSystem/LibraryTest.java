package LibraryManagementSystem;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    //Text fixture
    private Library library;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        library=new Library();
        library.addBook("Rich Dad, Poor Dad");
        library.addBook("Functional Programming in Java");
        System.out.println("setup: Library initialized with 2 books");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        //cleanup resources
        library=null;
        System.out.println("Teardown: Library reference cleared\n");
    }

    @org.junit.jupiter.api.Test
    void addBook() {
        //Arrange
        String newBook="Introduction to Languages\n" +
                "and The Theory of\n" +
                "Computation";

        //Act
        int expectedCount=3;

        //Assert
        assertEquals(expectedCount,library.getAvailableBookCount());
        assertFalse(library.isBookAvailable(newBook));

    }

    @org.junit.jupiter.api.Test
    void borrowBook() {
        //Arrange
        String bookToBorrow="Rich Dad, Poor Dad";
        int expectedCount=1;

        //Act
        library.borrowBook(bookToBorrow);

        //Assert
        assertEquals(expectedCount,library.getAvailableBookCount());
        assertFalse(library.isBookAvailable(bookToBorrow));
    }

    @org.junit.jupiter.api.Test
    void returnBook() {
        //Arrange
        String bookToReturn="Effective Java";
        int expectedCount=3;

        //Act
        library.returnBook(bookToReturn);

        //Assert
        assertEquals(expectedCount,library.getAvailableBookCount());
        assertTrue(library.isBookAvailable(bookToReturn));
    }

    @org.junit.jupiter.api.Test
    void getAvailableBookCount() {
        //Arrange
        //Library already has 2 books setup()
        int expectedInitialCount=2;

        //Act
        int actualCOunt= library.getAvailableBookCount();

        //Assert
        assertEquals(expectedInitialCount,actualCOunt);
    }

    @org.junit.jupiter.api.Test
    void isBookAvailable() {
        //Arrange
        String existingBook="Rich Dad, Poor Dad";
        String missingBook="Dune";

        //Act
        boolean isExistingAvailable= library.isBookAvailable(existingBook);
        boolean ismissinAvailable= library.isBookAvailable(missingBook);

        //Assert
        assertTrue(isExistingAvailable);
        assertTrue(ismissinAvailable);
    }
}