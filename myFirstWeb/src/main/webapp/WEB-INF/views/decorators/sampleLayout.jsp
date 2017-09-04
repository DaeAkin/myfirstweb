<%@page import="org.apache.velocity.runtime.directive.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@ taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>



<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title></title>
<!-- CSS -->
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/joinform.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/board.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/view.css">


</head>
<body>

	<div id="container">

		<div class="ui1">
			<%@include file="myNav1.html"%>
		

		</div>

		<div class="ui2">
			<%@include file="myNav2.jsp"%>




		</div>



		<div id="sidebar">

			<%@include file="myside.jsp"%>

		</div>



	


		<div id="contents">
			<decorator:body></decorator:body>
</div>




	



		<div id="footer">
			<footer>
				<%@include file="footer.html"%>
			</footer>



		</div>
	</div>


</body>
</html>
