<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>    
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>게시판</title>
<link rel="stylesheet" href="${cp }/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="${cp }/css/adminlte.min.css">

<!-- jQuery -->
<script src="${cp }/js/jquery.min.js"></script>

<!-- Bootstrap 4 -->
<script src="${cp }/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${cp }/js/adminlte.min.js"></script>

<title>Insert title here</title>
</head>
<body class="hold-transition sidebar-mini">

<div class="wrapper">


		<tiles:insertAttribute name="header"/>
		<tiles:insertAttribute name="left"/>
		
		<div id="if_list_div" style="position: relative; padding: 0; overflow: hidden; height: 750px;">
			<div class="content-wrapper" style="min-height: 584px;">
		
		<tiles:insertAttribute name="body"/>
		</div>
	</div>
</div>
</body>
</html>