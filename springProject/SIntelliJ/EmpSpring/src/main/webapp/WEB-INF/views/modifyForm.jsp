<%--
  Created by IntelliJ IDEA.
  User: thfka
  Date: 2023-05-22
  Time: 오후 7:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>사원 정보 수정</title>
    <style>

        td {
            padding: 10px 20px;
        }

    </style>
</head>
<body>

    <h1>사원 정보 수정</h1>
    <hr>

    <form method="post" enctype="multipart/form-data">
        <input type="hidden" name="empno" value="${emp.empno}">

        <table border="1">
            <tr>
                <td>사원 번호</td>
                <td><input type="number" name="empno" value="${emp.empno}"></td>
            </tr>
            <tr>
                <td>이름</td>
                <td><input type="text" name="ename" value="${emp.ename}"></td>
            </tr>
            <tr>
                <td>직무</td>
                <td><input type="text" name="job" value="${emp.job}"></td>
            </tr>
            <tr>
                <td>관리자번호</td>
                <td><input type="number" name="mgr" value="${emp.mgr}"></td>
            </tr>
            <tr>
                <td>입사일</td>
                <td><input type="date" name="hiredate" value="${emp.hiredate}"></td>
            </tr>
            <tr>
                <td>급여</td>
                <td><input type="number" name="sal" value="${emp.sal}"></td>
            </tr>
            <tr>
                <td>인센티브</td>
                <td><input type="number" name="comm" value="${emp.comm}"></td>
            </tr>
            <tr>
                <td>부서번호</td>
                <td><input type="number" name="deptno" value="${emp.deptno}"></td>
            </tr>
            <tr>
                <td>첨부된 파일</td>
                <td>
                    <c:if test="${emp.file ne null}">

                        <input type="hidden" name="oldfile" value="${emp.file}">
                        ${emp.file}
                    </c:if>
                </td>
            </tr>
            <tr>
                <td>첨부 파일</td>
                <td>
                    <input type="file" name="file">
                </td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="수정"></td>
            </tr>
        </table>

    </form>

</body>
</html>
