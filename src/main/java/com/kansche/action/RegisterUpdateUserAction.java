package com.kansche.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.UserDto;
import com.kansche.form.RegisterUpdateUserForm;
import com.kansche.service.M01UserService;
import com.kansche.util.Const;

public class RegisterUpdateUserAction {

	@ActionForm
	@Resource
	public RegisterUpdateUserForm registerUpdateUserForm;

	@Resource
	protected M01UserService m01UserService;

	@Resource
	protected HttpServletRequest request;

	private static final String JSP_FILE = "registerUpdateUser.jsp";

	@Execute(validator = false)
	public String index() {

		Integer userId = null;

		String requestUserId = (String)request.getAttribute(Const.REQUEST_PARAM_ID);
		if (requestUserId != null) {
			userId = Integer.valueOf(requestUserId);
		}

		if (userId != null) {
			UserDto dto = m01UserService.getUserDtoById(userId);
			setForm(dto);
		}

		return JSP_FILE;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String register() {

		UserDto dto = createDto();

		m01UserService.insert(dto);

		return JSP_FILE;
	}


	@Execute(validator = true, input = JSP_FILE)
	public String update() {

		UserDto dto = createDto();

		m01UserService.update(dto);

		return JSP_FILE;
	}

	private UserDto createDto() {
		UserDto dto = new UserDto();
		dto.userId = registerUpdateUserForm.userId;
		dto.userName = registerUpdateUserForm.userName;
		dto.loginId = registerUpdateUserForm.loginId;
		dto.password = registerUpdateUserForm.password;
		dto.adminFlg = registerUpdateUserForm.adminFlg;
		return dto;
	}

	private void setForm(UserDto dto) {
		registerUpdateUserForm.userId = dto.userId;
		registerUpdateUserForm.userName = dto.userName;
		registerUpdateUserForm.loginId = dto.loginId;
		registerUpdateUserForm.password = dto.password;
		registerUpdateUserForm.adminFlg = dto.adminFlg;

	}

}
