package bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Directory implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String categoria;
	private String municipio;
	private String nombre_negocio;
	private String nombre_titular;
	private String codigo_postal;
	private String direccion;
	private String telefono;
	private String celular;
	private String horario_atencion;
	private String correo_electronico;
	private String descripcion;
	private String fecha_registro;
	
	private Map<String, String> categorias = new LinkedHashMap<String, String>();
	private Map<String, String> municipios = new LinkedHashMap<String, String>();
		
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getNombre_negocio() {
		return nombre_negocio;
	}
	public void setNombre_negocio(String nombre_negocio) {
		this.nombre_negocio = nombre_negocio;
	}
	public String getNombre_titular() {
		return nombre_titular;
	}
	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}
	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getHorario_atencion() {
		return horario_atencion;
	}
	public void setHorario_atencion(String horario_atencion) {
		this.horario_atencion = horario_atencion;
	}
	public String getCorreo_electronico() {
		return correo_electronico;
	}
	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	
	public Map<String, String> getCategorias() {
		this.categorias = new Category().getCategories();
	  return categorias;
	}
	
	public Map<String, String> getMunicipios() {
		this.municipios = new Municipality().getMunicipalities();
	  return municipios;
	}	
		
}
