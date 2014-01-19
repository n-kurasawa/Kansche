package com.kansche.form;

import org.seasar.struts.annotation.Required;

public class LoginForm {

	@Required
	public String loginId;

	@Required
	public String password;
}
