package bean;

import java.util.Map;
import java.util.LinkedHashMap;


public class Municipality {
	
	private String state = "Jal";
	private Map<String, String> municipalities = new LinkedHashMap<String, String>();
		
	public String getState() {
		return state;
	}
	
	public Map<String, String> getMunicipalities() {
		municipalities.put(" ", " ");
		municipalities.put("Acatic", "Acatic");
		municipalities.put("Ameca", "Ameca");
		municipalities.put("Arandas", "Arandas");
		municipalities.put("Atotonilco el Alto", "Atotonilco el Alto");
		municipalities.put("Casimiro Castillo", "Casimiro Castillo");
		municipalities.put("Chapala", "Chapala");
		municipalities.put("El Salto", "El Salto");
		municipalities.put("Guadalajara", "Guadalajara");
		municipalities.put("La Barca", "La Barca");
		municipalities.put("La Manzanilla de la Paz", "La Manzanilla de la Paz");
		municipalities.put("Lagos de Moreno", "Lagos de Moreno");
		municipalities.put("Mazamitla", "Mazamitla");
		municipalities.put("San Juan de los Lagos", "San Juan de los Lagos");
		municipalities.put("Sayula", "Sayula");
		municipalities.put("Tapalpa", "Tapalpa");
		municipalities.put("Tequila", "Tequila");
		municipalities.put("Tlajomulco de Zuñiga", "Tlajomulco de Zuñiga");
		municipalities.put("Tlaquepaque", "Tlaquepaque");
		municipalities.put("Tonala", "Tonala");
		municipalities.put("Zapopan", "Zapopan");
		municipalities.put("Zapotlanejo", "Zapotlanejo");
	  return municipalities;
	}
	
}
