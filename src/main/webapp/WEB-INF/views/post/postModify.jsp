<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 수정</title>

<link rel="stylesheet" href="<%=request.getContextPath() %>/css/all.min.css">
<!-- Theme style -->
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/adminlte.min.css">

<!-- jQuery -->
<script src="<%=request.getContextPath() %>/js/jquery.min.js"></script>

<!-- Bootstrap 4 -->
<script src="<%=request.getContextPath() %>/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath() %>/js/adminlte.min.js"></script>

<script type="text/javascript">
	$(function(){
		$('#summernote').summernote();
		
		//수정 버튼
		$('#save').on('click',function(){
			$('#frm').attr("method", "GET");
			$('#frm').attr("action", "${pageContext.request.contextPath}/postModify");
			$('#frm').submit();
		})
		
// 		// 수정버튼을 눌렀을 경우
// 		$('#modifyBtn').on('click',function() {
// 			$('#frm').attr("method", "GET");
// 			$('#frm').attr("action", "${cp}/userModify")
// 			$('#frm').submit();
// 		});
// 		// 삭제버튼을 눌렀을 경우
// 		$('#deleteBtn').on('click',function() {
// 			$('#frm').attr("method", "POST");
// 			$('#frm').attr("action", "${cp}/deleteUser")
// 			$('#frm').submit();
// 		});
	})

</script>
</head>
<body>

	
<%-- 		<%@ include file="/common/header.jsp" %> --%>
<%-- 		<%@ include file="/common/left.jsp" %> --%>

		<br><br><br>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					
				<form class="form-horizontal" id ="frm" role="form" action="<%=request.getContextPath() %>/postModify"
				 		method="POST" enctype="multipart/form-data">
				 		
				 	<input type="hidden" id="userid" name="userid" value="${S_USER.userid }">
					<input type="hidden" id="board_no" name="board_no" value="${postVo.board_no }">
					<input type="hidden" id="p_no" name="p_no" value="${postVo.p_no }">
<!-- 					<div class="form-group"> -->
<!-- 						<label for="userNm" class="col-sm-3 control-label">제목</label> -->
<!-- 						<div class="col-sm-4"> -->
				
<!-- 							<input type="text" class="form-control" id="title" name="title"  -->
<!-- 												placeholder="제목을 입력하시오" > -->
																			
<!-- 						</div>	 -->
<!-- 					</div> -->
					
					req.setAttribute("boardVo", boardVo);
					req.setAttribute("postVo", postVo);
					req.setAttribute("boardList", boardList);
					
					
					<div class="form-group">
						<label for="userNm" class="col-sm-3 control-label">제목</label>
						<div class="col-sm-4">
				
							<input type="text" class="form-control" id="title" name="title" 
												value="${postVo.p_title }" >
																			
						</div>	
					</div>
										
					<hr>
					
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">글 내용</label>
						<div class="col-sm-7">
						<textarea id="summernote" name="summernote">${postVo.p_ct }</textarea>
						</div>						
					</div>
					
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">첨부 파일</label>
							<div class="col-sm-4">
								<span class="input-group-append-sm" id=""></span>
							</div>
					</div>	
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">					
							
							<button type="button" id="save" class="btn btn-default">저장</button>
						</div>
					</div>
					
				</form>
	</div>

</body>
</html>