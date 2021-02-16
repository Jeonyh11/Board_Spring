<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    

<script>
	$(function(){
		$('.post').on('click', function(){
			var p_no = $(this).data('pno');
			$('#pnumber').val(p_no);
			$('#frm').submit();
		})
	
		
// 		$('#btn').on('click', function(){
// 			$('#userid').val();
// 			$('#board_no').val();
// 			$('#frm2').submit();
// 		})
	})
	
</script>

	
</head>
<form id="frm" action ="${cp }/postControll/detailView">
	<input type ="hidden" id="board_no" name="board_no" value="${board_no}">
	<input type ="hidden" id="pnumber" name="pnumber" value="">
</form>

<form id="frm2" action="${cp}/postControll/regist">
	
	<input type ="hidden" id="board_no" name="board_no" value="${board_no}">
</form>

					
				
				<!-- Main content -->
				<section class="content">
					<div class="card">
						<div class="card-header with-border">
							<button type="submit" class="btn btn-primary" onclick="location.href ='${cp}/postControll/regist?board_no=${board_no}'">새글등록</button>
								
							
						</div>
						<div class="card-body" style="text-align: center;">
							<div class="row">
								<div class="col-sm-12">
									<table class="table table-bordered">
										<tbody>
											<tr>
												<th>게시글 번호</th>
												<th>제목</th>
												<th>작성자 아이디</th>
												<th>작성일시</th>
												
												<!-- yyyy-MM-dd  -->
											</tr>
											<c:forEach items="${postList }" var="post">
											<tr class ="post" data-pno="${post.p_no }">
												<td>${post.p_no} </td>
												<td>${post.p_title} </td>
												<td>${post.userid} </td>
												<td><fmt:formatDate value="${post.p_reg_dt}" pattern="yyyy-MM-dd"/> </td>
											</tr>
											</c:forEach>

										</tbody>
									</table>
								</div>
								<!-- col-sm-12 -->
							</div>
							<!-- row -->
						</div>
						<!-- card-body -->
						<div class="card-footer">
							<nav aria-label="member list Navigation">
							
								<ul class="pagination justify-content-center m-0">
									<li class="page-item"><a class="page-link" href="${cp}/postControll?board_no=${PageVo.board_no}&page=1&pageSize=${PageVo.pageSize}"><<</a></li>
										
										<c:choose>
											<c:when test="${PageVo.page>1}">
												
												<li class="page-item">
												<a class="page-link" href="${cp}/postControll?board_no=${PageVo.board_no}&page=${PageVo.page-1}&pageSize=${PageVo.pageSize}">&lt;</a>
												</li>
													
											</c:when>
											<c:when test="${PageVo.page==1}">
												<li class="page-item"><a class="page-link" href="#">&lt;</a></li>
											</c:when>
												
										</c:choose>
										
										<c:forEach begin="1" end="${pagination}" var="i">
											<c:choose>
												<c:when test="${PageVo.page == i}">
													<li class="page-item active"><span class="page-link">${i }</span></li>
												</c:when>
												<c:otherwise>
													<li class="page-item"><a class="page-link" href="${cp}/postControll?board_no=${PageVo.board_no}&page=${i}&pageSize=${PageVo.pageSize}">${i }</a></li>
												</c:otherwise>
											</c:choose>
										</c:forEach>
										
										<c:choose>
											<c:when test="${PageVo.page <= 9 }">
												
												<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/postControll?board_no=${PageVo.board_no}&page=${PageVo.page+1}&pageSize=${PageVo.pageSize}">></a></li>
													
											</c:when>
											<c:when test="${PageVo.page == 10 }">
												<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/postControll?board_no=${PageVo.board_no}&page=${PageVo.page}&pageSize=${PageVo.pageSize}">></a></li>
											</c:when>
										</c:choose>
									
									<li class="page-item"><a class="page-link" href="${pageContext.request.contextPath}/postControll?board_no=${PageVo.board_no}&page=${pagination }&pageSize=${PageVo.pageSize}">>></a></li>
								</ul>
							</nav>

						</div>
						<!-- card-footer -->
					</div>
					<!-- card  -->
				</section>
			</div>
		</div>
	</div>

	
	
</body>
</html>