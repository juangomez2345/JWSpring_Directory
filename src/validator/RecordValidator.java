package validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import bean.Directory;

public class RecordValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> type) {
	   return Directory.class.isAssignableFrom(type);
	}
 
	@Override
	public void validate(Object command, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "categoria", "categoria", "categoria obligatoria");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "municipio", "municipio", "municipio obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre_negocio", "nombre_negocio", "nombre_negocio obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre_titular", "nombre_titular", "nombre_titular obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "codigo_postal", "codigo_postal", "codigo_postal obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direccion", "direccion", "direccion obligatoria");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "telefono", "telefono", "telefono obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "celular", "celular", "celular obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "horario_atencion", "horario_atencion", "horario_atencion obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "correo_electronico", "correo_electronico", "correo_electronico obligatorio");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descripcion", "descripcion", "descripcion obligatorio");		
	}
	
}
