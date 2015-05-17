package github.vikram.cdi;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class LoggingProducer {
	
	@Produces
	public Logger produceLogger(InjectionPoint api) {
		System.out.println("Getting logger for: " + api.getMember().getDeclaringClass().getName());
		Logger log = Logger.getLogger(api.getMember().getDeclaringClass().getName());
		return log;
	}

}
