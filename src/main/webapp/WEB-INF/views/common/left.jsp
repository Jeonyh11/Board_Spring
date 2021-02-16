<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- a href 링크로 고쳐야 boardno 로 받아올수 있을거 같다 -->


<!-- Main Sidebar Container -->
		<aside class="main-sidebar sidebar-dark-primary elevation-4" style="text-align: center;">
			<!-- Brand Logo -->
			<a href="${cp }/login/manager" class="brand-link">  
			<span class="brand-text font-weight-light">게시판 관리</span>
			</a>

			<!-- Sidebar -->
			<div class="sidebar">
				<!-- Sidebar user panel (optional) -->
				<div class="user-panel mt-4 pb-4 mb-4 d-flex">
					
					<div class="info" style="margin: 0 auto;">


							<c:forEach items ="${boardList}" var ="jboard">
							<c:if test="${jboard.board_st==1}">
							  <div >
								<a href="${cp }/postControll/pagingView?board_no=${jboard.board_no}&page=1"
								 	class="board"> ${jboard.board_nm} </a>
								<br><br>
							  </div>
							</c:if>													
							</c:forEach>
					</div>
				</div>

				<!-- Sidebar Menu -->
				<nav class="mt-2">
					<ul class="nav nav-pills nav-sidebar flex-column subMenuList" data-widget="treeview" data-accordion="false">

					</ul>
				</nav>
				<!-- /.sidebar-menu -->
			</div>

			<!-- /.sidebar -->
		</aside>