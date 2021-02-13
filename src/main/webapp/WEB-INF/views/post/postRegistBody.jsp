<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<title>게시글 등록</title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.css" rel="stylesheet">

<script src="https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.2/summernote.js" defer></script>

<script>
    $(function() {
        $('#summernote').summernote();	
   });
</script>

		<br><br><br>
	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					
				<form class="form-horizontal" id ="frm" role="form"
							 action="${cp }/registPost"
				 		method="POST" enctype="multipart/form-data">
				 		
				 	<input type="hidden" id="userid" name="userid" value="${S_USER.userid }">
					<input type="hidden" id="board_no" name="board_no" value="${board_no }">
					<div class="form-group">
						<label for="userNm" class="col-sm-3 control-label">제목</label>
						<div class="col-sm-4">
				
							<input type="text" class="form-control" id="title" name="title" 
												placeholder="제목을 입력하시오" >
																			
						</div>	
					</div>
					
					<br>
					
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">글 내용</label>
						<div class="col-sm-7">
						<textarea id="summernote" name="summernote"></textarea>
						</div>						
					</div>
					
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">첨부 파일</label>
					<div class="col-sm-4">
						 <input type="file" class="form-control" name="profile"/>
					</div>
					</div>	
	

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">등록</button>
						</div>
					</div>
				</form>
			</div>
