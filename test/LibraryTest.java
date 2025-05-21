import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Test Title", "Author", 2023);
        library.addBook(book);
        assertEquals(1, library.getAllBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Library library = new Library();
        library.addBook(new Book("Test Title", "Author", 2023));
        assertTrue(library.removeBook("test title"));
    }

    @Test
    public void testFindBook() {
        Library library = new Library();
        Book book = new Book("Test Title", "Author", 2023);
        library.addBook(book);
        assertNotNull(library.findBook("TEST TITLE"));
    }

    @Test
    public void testGetAllBooks() {
        Library library = new Library();
        library.addBook(new Book("Title1", "Author1", 2022));
        library.addBook(new Book("Title2", "Author2", 2021));
        assertEquals(2, library.getAllBooks().size());
    }
}
