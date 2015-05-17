package github.vikram.cdi;

import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

@ThirteenDigits
@Alternative
public class MockGenerator implements NumberGenerator {
	
	@Inject
	private Logger log;
	
	public String generateNumber() {
		log.info("Generating Mock...");
		String number = "13-Mock-"+Math.random();
		log.info("Generated: " + number);
		return (number);
	}

}
