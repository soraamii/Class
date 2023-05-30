<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-21
  Time: 오후 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>책 등록</title>
</head>
<body>

<h1>책 등록</h1>
<hr>

<%--form 태그 : 사용자로부터 정보를 입력받아 서버로 전송하기 위한 HTML 요소--%>
  <form method="post">
    <table>
      <tr>
        <td>책 이름</td>
        <td><input type="text" name="bookname"></td>
      </tr>
      <tr>
        <td>출판사 이름</td>
        <td><input type="text" name="publisher"></td>
      </tr>
      <tr>
        <td>가격</td>
        <td><input type="number" name="price"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit"></td>
      </tr>
    </table>
  </form>

</body>
</html>
