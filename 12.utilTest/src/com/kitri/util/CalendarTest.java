package com.kitri.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CalendarTest {

	public static void main(String[] args) {
		
		// 2019�� 03�� 26�� ���� 01�� 17�� 35��
		
		// ��� 1
		Calendar cal = new GregorianCalendar();
		System.out.println(cal.getWeekYear() + "�� " + zeroPlus((cal.get(Calendar.MONTH) + 1)) + "�� " + zeroPlus(cal.get(Calendar.DAY_OF_MONTH)) + "�� " +
							((cal.get(Calendar.AM_PM) == 0) ? "����" : "����") + " " +
							zeroPlus(cal.get(Calendar.HOUR)) + "�� " + zeroPlus(cal.get(Calendar.MINUTE)) + "�� " + zeroPlus(cal.get(Calendar.SECOND)) + "��");
		
		// ��� 2)
		Date now = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a HH�� mm�� ss��");
		System.out.println(sdf.format(now));
	}

	private static String zeroPlus(int num) {
		return num < 10 ? ("0" + num) : ("" + num);
	}
}
