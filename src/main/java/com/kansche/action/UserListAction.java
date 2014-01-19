package com.kansche.action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.UserDto;
import com.kansche.form.UserListForm;
import com.kansche.service.M01UserService;
import com.kansche.util.Const;

public class UserListAction {

	@ActionForm
	@Resource
	public UserListForm userListForm;

	/** ユーザ一覧用リスト */
	public List<UserDto> userDtos;

	@Resource
	protected M01UserService m01UserService;

	@Resource
	protected HttpServletRequest request;

	private static final String JSP_FILE = "userList.jsp";

	private static final String REGISTER_UPDATE_USER = "/registerUpdateUser";


	@Execute(validator = false)
	public String index() {

		init();

		return JSP_FILE;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String register() {

		return REGISTER_UPDATE_USER;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String update() {

			request.setAttribute(Const.REQUEST_PARAM_ID, userListForm.updateDaleteIds.get(0));

		return REGISTER_UPDATE_USER;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String delete() {

		for (String updateDaleteId  : userListForm.updateDaleteIds) {
			m01UserService.logicalDelete(updateDaleteId);
		}
		init();

		return JSP_FILE;
	}

	private void init() {
		userDtos = m01UserService.getUserDtos();
	}

}
