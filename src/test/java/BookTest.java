import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("We need to talk about Kevin Bridges", "Kevin Bridges", "biography");
    }

    @Test
    public void bookHasName(){
        assertEquals("We need to talk about Kevin Bridges", book.getName());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Kevin Bridges", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("biography", book.getGenre());
    }
}
