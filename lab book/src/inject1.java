import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
//import java.lang.annotation.RetentionPolicy;

@Retention(RUNTIME)
public @interface inject1 {
	String value() default "red cap";
}
