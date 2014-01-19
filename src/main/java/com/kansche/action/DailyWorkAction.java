package com.kansche.action;

import java.util.Date;

import javax.annotation.Resource;

import org.seasar.framework.util.StringUtil;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.kansche.dto.DailyWorkDispDto;
import com.kansche.dto.LoginUserDto;
import com.kansche.form.DailyWorkForm;
import com.kansche.service.T05DailyWorkService;
import com.kansche.util.DateUtil;
import com.kansche.util.SelectBoxUtil;

public class DailyWorkAction {

	@ActionForm
	@Resource
	public DailyWorkForm dailyWorkForm;

	public DailyWorkDispDto dispDto;

	@Resource
	protected T05DailyWorkService t05DailyWorkService;

	@Resource
	protected LoginUserDto loginUserDto;

	private static final String JSP_FILE = "dailyWork.jsp";

	@Execute(validator = false)
	public String index() {

		dailyWorkForm.dailyWorkDtos = t05DailyWorkService.getDailyWorkDtos(loginUserDto.userId, new Date());
		init();

		return JSP_FILE;
	}

	@Execute(validator = true, input = "retrunJsp")
	public String search() {

		if (StringUtil.isNotEmpty(dailyWorkForm.searchYmd)) {
			Date date = DateUtil.toDate(dailyWorkForm.searchYmd);
			dailyWorkForm.dailyWorkDtos = t05DailyWorkService.getDailyWorkDtos(loginUserDto.userId, date);
		}
		init();

		return JSP_FILE;
	}

	@Execute(validator = true, input = JSP_FILE)
	public String save() {

		t05DailyWorkService.updateOrInsertAll(dailyWorkForm.dailyWorkDtos);
		init();

		return JSP_FILE;
	}

	@Execute(validator = false)
	public String retrunJsp() {
		init();
		return JSP_FILE;
	}

	private void init () {
		dispDto = new DailyWorkDispDto();
		dispDto.hourSbMap = SelectBoxUtil.getHourSbMap();
		dispDto.minuteSbMap = SelectBoxUtil.getMinuteSbMap();

	}

}
