<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Todo LIST( ${loginInfo.uid} [${loginInfo.uname}] ) </h1>


<ul>
	<c:forEach items="${todoList}" var="todo" >
	
	<li> <a href="${pageContext.request.contextPath}/todo/read?no=${todo.tno}"> ${todo.tno}. ${todo.todo} </a> ${todo.duedate} ${todo.finished ? 'DONE' : 'NOT YET'} </li>
	
	</c:forEach>
</ul>


<a href="${pageContext.request.contextPath}/todo/register">Todo Register</a>

<a href="/app/login"> 로그인 </a>
<a href="/app/logout"> 로그아웃 </a>

</body>
</html>