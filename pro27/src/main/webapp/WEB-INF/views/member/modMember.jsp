<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<% 
request.setCharacterEncoding("utf-8"); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입창</title>
<style type="text/css">
   .cls1{
   font-size: 40px;
   text-align: center;
   }
   
   .cls2{
   text-align: center;
   }
   
</style>
</head>
<body>
   <form action="${contextPath }/member/updateMember.do" method="post">
   <h1 align="center">회원 정보 수정창</h1>
   <table align="center">
   <tr  >
       <td width="80"><p>아이디</p></td>
       <td width="50"><input type="text" name="id" autofocus="autofocus" value="${member.id}" readonly ></td>
    </tr>
     <tr >
       <td width="80"><p>이름</p></td>
       <td width="50"><input type="text" name="name" value=></td>
    </tr>   
    <tr >   
       <td width="80"><p>비밀번호</p></td>
       <td width="50"><input type="password" name="pwd"></td>
     </tr>
     <tr >   
       <td width="80"><p>이메일</p></td>
       <td width="50"><input type="email" name="email"></td>
     </tr>
     <tr>   
        <td width="80"><p>&nbsp;</p></td>
       <td width="50">
       <input value="수정하기" type="submit"  />
       <input type="reset" value="취소">
       </td>
     </tr>
   </table>
   </form>
</body>
</html>