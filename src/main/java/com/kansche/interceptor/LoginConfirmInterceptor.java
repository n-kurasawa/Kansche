package com.kansche.interceptor;

import javax.annotation.Resource;

import org.aopalliance.intercept.MethodInvocation;
import org.seasar.framework.aop.interceptors.AbstractInterceptor;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.LoginUserDto;

public class LoginConfirmInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Resource
	protected LoginUserDto loginUserDto;

	/**
	 * Executeアノテーションがついており、ログインされていない場合ログインページに飛ばす。
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		return (!isExecuteMethod(invocation) || isLoggedIn()) ? invocation
				.proceed() : "/login/";
	}

	/**
	 * 実行されたアクションにExecuteアノテーションがついているかどうか。
	 * @param invocation
	 * @return アノテーションがついていればtrue
	 */
	private boolean isExecuteMethod(MethodInvocation invocation) {
		return invocation.getMethod().isAnnotationPresent(Execute.class);
	}

	/**
	 * session上にloginUserDtoが存在しており、その中にuserIdが保持されているかどうか。
	 * @return 上記の条件を満たしていればtrue
	 */
	private boolean isLoggedIn() {
		return (loginUserDto != null && loginUserDto.userId != null);
	}

}
