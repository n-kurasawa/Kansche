<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${f:url('/css/common.css')}" />
<script type="text/javascript" src="http://www.google.com/jsapi"></script>
<script type="text/javascript">google.load("jquery", "1.2.6");</script>
<script type="text/javascript" src="${f:url('/js/common.js')}"></script>
<script type="text/javascript">
	function submitAction() {
		textboxes = $('.textbox');
		for (var i = 0; i < textboxes.length; i++) {
			if (textboxes[i].value == 'keep' || textboxes[i].value == 'problem' || textboxes[i].value == 'try') {
				textboxes[i].value = '';
			}
		}
		return true;
	}
</script>
<title>日間予定実績</title>
</head>
<body>
	<s:form>
	<!--header-->
	<%@ include file="/WEB-INF/view/common/header.jsp"%>
	<!--/header-->
		<div id="wrap">
			<html:errors/>
			<c:forEach var="dailyWorkDtos" items="${dailyWorkDtos}" varStatus="status">
				<html:hidden name="dailyWorkDtos" property="userId" indexed="true"/>
				<html:hidden name="dailyWorkDtos" property="workYmd" indexed="true"/>
				<div class="headline top_space float_left" >
					<fmt:formatDate value="${f:date(dailyWorkDtos.workYmd, 'yyyyMMdd')}" pattern="yyyy/MM/dd"/>
				</div>
				<div class="top_space float_left" >
					<html:select name="dailyWorkDtos" property="startTimeH" indexed="true" style="margin-left: 10px">
						<html:optionsCollection name="dispDto" property="hourSbMap" value="key" label="value"/>
					</html:select>時
					<html:select name="dailyWorkDtos" property="startTimeM" indexed="true" style="margin-left: 10px">
						<html:optionsCollection name="dispDto" property="minuteSbMap" value="key" label="value"/>
					</html:select>分&nbsp;&nbsp;～
					<html:select name="dailyWorkDtos" property="finishTimeH" indexed="true" style="margin-left: 10px">
						<html:optionsCollection name="dispDto" property="hourSbMap" value="key" label="value"/>
					</html:select>時
					<html:select name="dailyWorkDtos" property="finishTimeM" indexed="true" style="margin-left: 10px">
						<html:optionsCollection name="dispDto" property="minuteSbMap" value="key" label="value"/>
					</html:select>分
				</div>
				<c:if test="${status.first}">
					<div class="top_space float_left">
						<html:text property="searchYmd" style="margin-left: 80px"></html:text>&nbsp;週
						<s:submit property="search" value="検索"></s:submit>
					</div>
				</c:if>
				<div class="top_space right_button">
					<s:submit property="save" value="保存" onclick="return submitAction();"></s:submit>
				</div>
				<div class="clear"></div>
				<div class="float_left yotei_jisseki">
					<div>予定</div>
					<html:textarea name="dailyWorkDtos" property="schedule" indexed="true" rows="20" cols="30"></html:textarea>
				</div>
				<div class="float_left yotei_jisseki">
					<div>実績</div>
					<html:textarea name="dailyWorkDtos" property="results" indexed="true" rows="20" cols="30"></html:textarea>
				</div>
				<div class="float_left">
					<div>KPT</div>
					<c:choose>
						<c:when test="${empty dailyWorkDtos.keepPoint}">
							<html:textarea name="dailyWorkDtos" property="keepPoint" value="keep" indexed="true" styleClass="textbox" style="margin: 2px 0px 0px 2px; height: 127px" rows="10" cols="23"></html:textarea>
						</c:when>
						<c:otherwise>
							<html:textarea name="dailyWorkDtos" property="keepPoint" indexed="true" style="margin: 2px 0px 0px 2px; height: 127px" rows="10" cols="23"></html:textarea>
						</c:otherwise>
					</c:choose>
					<div class="clear"></div>
					<c:choose>
						<c:when test="${empty dailyWorkDtos.problemPoint}">
							<html:textarea name="dailyWorkDtos" property="problemPoint" value="problem" indexed="true" styleClass="textbox" style="margin: 0px 0px 2px 2px; height: 127px" rows="10" cols="23"></html:textarea>
						</c:when>
						<c:otherwise>
							<html:textarea name="dailyWorkDtos" property="problemPoint" indexed="true" style="margin: 0px 0px 2px 2px; height: 127px" rows="10" cols="23"></html:textarea>
						</c:otherwise>
					</c:choose>
				</div>
				<br/>
				<div>
					<c:choose>
						<c:when test="${empty dailyWorkDtos.tryPoint}">
							<html:textarea name="dailyWorkDtos" property="tryPoint" value="try" indexed="true" styleClass="textbox" style="margin: 2px 2px 2px 0px" rows="20" cols="23"></html:textarea>
						</c:when>
						<c:otherwise>
							<html:textarea name="dailyWorkDtos" property="tryPoint" indexed="true" style="margin: 2px 2px 2px 0px" rows="20" cols="23"></html:textarea>
						</c:otherwise>
					</c:choose>
				</div>
			</c:forEach>
		</div>
	</s:form>
</body>
</html>