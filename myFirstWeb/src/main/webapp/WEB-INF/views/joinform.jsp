<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>



<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8" />
    <title></title>
 

</head>
<body>


    

    
 
        
   
      
      <h3>회원가입</h3>
        <hr>
        <p><span style="color:red">(*)</span> 표시가 있는 항목은 반드시 입력해야 합니다..</p>
        <p>허위로 작성된 경우 임의로 삭제처리 될 수 있으니 주의해 주세요.</p>
        
      <form name="joinform" action="join" method="post">
          <table id="joinform"> 
        <tr>
             <td>닉네임<span style="color:red">*</span></td>
            <td><p><input type=text name="nickname"></p><p>닉네임은 자신을 표현할 수 있는 단어로 20자까지 자유롭게 사용할 수 있습니다.</p></td>
        </tr>
        
          <tr>
             <td>아이디<span style="color:red">*</span></td>
            <td><p><input type=text name="id"></p><p>4~12자의 영문과 숫자만 사용할 수 있습니다.</p></td>
        </tr>
              
          <tr>
             <td>비밀번호<span style="color:red">*</span></td>
            <td><p><input type=password name="password"></td>
        </tr>
        
          <tr>
             <td>비밀번호 확인<span style="color:red">*</span></td>
            <td><p><input type=password name="password1" onkeypress="passwordCheck(this.value)"><span name="passcheck"></span></p><p>비밀번호를 한번 더 입력하세요.</p></td>
        </tr>
              
          <tr>
             <td>비번찾기 질문<span style="color:red">*</span></td>
            <td><p><select name="passwordQue">
                <option value="">질문  선택</option>
                <option value="ㅁㅁㅁㅁㅁ">ㅁㅁㅁㅁㅁㅁㅁ</option>
                <option value="ㄴㄴㄴㄴㄴ">ㄴㄴㄴㄴㄴㄴ</option>
                <option value="ㄷㄷㄷㄷㄷ">ㄷㄷㄷㄷㄷㄷ</option>
                <option value="ㄹㄹㄹㄹㄹㄹㄹㄹ">ㄹㄹㄹㄹㄹㄹ</option>
                </select>
                </p><p>질문을 선택해 주세요.</p></td>
        </tr>
              
          <tr>
             <td>비번찾기 답변<span style="color:red">*</span></td>
            <td><p><input type=text name="passwordAn"></p><p>비밀번호찾기 질문에 대한 답변은 혼자만 알 수 있는 단어나 기호로 입력해주세요.</p> <p>비밀번호를 찾을 때 필요하므로 반드시 기억해주세요</p></td>
        </tr>
              
          <tr id="lastone">
             <td>이메일<span style="color:red">*</span></td>
            <td><p><input type=text name="email"></p><p><input type="checkbox"  name="emailCheck" value="Y" />뉴스레터나 공지이메일을 수신 받겠습니다.</p></td>
        </tr>
 
        </table>
          
          
          <input type="reset" value="다시쓰기">
          <input type="submit" value="가입하기">
        
        </form>

        
        

        
        
        
        
 
        
 
 


</body>
</html>
