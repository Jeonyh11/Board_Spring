<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 
    <section class="content-header">
					<div class="container-fluid">
						<div class="row md-5">
							<div class="col-sm-6">
								<h3 style="text-align: center;">${boardVo.board_nm}</h3>
							</div>
							<div class="col-sm-6">
								<ol class="breadcrumb float-sm-right">
									<c:if test="${S_USER != null }">
										<li class="breadcrumb-item"> ${S_USER.userid }[${S_USER.usernm }]</li></c:if>
									<li class="breadcrumb-item">회원리스트</li>
									<li class="breadcrumb-item">목록</li>
								</ol>
							</div>
						</div>
					</div>
				</section>

    