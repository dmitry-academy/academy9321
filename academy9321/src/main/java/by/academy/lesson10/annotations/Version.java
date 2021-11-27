package by.academy.lesson10.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public @interface Version {
	String info() ;

	int minArgs() default 0;

	String[] aliases() default {};
}
