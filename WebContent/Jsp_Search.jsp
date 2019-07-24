<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp_Search</title>
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
  
  <form:form method="Post" commandName="search">
    <table border="0" class="tablestyle">
      <tr><td>&nbsp;</td><td>&nbsp;</td></tr>
      <tr><td>&nbsp;Categoria: </td>
          <td>
            &nbsp;<form:input path="category" />
            &nbsp;<input type="submit" value="search">
            &nbsp;<form:errors path="category" cssClass="errors"/>
          </td>
      </tr>
      <tr><td colspan="2">&nbsp;</td></tr>
    </table>  
  </form:form>
  
  <table border="0" width="50%" >
    <c:forEach var="item" items="${search.directories}">
	  <tr>
	    <td valign="top">
	      <div style="border:0px solid; width:300px;">
		    <table border="0" width="100%" class="tablestyle">
			  <tr><th align="left"><c:out value="${item.nombre_titular}"/></th></tr>
			  <tr><td><c:out value="${item.direccion}"/> ,C.P <c:out value="${item.codigo_postal}"/>, <c:out value="${item.municipio}"/>, Jal </td></tr>
			  <tr><td>Tel: <c:out value="${item.telefono}"/></td></tr>
			  <tr><td>Categoria: <c:out value="${item.categoria}"/></td></tr>
			  <tr><td>Registro: <c:out value="${item.fecha_registro}"/></td></tr>
			</table>
	      </div>
		</td>
	  </tr>
    </c:forEach>
  </table>
  
  <br>&nbsp;<c:out value="${search.msgOperation}"/>  

</body>
</html>