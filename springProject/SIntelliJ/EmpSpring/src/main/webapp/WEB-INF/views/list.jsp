<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-19
  Time: 오후 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 리스트</title>
</head>
<body>
<h1>사원 리스트</h1>
<hr>
<table border="1">
    <tr>
        <th>사원번호</th>
        <th>이름</th>
        <th>직무</th>
        <th>관리자번호</th>
        <th>입사일</th>
        <th>급여</th>
        <th>인센티브</th>
        <th>부서번호</th>
    </tr>

    <c:forEach items="${list}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td><a href="/read?empno=${emp.empno}">${emp.ename}</a></td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td>
                <a href="/emp/modify?no=${emp.empno}">수정</a>
                <a href="/emp/delete?no=${emp.empno}">삭제</a>
            </td>
        </tr>


    </c:forEach>


</table>

<a href="/registForm">사원 등록</a>
</body>
</html>
