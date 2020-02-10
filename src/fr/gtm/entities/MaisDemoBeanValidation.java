package fr.gtm.entities;

import java.util.Set;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class MaisDemoBeanValidation {

	public static void main(String[] args) {
		

		Contact c1 = new Contact("M", "Alain", null , -3);
		
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<Contact>> violations = validator.validate(c1) ;
		
		if(violations.isEmpty()) {
			System.out.println("pas d'erreurs dans le formulaire");
		
		}
		else {
			violations.forEach(c -> System.out.println(c.getMessage()));
			//System.out.println(violations);
		}
	}

}
