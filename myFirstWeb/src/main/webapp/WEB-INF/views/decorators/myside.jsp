<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
	
</head>
<body>

   
       
 
        <fieldset>
 
            <p>회원 로그인</p>
      
       
      <%if(session.getAttribute("DBID") != null)  {%>
      <p><%=session.getAttribute("DBNick") %>님 환영합니다.</p>
      <input type="button" value="로그아웃" onclick="location.href='${pageContext.request.contextPath}/logout'"/>
      <%}else{ %>
    <form name="login" method="post" action="login">
    <label>아이디 : &nbsp; <input type="text" name="user_id" id="user_id" size="10"></label><br>
    <label>비밀번호: <input type="password" name="user_pw" id="user_pw" size="10"></label><br>
    
   	 <input type="button" name="joinform" value="회원가입" onclick="location.href='${pageContext.request.contextPath }/joinform'">
   	 
    
    <input type="submit" value="로그인">
    </form>
   <%} %>
    
       
            </fieldset>
        
 

    


</body>
</html>