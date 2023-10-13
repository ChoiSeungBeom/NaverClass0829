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
		String name = request.getParameter("name");
		String java = request.getParameter("java");
		String spring = request.getParameter("spring");
		String jsp = request.getParameter("jsp");
		String hp1 = request.getParameter("hp1");
		String hp2 = request.getParameter("hp2");
		
		String tcolor = request.getParameter("tcolor");
		String bcolor = request.getParameter("bcolor");
		
		//점수 계산
		int sum=0;
		double avg=0;
		try{
			sum=Integer.parseInt(java)+Integer.parseInt(jsp)+Integer.parseInt(spring);
			avg=sum/3.0;
			
		}
		catch(NumberFormatException e){
			sum=0;
			avg=0;
		}
	%>
<body>
<div style= "font-size: 22px; background-color:<%=bcolor %>; width: 3000px;">
	<pre style="font-size : 2em;">
이름 : <%= name %>
	
자바 점수: <%= java %> jsp 점수 : <%= jsp %> spring 점수 : <%= spring %>
평균:<%=(avg) %>점 
총점 : <%= avg %>점
번호 : <%= hp1 %>-<%=hp2 %> 
	
<h3 style="color:<%=tcolor%>;"> 색깔 <%=tcolor %> </h3>
	
	
  	

	</pre>
</div>
</body>	
</html>