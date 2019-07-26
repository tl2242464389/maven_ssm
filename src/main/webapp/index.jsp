<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  </head>
  
  <body>
    <table border="1px">
    	<c:forEach items="${list }" var="student">
    		<tr>
    			<td>${student.id }</td>
    			<td>${student.name }</td>
    			<td>${student.age }</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
