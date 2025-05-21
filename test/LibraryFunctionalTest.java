import org.junit.jupiter.api.Test;

public class LibraryFunctionalTest {

    @Test
    public void functionalScenario() {
        Library library = new Library();
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("Dune", "Frank Herbert", 1965));
        library.removeBook("1984");

        for (Book book : library.getAllBooks()) {
            System.out.println(book);
        }
    }
}
