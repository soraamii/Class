<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 상대 경로 : 현재 작업 디렉토리를 기준으로 파일의 위치를 나타내는 경로
		 현재 작업 디렉토리에서부터 시작 ~ 파일이 위치한 디렉토리까지의 경로  -->
<!-- 절대 경로 : 파일의 위치를 루트 디렉토리부터 전체 경로를 사용하여 나타내는 경로 -->
<% 
	response.sendRedirect("Book/list");

%>