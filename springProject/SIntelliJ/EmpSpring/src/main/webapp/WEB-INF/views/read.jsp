<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-28
  Time: 오후 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 정보 확인</title>
</head>
<body>

    <h1>사원 정보 확인</h1>
    <hr>
    <table border="1">
        <tr>
            <td>사원 번호</td>
            <td>${article.empno}</td>
        </tr>
        <tr>
            <td>이름</td>
            <td>${article.ename}</td>
        </tr>
        <tr>
            <td>직무</td>
            <td>${article.job}</td>
        </tr>
        <tr>
            <td>관리자번호</td>
            <td>${article.mgr}</td>
        </tr>
        <tr>
            <td>입사일</td>
            <td>${article.hiredate}</td>
        </tr>
        <tr>
            <td>급여</td>
            <td>${article.sal}</td>
        </tr>
        <tr>
            <td>인센티브</td>
            <td>${article.comm}</td>
        </tr>
        <tr>
            <td>부서번호</td>
            <td>${article.deptno}</td>
        </tr>
       <c:if test="${article.file ne null}">

            <tr>
                <td>첨부파일</td>
                <td>
                    <img src="/uploadfile/${article.file}" width="300">
                </td>
            </tr>

       </c:if>

    </table>

    <a href="/emp/list">LIST</a>
    <a href="/emp/modify?no=${article.empno}">수정</a>
    <a href="/emp/delete?no=${article.empno}">삭제</a>


</body>
</html>
