package com.kansche.action;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.LoginUserDto;
import com.kansche.entity.M01User;
import com.kansche.form.LoginForm;
import com.kansche.service.M01UserService;

public class LoginAction {

	@ActionForm
	@Resource
	public LoginForm loginForm;

	@Resource
	protected M01UserService m01UserService;

	@Resource
	protected LoginUserDto loginUserDto;

	private static final String JSP_FILE = "login.jsp";

	private static final String USER_TOP_ACTION = "/userTop";

	@Execute(validator = false)
	public String index() {

		return JSP_FILE;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String login() {
		M01User user = m01UserService.findByLoginIdAndPassword(loginForm.loginId, loginForm.password);

		if (user != null) {
			loginUserDto.userId = user.userId;
			return USER_TOP_ACTION;
		} else {
			return JSP_FILE;
		}

	}

}
