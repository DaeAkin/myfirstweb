<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<html>
<head>
	<title>Home</title>
</head>
<body>


        
         <div class="box">
            <p>공지사항</p>
            <p>2017-05-23</p>
            <hr>
            
            <p>이낙연 총리 후보는 24일 ssssss국회 청문회에서 "(언론인 해직 사태에 대해) 살아남은 자의 부채가 평생 따라다니고 있다"고 말했다. 

김광수 국민의당 의원은 이 총리 후보에게 "(이 총리 후보가) 동아일보 기자로 재직하던 시절 역사성과 시대정신이 없다는 비판을 받고 있다"며 "신군부에 의한 해직 언론인 사태를 어떻게 해결할 수 있나"라고 질문했다.  r고맙습니다.
            <hr>

        </div>
   
    

   
       
        
           <span class="box1">
        <span>자유게시판 </span>
        <!-- 자유게시판 -->
        <span><a href="${pageContext.request.contextPath }/list">더보기</a></span>
            <table>
            <c:forEach items="${freeboardlist}" var="freeboard">
                <tr>
      
                <td>[<fmt:formatDate value="${freeboard.date }" pattern="MM-dd"/>]
                [자유게시판]
                <a href=content_view?num=${freeboard.num}>${freeboard.title}</a></td>
                </tr>
            
                 </c:forEach>
            </table>
            
        </span>
        
        
        
        <span class="box1">
        <span>게시글 이름</span>
        <span>더보기</span>
            <table >
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                 
            </table>
            
        </span>
        <span class="box1">
        <span>게시글 이름</span>
        <span>더보기</span>
            <table>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                 
            </table>
            
        </span>

		  </span>
        <span class="box1">
        <span>게시글 이름</span>
        <span>더보기</span>
            <table>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                <tr>
                <td>[5/24][카테고리 이름] 불라불라불라불라불라</td>
                </tr>
                 
            </table>
            
        </span>
       

        
        




</body>
</html>
