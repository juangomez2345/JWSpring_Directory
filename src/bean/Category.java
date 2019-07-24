package bean;

import java.util.Map;
import java.util.LinkedHashMap;


public class Category {
	
	private Map<String, String> categories = new LinkedHashMap<String, String>();
	
	public Map<String, String> getCategories() {
		categories.put(" ", " ");
		categories.put("Medicos Cardiologos", "Medicos Cardiologos");
		categories.put("Medicos Quiropracticos", "Medicos Quiropracticos");
		categories.put("Medicos Ginecologos(a)", "Medicos Ginecologos(a)");
		categories.put("Hoteles", "Hoteles");
		categories.put("Escuelas, Institutos y Universidades", "Escuelas, Institutos y Universidades");
		categories.put("Dentista", "Dentista");
		categories.put("Computacion accesorios", "Computacion accesorios");
		categories.put("Farmacias", "Farmacias");
	  return categories;
	}

}
