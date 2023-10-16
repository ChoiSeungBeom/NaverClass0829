<%@page import="myshop.data.MyShopDto"%>
<%@page import="myshop.data.MyShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<%


	//한글 엔코딩
	request.setCharacterEncoding("UTF-8");
	
	//dao,dto 선언
	MyShopDao dao= new MyShopDao();
	
	//입력값을 읽어서 dto에 담기
	MyShopDto dto = new MyShopDto();
	
	String sangpum = request.getParameter("sangpum");
	String color=request.getParameter("color");
	String photo = request.getParameter("photo");
	int price= Integer.parseInt(request.getParameter("price"));
	
	dto.setSangpum(sangpum);
	dto.setColor(color);
	dto.setPhoto(photo);
	dto.setPrice(price);
	
	//update 메서드 호출(db저장)
	dao.updateShop(dto);

	//목록 페이지로 이동(redirect)
	response.sendRedirect("myshop.jsp");
	
	
%>