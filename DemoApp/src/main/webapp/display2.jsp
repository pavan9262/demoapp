<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
       <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="str" value="My name is pavan"/>
	
	index : ${fn:indexOf(str,"is")}
	
	<c:if test="${fn:contains(str,'name')}">
		you are right
		</c:if>
	
	<c:forEach items="${fn:split(str,'a'}" var="s">
	
	<br>
	${s}
	
	</c:forEach>
	
	<!--  Length : ${fn:length(str)}-->
	
	
</body>
</html>