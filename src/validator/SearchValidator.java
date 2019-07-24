package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import bean.Search;

public class SearchValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> type) {
	   return Search.class.isAssignableFrom(type);
	}
 
	@Override
	public void validate(Object command, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "category", "categoria", "campo obligatorio");		
	}
}
