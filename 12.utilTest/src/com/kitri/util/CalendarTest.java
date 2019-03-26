package com.kitri.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CalendarTest {

	public static void main(String[] args) {
		
		// 2019년 03월 26일 오후 01시 17분 35초
		
		// 방법 1
		Calendar cal = new GregorianCalendar();
		System.out.println(cal.getWeekYear() + "년 " + zeroPlus((cal.get(Calendar.MONTH) + 1)) + "월 " + zeroPlus(cal.get(Calendar.DAY_OF_MONTH)) + "일 " +
							((cal.get(Calendar.AM_PM) == 0) ? "오전" : "오후") + " " +
							zeroPlus(cal.get(Calendar.HOUR)) + "시 " + zeroPlus(cal.get(Calendar.MINUTE)) + "분 " + zeroPlus(cal.get(Calendar.SECOND)) + "초");
		
		// 방법 2)
		Date now = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH시 mm분 ss초");
		System.out.println(sdf.format(now));
	}

	private static String zeroPlus(int num) {
		return num < 10 ? ("0" + num) : ("" + num);
	}
}
