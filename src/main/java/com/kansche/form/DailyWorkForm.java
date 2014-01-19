package com.kansche.form;

import java.util.ArrayList;
import java.util.List;

import org.seasar.struts.annotation.Arg;
import org.seasar.struts.annotation.DateType;

import com.kansche.dto.DailyWorkDto;

public class DailyWorkForm {

	public List<DailyWorkDto> dailyWorkDtos;

	@DateType(arg0 = @Arg(key = "検索", resource = false))
	public String searchYmd;

	public void reset() {
		dailyWorkDtos = new ArrayList<DailyWorkDto>();
	}


}
