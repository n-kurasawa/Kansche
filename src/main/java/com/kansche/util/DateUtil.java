package com.kansche.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/**
	 * システム日付をyyyyMMddの形式の文字列で返します。
	 * @return システム日付
	 */
	public static String getToday(Date date) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(date);
	}

	/**
	 * 文字列を日付に変換する。
	 * @param ymd
	 * @return
	 */
	public static Date toDate(String ymd) {
		DateFormat dateFormat = DateFormat.getDateInstance();
		Date date = null;
		try {
			date = dateFormat.parse(ymd);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 引数に渡された日付の週の月曜の日付を返します。
	 * @param date
	 * @return 月曜日付
	 */
	public static Date getMonday(Date date) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.TUESDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			break;
		case Calendar.WEDNESDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -2);
			break;
		case Calendar.THURSDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -3);
			break;
		case Calendar.FRIDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -4);
			break;
		case Calendar.SATURDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -5);
			break;
		case Calendar.SUNDAY:
			calendar.add(Calendar.DAY_OF_MONTH, -6);
			break;
		default:
			break;
		}
		return calendar.getTime();

	}

	/**
	 * 引数に渡された日付の週の日曜日の日付を返します。
	 * @param date
	 * @return 日曜日付
	 */
	public static Date getSunday(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		switch (calendar.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.MONDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 6);
			break;
		case Calendar.TUESDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 5);
			break;
		case Calendar.WEDNESDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 4);
			break;
		case Calendar.THURSDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 3);
			break;
		case Calendar.FRIDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 2);
			break;
		case Calendar.SATURDAY:
			calendar.add(Calendar.DAY_OF_MONTH, 1);
			break;
		default:
			break;
		}
		return calendar.getTime();
	}

	public static String getStrDate(Date date) {
		DateFormat df = new SimpleDateFormat("yyyyMMdd");
		return df.format(date);
	}
}
