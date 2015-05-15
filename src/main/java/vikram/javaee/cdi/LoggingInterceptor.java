package vikram.javaee.cdi;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Loggable
public class LoggingInterceptor {
	
	@Inject
	private Logger log;
	
	@AroundInvoke
	public Object logMethod(InvocationContext ic) throws Exception {
		try{
			log.info("Intercepted call to: " + ic.getMethod().getName());
			log.info("Proceeding to: " + ic.getMethod().getName());
			return ic.proceed();
		} finally {
			log.info("Done processing: " + ic.getMethod().getName());
		}
	}

}
