<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>게시글 수정</title>


<script type="text/javascript">
	$(function(){
		$('#summernote').summernote();
		
		//수정 버튼
		$('#save').on('click',function(){
			$('#frm').attr("method", "GET");
			$('#frm').attr("action", "${pageContext.request.contextPath}/postModify");
			$('#frm').submit();
		})
		
	})

</script>


		<br><br><br>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					
				<form class="form-horizontal" id ="frm" role="form" action="${cp }/postModify"
				 		method="POST" enctype="multipart/form-data">
				 		
				 	<input type="hidden" id="userid" name="userid" value="${S_USER.userid }">
					<input type="hidden" id="board_no" name="board_no" value="${postVo.board_no }">
					<input type="hidden" id="p_no" name="p_no" value="${postVo.p_no }">

					
					<div class="form-group">
						<label for="userNm" class="col-sm-3 control-label">제목</label>
						<div class="col-sm-4">
				
							<input type="text" class="form-control" id="p_title" name="p_title" 
												value="${postVo.p_title }" >
																			
						</div>	
					</div>
										
					<hr>
					
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">글 내용</label>
						<div class="col-sm-7">
						<textarea id="summernote" name="p_ct">${postVo.p_ct }</textarea>
						</div>						
					</div>
					
					
					<div class="form-group">
						<label for="userNm" class="col-sm-2 control-label">첨부 파일</label>
							<div class="col-sm-4">
								<input type="text" name="filename" value="${jfVo.filename }"/>
							</div>
					</div>	
					
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">					
							
							<button type="button" id="save" class="btn btn-default">저장</button>
						</div>
					</div>
					
				</form>
	</div>
