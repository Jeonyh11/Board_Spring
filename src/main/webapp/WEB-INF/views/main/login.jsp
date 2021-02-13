<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>

<!-- Font Awesome -->
<link rel="stylesheet"
	href="${cp }/css/all.min.css">

<!-- Theme style -->
<link rel="stylesheet"
	href="${cp }/css/adminlte.min.css">
	
<!-- jQuery -->
<script src="${cp }/js/jquery.min.js"></script>
<!-- Bootstrap 4 -->
<script
	src="${cp }/js/bootstrap.bundle.min.js"></script>
<!-- AdminLTE App -->
<script src="${cp }/js/adminlte.min.js"></script>


</head>

<body>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="#"><b>로그인</b></a>
		</div>
		
		<div class="card">
			<div class="card-body login-card-body">
				<p class="login-box-msg">Welcome board</p>
<!-- 로그인 폼 태그 -->
				<form action="${cp }/login/success" method="post">
					<div class="form-group has-feedback">
						<input type="text" class="form-control" name="userid" id="userid"
							placeholder="아이디를 입력하세요." value="coco" required autofocus> <span
							class="glyphicon glyphicon-envelope form-control-feedback"></span>
					</div>
					
					<div class="form-group has-feedback">
						<input type="password" class="form-control" name="pass" id="pass"
							placeholder="패스워드를 입력하세요." value="coco" required> <span
							class="glyphicon glyphicon-lock form-control-feedback"></span>
					</div>
					<div class="row">
						<div class="col-sm-8">
							<div class="checkbox icheck">
								<label> <input type="checkbox" name="rememberMe"
									value=""> Remember Me
								</label>
							</div>
						</div>
						<!-- /.col -->
						<div class="col-sm-4">
							<button type="submit" class="btn btn-primary btn-block btn-flat">로그인</button>
						</div>
						<!-- /.col -->
					</div>
				</form>

			</div>
			<!-- /.login-box-body -->
		</div>
	</div>
	<!-- /.login-box -->


</body>
</html>