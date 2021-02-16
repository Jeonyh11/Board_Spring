<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>


</script>

<title>게시판 관리</title>

<form id="frm" action="${cp }/login/create" method="get">
게시판 이름 
<input type="text" name="board_nm" id="board_nm" value=""/>
<select id="choice" name="choice">
	<option value="1">사용</option>
	<option value="2">미사용</option>
</select>
<button id="btn">생성</button>
</form>
<br><br>

<c:forEach items="${boardList}" var="board">
<form id="frm2" name="frm22" action="${cp }/login/fix" method="post">
게시판 이름
<input type="text" name="board_nm" id="board_nm"
		value="${board.board_nm }"/>

<select name="choice">
		<option value="1" <c:if test="${board.board_st == 1 }" >selected </c:if>>사용</option>
		<option value="2" <c:if test="${board.board_st == 2 }" >selected </c:if>>미사용</option>
</select>
<button id="btn2">수정</button>
<br><br>
</form>
</c:forEach>

<script>
	for(int i =0; i<document.frm22.board_nm.length(); i++){
	var board = document.frm22.board_nm[i].value();
		
	}
</script>

