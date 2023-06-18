package compatabilityapp.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	int min;
	int max;

	@Override
	public void initialize(Age age) {
		this.min = age.min();
		this.max = age.max();
	}

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if (age == null) {
			return false;
		} else if (age < min || age > max) {
			return false;
		}
		return true;
	}

}
