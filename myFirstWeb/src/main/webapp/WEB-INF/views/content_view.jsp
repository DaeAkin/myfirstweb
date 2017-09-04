<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title></title>
<style>
</style>
</head>
<body>





		<c:forEach items="${content_view}" var="dto">
	<table id="freeboard">
			<tr>
				<td>${dto.title}</td>
			</tr>
			<tr>
				<td>글쓴이 :${dto.nickname} 날짜 :${dto.date } 조회 :${dto.hit }</td>
			</tr>
			<tr>
				<td>${dto.content }</td>
			</tr>
			<tr>
				<td><a href="delete?num=${dto.num}">삭제하기</a></td>
				<td><a href="modify_view?num=${dto.num}">수정하기</a></td>
			</tr>

	</table>

	<table id="intro">
		<tr>
			<td>자기소개 구역</td>
		</tr>
	</table>
		</c:forEach>





	<p>코멘트 달기</p>
	<form name="reply" action="reply" method="post">
		<table>

			<tr>
				<c:forEach items="${content_view}" var="content_viewdto">
					<td><textarea rows="5" cols="50" name="replycontent"></textarea></td>
					<td><input type="hidden" name="num"
						value="${content_viewdto.num }" /></td>
					<td><input type="submit" value="댓글 입력"></td>
				</c:forEach>
			</tr>
		</table>
	</form>


	<form name="replyandreply" action="replyandreply" method="post">
		<table>
			<c:forEach items="${content_replyview}" var="replydto">
				<tr id="replyandreply">
					<td>글쓴이 사진</td>
					<td><p>${replydto.writer} ${replydto.datetime}</p>
						<p>${replydto.replycontent }</p></td>
				</tr>
				<tr>
					<td>추천<a href="${pageContext.request.contextPath}/up?replynum=${replydto.replynum}&num=${replydto.num }">${replydto.agreement }</a> 반대 <a href="${pageContext.request.contextPath}/down">${replydto.opposition } 답글쓰기</a></td>
		
				</tr>
			</c:forEach>
			<tr id="replyandreply_view">
				<td><textarea cols=""></textarea></td>
				<td><input type="submit" value="답글 입력"></td>
			</tr>
		</table>
	</form>















</body>
</html>
