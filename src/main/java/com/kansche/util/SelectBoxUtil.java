package com.kansche.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class SelectBoxUtil {

	/**
	 * 時間セレクトボックス用マップを返します。
	 * @return 時間セレクトボックス用マップ
	 */
	public static Map<String, String> getHourSbMap() {
		Map<String, String> hourSbMap = new LinkedHashMap<String, String>();
		for (int i = 0; i <= 24; i++) {
			String hour = i < 10 ? "0" + i : String.valueOf(i);
			hourSbMap.put(hour, hour);
		}
		return hourSbMap;
	}

	/**
	 * 分セレクトボックス用マップを返します。
	 * @return 分セレクトボックス用マップ
	 */
	public static Map<String, String> getMinuteSbMap() {
		Map<String, String> minuteSbMap = new LinkedHashMap<String, String>();
		minuteSbMap.put("00", "00");
		minuteSbMap.put("15", "15");
		minuteSbMap.put("30", "30");
		minuteSbMap.put("45", "45");
		return minuteSbMap;

	}

}
