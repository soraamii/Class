<!-- <%@  %> : 지시자(Directive), JSP 페이지에 대한 설정 정보 정의 
							주로 페이지 지시어나 태그 라이브러리 지시어 사용--> 
							
<!-- <% %> : 스크립트릿, JSP 내에서 Java 코드를 작성할 때 사용 -->
							
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Todo LIST </h1>

<ul>
	
	<c:forEach items="${todoList}" var="todo">
	
	</c:forEach>

</ul>

</body>
</html>