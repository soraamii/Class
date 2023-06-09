<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-22
  Time: 오전 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사원 등록</title>
</head>
<body>

<h1>사원 등록</h1>
<hr>
<%-- enctype="multipart/form-data" => HTML <form> 요소의 속성 중 하나임
     => 웹 페이지에서 파일 업로드와 관련된 데이터를 서버로 전송할 때 사용--%>
<form method="post" enctype="multipart/form-data">
    <table>
      <tr>
        <td>사원 이름</td>
        <td><input type="text" name="ename"></td>
      </tr>
      <tr>
        <td>직무</td>
        <td><input type="text" name="job"></td>
      </tr>
      <tr>
        <td>관리자번호</td>
        <td><input type="number" name="mgr"></td>
      </tr>
      <tr>
        <td>입사일</td>
        <td><input type="date" name="hiredate"></td>
      </tr>
      <tr>
        <td>급여</td>
        <td><input type="number" name="sal"></td>
      </tr>
      <tr>
        <td>인센티브</td>
        <td><input type="number" name="comm"></td>
      </tr>
      <tr>
        <td>부서번호</td>
        <td><input type="number" name="deptno"></td>
      </tr>
      <tr>
        <td>첨부파일(이미지)</td>
        <td><input type="file" name="file"></td>
      </tr>
      <tr>
        <td></td>
        <td>
          <input type="submit">
        </td>
      </tr>
    </table>

</form>

</body>
</html>
