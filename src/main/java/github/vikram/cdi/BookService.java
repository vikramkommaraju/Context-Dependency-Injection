package github.vikram.cdi;


import java.util.logging.Logger;

import javax.inject.Inject;

@Loggable
public class BookService {
	
	
	@Inject
	private Logger log;
	
	@Inject @ThirteenDigits
	private NumberGenerator numGenerator;
	
	public Book createBook(String title, Float price, String description){
		
		log.info("Creating book...");
		String number = numGenerator.generateNumber();
		Book book = new Book(title, price, description, number);
			
		return book;
		
	}

}
