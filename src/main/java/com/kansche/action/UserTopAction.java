package com.kansche.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.LoginUserDto;
import com.kansche.dto.UserTopDto;
import com.kansche.entity.M01User;
import com.kansche.form.UserTopForm;
import com.kansche.service.M01UserService;

public class UserTopAction {

	public UserTopDto userTopDto;

	@ActionForm
	@Resource
	public UserTopForm userTopForm;

	@Resource
	protected LoginUserDto loginUserDto;

	@Resource
	protected M01UserService m01UserService;

	private static String JSP_FILE = "userTop.jsp";

	@Execute(validator = false)
	public String index() {

		M01User user = m01UserService.findById(loginUserDto.userId);

		userTopDto = new UserTopDto();
		userTopDto.adminFlg = user.adminFlg;

		return JSP_FILE;
	}

}
