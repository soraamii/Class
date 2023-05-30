<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-16
  Time: 오후 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Book List</title>
</head>
<body>

<h1>Book List</h1>
<hr>

<table border="1">
    <tr>
        <th>번호</th>
        <th>책이름</th>
        <th>출판사</th>
        <th>가격</th>
    </tr>

    <c:forEach items="${list}" var="book">

        <tr>
            <td>${book.bookid}</td>
            <td>${book.bookname}</td>
            <td>${book.publisher}</td>
            <td>${book.price}</td>
            <td>
                <a>수정</a>
                <a>삭제</a>
            </td>
        </tr>


    </c:forEach>

</table>

<a href="/book/regist">새 책 등록</a>

</body>
</html>
