<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${f:url('/css/common.css')}" />
<title>ログイン</title>
</head>
<body>
	<s:form>
		<!--header-->
		<%@ include file="/WEB-INF/view/common/header.jsp"%>
		<!--/header-->
			<div id="main_login" class="center">
				<div id="wrap_login">
					<html:errors />
					<div style="margin-right: 70px">ログインID</div>
					<html:text property="loginId" style="margin-bottom: 10px" maxlength="8"></html:text>
					<div style="margin-right: 70px">パスワード</div>
					<html:text property="password" maxlength="8"></html:text><br />
					<div class="right_button">
						<s:submit property="login" value="ログイン"></s:submit>
					</div>
				</div>
			</div>
		</div>
	</s:form>
</body>
</html>