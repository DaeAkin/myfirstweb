<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


	
<!DOCTYPE html>



<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title></title>

<style>

</style>
</head>
<body>
 
		



			<h2>자유 게시판</h2>

			<table id="board">
				<tr id="first">
					<th width=40px>번호</th>
					<th>제목</th>
					<th width=100px>글쓴이</th>
					<th width=100px>조회수</th>
					<th width=70px;>날짜</th>
				</tr>
	

				<c:forEach items="${list}" var="dto">
				<tr>
					<td>${dto.num}</td>
					<td style="text-align: left">
					<c:forEach begin="1" end="${dto.indent}">-</c:forEach>
					<a href=content_view?num=${dto.num}>${dto.title}</a></td>
					<td>${dto.nickname}</td>
					<td>${dto.hit}</td>
					<td>
						<!--  원하는 날짜형식으로 출력하기 위해 fmt태그 사용 -->
						<fmt:formatDate value="${dto.date}" pattern="MM-dd"/>
					</td>
				</tr>
				</c:forEach>
				<tr>
			<td colspan="5"> <a href="write_view">글작성</a> </td>
		</tr>		
		</table>
		
		





</body>
</html>
