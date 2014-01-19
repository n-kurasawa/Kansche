<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${f:url('/css/common.css')}" />
<title>ユーザトップ</title>
</head>
<body>
	<s:form>
	<!--header-->
	<%@ include file="/WEB-INF/view/common/header.jsp"%>
	<!--/header-->
		<div id="wrap_2">
			<!--  <div class="headline_center top_space" >目標管理</div>
			<div class="link_center"><a href="">Yearly</a></div>
			<div class="link_center"><a href="">Monthly</a></div>-->
			<div class="headline_center top_space" >作業予定＆実績</div>
			<!--  <div class="link_center"><a href="">Weekly</a></div>-->
			<div class="link_center"><a href="${f:url('/dailyWork')}">Daily</a></div>
			<c:if test="${userTopDto.adminFlg == 1}">
				<div class="headline_center top_space" >システム管理</div>
				<div class="link_center"><a href="${f:url('/userList')}">ユーザ管理</a></div>
			</c:if>
		</div>
	</s:form>
</body>
</html>