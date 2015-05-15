package vikram.javaee.cdi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
@Retention(value=RetentionPolicy.RUNTIME)
public @interface ThirteenDigits {

}
