package vikram.javaee.cdi;

import java.util.logging.Logger;

import javax.inject.Inject;

@EightDigits
public class IssnGenerator implements NumberGenerator {

	@Inject
	private Logger log;
	
	public String generateNumber() {
		log.info("Generating ISBN...");
		String number = "8-"+Math.random();
		log.info("Generated: " + number);
		return (number);
	}

}
