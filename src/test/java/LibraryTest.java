import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library("Morningside Library", 5);
        book = new Book("The Angel Experiment", "James Paterson", "Thriller");
        book2 = new Book("Casino Royale", "Anon.", "Thriller");
    }

    @Test
    public void libraryHasAName(){
        assertEquals("Morningside Library", library.getName());
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void cannotAddBookWhenLibraryIsFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(5, library.countBooks());
    }


}
