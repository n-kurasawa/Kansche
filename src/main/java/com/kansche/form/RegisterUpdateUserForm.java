package com.kansche.form;

import org.seasar.struts.annotation.Required;

public class RegisterUpdateUserForm {

	public Integer userId;

	@Required
	public String userName;

	@Required
	public String loginId;

	@Required
	public String password;

	public Integer adminFlg;

}
