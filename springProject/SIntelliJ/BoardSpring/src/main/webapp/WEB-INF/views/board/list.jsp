<%--
  Created by IntelliJ IDEA.
  User: hi
  Date: 2023-05-31
  Time: 오후 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>게시판</h1>
  <hr>

  <table border="1">
    <tr>
      <th>번호</th>
      <th>제목</th>
      <th>작성자</th>
      <th>작성일</th>
    </tr>

    <c:forEach items="${list}" var="board">

      <tr>
        <td>${board.bno}</td>
        <td>${board.title}</td>
        <td>${board.wirter}</td>
        <td>${board.regdate}</td>
      </tr>


    </c:forEach>
  </table>

</body>
</html>
