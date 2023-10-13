<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap" rel="stylesheet">
<link
   href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
   rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
      <style>
   	body * {
        font-family: 'Jua';
    }
   </style>
</head>
	<%
		request.setCharacterEncoding("UTF-8");
		String line = request.getParameter("line");
		String img = request.getParameter("img");
		String today = request.getParameter("today");
	%>
<body>
	
	<div>
		<h3 style="font-size: 40px;"><%=today %></h3>
		<img src="<%=img%>" style = "border:<%=line%>;margin-top : 100px;">
	</div>
	
	
</body>	
</html>