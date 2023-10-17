<%@page import="simpleboarddata.SimpleBoardDto"%>
<%@page import="simpleboarddata.SimpleBoardDao"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	MultipartRequest multipartRequest = null;
	
	String realPath=getServletContext().getRealPath("/save");
	System.out.println("path="+realPath);
	int uploadSize=1024*1024*5;//5mb
	try{
		multipartRequest = new MultipartRequest(request,realPath,uploadSize,"utf-8",new DefaultFileRenamePolicy());
		
		//dao,dto 선언
		SimpleBoardDao dao = new SimpleBoardDao();
		SimpleBoardDto dto = new SimpleBoardDto();
		//데이터 읽기(파일 포함)
		String writer=multipartRequest.getParameter("writer");
		String subject=multipartRequest.getParameter("subject");
		String content=multipartRequest.getParameter("content");
		String num = multipartRequest.getParameter("num");
		
		//업로드된 실제 파일명, 업로드 안햇을경우 null
		String photo=multipartRequest.getFilesystemName("upload");
		
		//dto에 넣기
		dto.setNum(num);
		dto.setWriter(writer);
		dto.setContent(content);
		dto.setSubject(subject);
		dto.setPhoto(photo); // 사진수정 안했을경우 null 값
		
		//update 메서드 호출
		dao.updateBoard(dto);
		
		//content.jsp로 이동 content는 num값이 필요함(그래야지 해당글을 가져옴)
		response.sendRedirect("content.jsp?num="+num);
		
	} catch(Exception e){
		out.print("<h3>파일 업로드 오류 발생:"+e.getMessage()+"</h3>");
		
	}
	
%>
