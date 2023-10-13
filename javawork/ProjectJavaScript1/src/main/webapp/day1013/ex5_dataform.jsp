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

<body>
	<h5>폼태그 action으로 읽기</h5>
	<form action="./ex5_dataread.jsp" method="get"> <!-- get방식으로 호출하면 key, value 값이 공개되기 때문에 검색할때 사용, login같은경우는 post방식으로 사용 -->
		이름 : <input type="text" name="irum"><br>
		페이지번호 : <input type="number" name="currentPage" value="1"><br>
		메시지 : <input type="text" name="message"><br>
		<button type="submit">서버로 전송</button> <!-- type을 버튼으로 주면 값이 서버로 전송이 안됨(submit으로 할 것) -->
	</form> 
</body>	
</html>


