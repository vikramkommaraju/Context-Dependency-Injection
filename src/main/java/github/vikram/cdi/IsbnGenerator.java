package github.vikram.cdi;

import java.util.logging.Logger;

import javax.inject.Inject;



@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

	@Inject
	private Logger log;
	
	public String generateNumber() {
		log.info("Generating ISBN...");
		String number = "13-"+Math.random();
		log.info("Generated: " + number);
		return (number);
	}

}
