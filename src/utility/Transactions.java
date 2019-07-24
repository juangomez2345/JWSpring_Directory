package utility;

import java.util.Date;
import bean.Directory;

public class Transactions {
		
	public static Directory directory01(){
		Directory directory = new Directory();
    	directory.setCategoria("Medicos Cardiologos");
    	directory.setMunicipio("Guadalajara");
    	directory.setNombre_negocio("CARDIOLOGO DR HECTOR GONZALEZ GODINEZ");
    	directory.setNombre_titular("CARDIOLOGO DR HECTOR GONZALEZ GODINEZ");
    	directory.setCodigo_postal("15500");
    	directory.setDireccion("AV IGNACIO ZARAGOZA 66 1, MOCTEZUMA");
    	directory.setTelefono("(55)5286-0876");
    	directory.setCelular("(55)5286-0876");
    	directory.setHorario_atencion("L-V 8-2 y 4-8");
    	directory.setCorreo_electronico("email@01");
    	directory.setDescripcion("Medicos");            	
    	directory.setFecha_registro(new Date().toString());		
	  return directory;
	}
	
	public static Directory directory02(){
		Directory directory = new Directory();
    	directory.setCategoria("Medicos Ginecologos(a)");
    	directory.setMunicipio("Guadalajara");
    	directory.setNombre_negocio("GINECOLOGIA INTEGRAL DRA NELLY GONZALEZ ");
    	directory.setNombre_titular("GINECOLOGIA INTEGRAL DRA NELLY GONZALEZ ");
    	directory.setCodigo_postal("15505");
    	directory.setDireccion("TLAXCALA 90, ROMA SUR");
    	directory.setTelefono("(55)5574-3912");
    	directory.setCelular("(55)5574-3912 ");
    	directory.setHorario_atencion("L-V 8-2 y 4-8");
    	directory.setCorreo_electronico("email@02");
    	directory.setDescripcion("Medicos");            	
    	directory.setFecha_registro(new Date().toString());		
		return directory;
	}
	
	public static Directory directory03(){
		Directory directory = new Directory();
    	directory.setCategoria("Medicos Dentista");
    	directory.setMunicipio("Zapopan");
    	directory.setNombre_negocio("DR. GUILLERMO LUCIO NARANJO RICOY ");
    	directory.setNombre_titular("DR. GUILLERMO LUCIO NARANJO RICOY ");
    	directory.setCodigo_postal("15900");
    	directory.setDireccion("IGNACIO ZARAGOZA 185 CONSULTORIO 103, JARDIN BALBUENA");
    	directory.setTelefono("(55)5785-5779");
    	directory.setCelular("(55)5785-5779");
    	directory.setHorario_atencion("L-V 8-2 y 4-8");
    	directory.setCorreo_electronico("email@03");
    	directory.setDescripcion("Medicos");            	
    	directory.setFecha_registro(new Date().toString());		
		return directory;
	}
	
	public static Directory directory04(){
		Directory directory = new Directory();
    	directory.setCategoria("Medicos Quiropracticos");
    	directory.setMunicipio("Chapala");
    	directory.setNombre_negocio("MEDICO QUIROPRACTICO");
    	directory.setNombre_titular("MEDICO QUIROPRACTICO");
    	directory.setCodigo_postal("06700");
    	directory.setDireccion("DURANGO 33 2 PISO, ROMA NORTE");
    	directory.setTelefono("(55)5514-5473");
    	directory.setCelular("(55)5514-5473");
    	directory.setHorario_atencion("L-V 8-2 y 4-8");
    	directory.setCorreo_electronico("email@04");
    	directory.setDescripcion("Medicos");            	
    	directory.setFecha_registro(new Date().toString()); 		
		return directory;
	}

}
