package com.cxp.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.cxp.common.utils.DateUtil;
import com.cxp.common.utils.StringUtil;



/**
 * @author cxp
 *
 * 2019年12月11日
 */
public class ExamTest {

	//方法1：根据传入的日期获取年龄
	@Test
	public void getAge() throws Exception {
		String str = "2010-10-01";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf.parse(str);
		 Calendar instance = Calendar.getInstance();
		 instance.setTime(parse);
		System.out.println(DateUtil.getAge(instance));
		
		
	}
	//方法3 :根据传入的参数获取该日器的月末日期，
	@Test
	public void getDateByMonthLast()  throws Exception {
		String str = "2019-09-19 19:29:39";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date parse = sdf.parse(str);
		Calendar instance = Calendar.getInstance();
		instance.setTime(parse);
		DateUtil.setToLastDateOfMonth(instance);
		
		
	}
	//方法4：求未来日期离今天还剩的天数
	@Test
	public void getDaysByFuture()  throws Exception {
		String str = "2050-09-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf.parse(str);
		Calendar instance = Calendar.getInstance();
		 instance.setTime(parse);
		int futureDays = DateUtil.getFutureDays(instance);
		System.out.println(futureDays);
		
		
	}
	//方法5：求过去日期离今天过去的天数
	@Test
	public void getDaysByDeparted ()  throws Exception {
		String str = "2000-09-19";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date parse = sdf.parse(str);
		Calendar instance = Calendar.getInstance();
		instance.setTime(parse);
		int futureDays = DateUtil.getLastDays(instance);
		System.out.println(futureDays);
		
		
	}
}
