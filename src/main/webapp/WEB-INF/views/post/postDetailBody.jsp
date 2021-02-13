<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<title>게시글 상세보기</title>


<script>
    $(function() {
       $('#sujeong').on('click',function(){
    	   $('#frm').submit();
       })
   });
</script>

	<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
					
				<form class="form-horizontal" id ="frm" role="form" action="<%=request.getContextPath() %>/postModify"
				 		method="POST" enctype="multipart/form-data">
				 		
				 	<input type="hidden" id="userid" name="userid" value="${S_USER.userid }">
					
					<input type="hidden" id="p_no" name="p_no" value="${postVo.p_no }">
<!-- 					<div class="form-group"> -->
<!-- 						<label for="userNm" class="col-sm-3 control-label">제목</label> -->
<!-- 						<div class="col-sm-4"> -->
				
<!-- 							<input type="text" class="form-control" id="title" name="title"  -->
<!-- 												placeholder="제목을 입력하시오" > -->
																			
<!-- 						</div>	 -->
<!-- 					</div> -->
					
					
					<div class="form-group">
										<label class="col-sm-2 control-label" style="font-size: 0.9em;">
											제목
										</label>
										<div class="col-sm-7">
											<span class="input-group-append-sm" id="title">${postVo.p_title }</span>
										</div>
									</div>
					
					
					<br>
					
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">글 내용</label>
						<div class="col-sm-7">
						<span class="input-group-append-sm" id="comment">${postVo.p_ct }</span>
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
						
							<c:if test="${S_USER.userid.equals(postVo.userid) }">
								<button type="button" id="sujeong" class="btn btn-default">수정</button>
							</c:if>
							
							<c:if test="${S_USER.userid.equals(postVo.userid) }">
								<button type="button" id="sackjae" class="btn btn-default">삭제</button>
							</c:if>
							
							
							<button type="submit" class="btn btn-default">답글작성</button>
						</div>
					</div>
	
					<div class="form-group">
					<label for="userNm" class="col-sm-2 control-label">댓글</label>
					<div class="col-sm-4">
					
						<textarea name="" rows="" cols=""></textarea>
						<button type="submit" class="btn btn-default">댓글 등록</button>
						<span class="input-group-append-sm" id=""></span>
						
					</div>
					</div>	

					
				</form>
			</div>

