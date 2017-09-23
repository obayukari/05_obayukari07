<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% Integer wordi = (Integer)request.getAttribute("wordi"); %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>1件登録しました。</p>
<p>登録件数は<%= wordi %>です。</p>
<a href = "http://localhost:8080/WebLesson/index.jsp">トップページに戻る</a>
</body>
</html>