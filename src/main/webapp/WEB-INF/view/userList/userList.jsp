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
		<div id="wrap">
			<html:errors/>
			<div class="float_left top_space headline" style="margin-left: 365px; margin-right: 100px;" >ユーザ管理</div>
			<div class="top_space">
				<s:submit property="register" value="登録"></s:submit>
				<s:submit property="update" value="更新"></s:submit>
				<s:submit property="delete" value="削除"></s:submit>
			</div>
			<div class="clear"></div>
			<br/>
			<table border="0" cellpadding="2" cellspacing="1" bgcolor="#999999" width="450px" style="table-layout: fixed; margin: auto;">
				<tr bgcolor="#C9DFE8">
					<th width="100px">ユーザID</th>
					<th width="150px">ユーザ名</th>
					<th width="150px">ログインID</th>
					<th width="50px">管理者</th>
					<th width="50px"></th>
				</tr>
				<c:forEach var="userDto" items="${userDtos}">
					<tr bgcolor="#FFFFFF">
						<td>${f:h(userDto.userId)}</td>
						<td>${f:h(userDto.userName)}</td>
						<td>${f:h(userDto.loginId)}</td>
						<td align="center">
							<c:if test="${userDto.adminFlg != 1}">&#9744;</c:if>
							<c:if test="${userDto.adminFlg == 1}">&#9745;</c:if>
							</td>
						<td align="center">
							<html:checkbox property="updateDaleteIds" value="${userDto.userId}"></html:checkbox>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</s:form>
</body>
</html>