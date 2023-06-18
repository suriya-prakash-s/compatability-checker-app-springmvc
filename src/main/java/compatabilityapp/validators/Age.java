package compatabilityapp.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.springframework.validation.annotation.Validated;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AgeValidator.class)
public @interface Age {

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	String message() default "{invalidAgeMessage}";

	int min() default 18;

	int max() default 18;

}
