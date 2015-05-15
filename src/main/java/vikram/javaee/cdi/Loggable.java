package vikram.javaee.cdi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.interceptor.InterceptorBinding;


@InterceptorBinding
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Loggable {

}
