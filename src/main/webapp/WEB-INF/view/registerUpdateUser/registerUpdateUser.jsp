<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${f:url('/css/common.css')}" />
<title>ユーザ管理</title>
</head>
<body>
	<s:form>
	<!--header-->
	<%@ include file="/WEB-INF/view/common/header.jsp"%>
	<!--/header-->
		<div id="wrap_user_update">
			<html:errors/>
			<div class="float_left top_space headline" style="margin-left: 120px; margin-right: 20px;" >ユーザ管理</div>
			<div class="top_space"><a href="${f:url('/userList')}"><input type="button" value="一覧へ戻る"/></a></div>
			<div class="clear"></div>
			<br/>
			<html:hidden property="userId"/>
			<div class="center">ユーザ名</div>
			<div class="center"><html:text property="userName" maxlength="32" ></html:text></div><br/>
			<div class="center">ログインID</div>
			<div class="center"><html:text property="loginId" maxlength="8" ></html:text></div><br/>
			<div class="center">パスワード</div>
			<div class="center"><html:text property="password" maxlength="8" ></html:text></div><br/>
			<div class="center">管理者権限</div>
			<div class="center"><html:checkbox property="adminFlg" value="1"></html:checkbox></div>
			<div class="top_space right_button">
				<c:choose>
					<c:when test="${empty userId}">
						<s:submit property="register" value="登録"></s:submit>
					</c:when>
					<c:otherwise>
						<s:submit property="update" value="更新"></s:submit>
					</c:otherwise>
				</c:choose>
			</div>
			<br/>
		</div>
	</s:form>
</body>
</html>