<%@page import="java.lang.ProcessBuilder.Redirect"%>
<%@page import="simpleboarddata.SimpleBoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%

	//num
	String num = request.getParameter("num");
	//dao
	SimpleBoardDao dao = new SimpleBoardDao();
	//delete 메서드 호출
	dao.deleteboard(num);
	//list.jsp로 이동
	response.sendRedirect("list.jsp");
		
%>