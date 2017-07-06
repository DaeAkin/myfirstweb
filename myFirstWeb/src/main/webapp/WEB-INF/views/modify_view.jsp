<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title></title>

<script src="https://cloud.tinymce.com/stable/tinymce.min.js"></script>
<script>
	tinymce.init({
		selector : 'textarea'
	});
</script>
</head>
<body>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8" />
<title></title>
<style>

</style>
</head>
<body>





		<div id="contents">
			<form name="write" action="modify">
				<h3>글 쓰기</h3>

				<table>
					<c:forEach items="${modify_view }" var="contentdto">
					<input type="hidden" name="num" value="${contentdto.num }"/>
						<tr>
							<td><input type="text" name="title" size="99"
								value="${contentdto.title }"></td>
						</tr>
						<tr>
							<td><textarea rows="40" cols="100%" name="content" >${contentdto.content }</textarea></td>
						</tr>

						<tr>
							<td><input type="submit" value="수정하기"></td>
						</tr>
					</c:forEach>

				</table>
			</form>







	</div>


</body>
</html>
