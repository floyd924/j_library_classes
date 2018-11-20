import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Book book2;

    @Before
    public void before(){
        library = new Library("Morningside Library");
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
        assertEquals(1, library.countBooks());
    }


}
