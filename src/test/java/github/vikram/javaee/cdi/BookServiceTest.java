package github.vikram.javaee.cdi;

import github.vikram.javaee.cdi.Book;
import github.vikram.javaee.cdi.BookService;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class BookServiceTest {
	
	public static void main(String[] args) {
		Weld weld = new Weld();
	    WeldContainer container = weld.initialize();

	    BookService bookService = container.instance().select(BookService.class).get();

	    Book book = bookService.createBook("Lord of The Rings", 49f, "Lord of the Rings - The Fellowship");
	    System.out.println(book);

	    weld.shutdown();
	    System.out.println("Shut down weld!");
	}

}
