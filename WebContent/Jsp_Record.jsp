<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp_Record</title>
<style> .tablestyle{  font-family: Verdana,Arial,sans-serif; font-size: .8em; } .errors { color: red; }</style>
</head>
<body style="margin-top:0px; margin-right:0px; margin-bottom:0px; margin-left:0px">

  <table border="0" width="100%" height="30px">
    <tr>
      <td>
        &nbsp;&nbsp;&nbsp;<a href="Index.sp">Index</a>
    	&nbsp;&nbsp;&nbsp;<a href="AddDirectory.sp">Record</a>
    	&nbsp;&nbsp;&nbsp;<a href="SearchDirectory.sp">Search</a>
      </td>
    </tr>
  </table>
  
  <form:form method="Post" commandName="directory">
    <table border="0" class="tablestyle">
      <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
      <tr><td>&nbsp;Categoria: </td>
          <td>
		    <form:select path="categoria">
		      <form:options items="${directory.categorias}"/>
		    </form:select>
		    &nbsp;<form:errors path="categoria" cssClass="errors"/>
          </td>
      </tr>
      <tr><td>&nbsp;Municipio: </td>
          <td>
		    <form:select path="municipio">
		      <form:options items="${directory.municipios}"/>
		    </form:select>
		    &nbsp;<form:errors path="municipio" cssClass="errors"/>
          </td>
      </tr>
      <tr><td>&nbsp;Nombre_negocio: </td><td><form:input path="nombre_negocio" />&nbsp;<form:errors path="nombre_negocio" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Nombre_titular: </td><td><form:input path="nombre_titular" />&nbsp;<form:errors path="nombre_titular" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Codigo_postal: </td><td><form:input path="codigo_postal" />&nbsp;<form:errors path="codigo_postal" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Direccion: </td><td><form:input path="direccion" />&nbsp;<form:errors path="direccion" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Telefono: </td><td><form:input path="telefono" />&nbsp;<form:errors path="telefono" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Celular: </td><td><form:input path="celular" />&nbsp;<form:errors path="celular" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Horario_atencion: </td><td><form:input path="horario_atencion" />&nbsp;<form:errors path="horario_atencion" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;Correo_electronico: </td><td><form:input path="correo_electronico" />&nbsp;<form:errors path="correo_electronico" cssClass="errors"/></td></tr>  	
      <tr><td>&nbsp;Descripcion: </td><td><form:input path="descripcion" />&nbsp;<form:errors path="descripcion" cssClass="errors"/></td></tr>
      <tr><td>&nbsp;</td><td><input type="submit" value="save"></td></tr>
    </table>  
  </form:form>
  
  <!-- msg proveniente de un atributo en el request de RecordServiceImpl -->
  <br>&nbsp;<c:out value="${msgRecord}"></c:out>

</body>
</html>