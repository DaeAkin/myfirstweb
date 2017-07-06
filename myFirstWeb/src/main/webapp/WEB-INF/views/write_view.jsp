<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
    
      <script src="https://cloud.tinymce.com/stable/tinymce.min.js"></script>
  <script>tinymce.init({ selector:'textarea' });</script>
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
    
   
    
 
        
   
        <form name="write" action="write" method="post">
        <h3>글 쓰기</h3>
        
        <table>
        <tr>
            <td><input type="text" name="title"  size="99" placeholder="제목을 입력하세요"></td>
        </tr>
        <tr>
            <td><textarea rows="40" cols="100%" name="content"></textarea></td>    
        </tr>
        
        </table>
            <tr><input type=submit value="작성하기"></tr>
            
        </form>
    
      
     

        
        


        
        
        
        



</body>
</html>
