package com.rl.date;

import java.util.Calendar;

public class CalenderDemo {
	public static void main(String[] args)
	{
		 //获得日历类的子类
		  Calendar c=Calendar.getInstance();
		  /*java.util.GregorianCalendar[
		   * time=1554773751008,
		   * areFieldsSet=true,areAllFieldsSet=true,
		   * lenient=true,
		   * zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",
		   * offset=28800000,dstSavings=0,useDaylight=false,
		   * transitions=19,lastRule=null],firstDayOfWeek=1,
		   * minimalDaysInFirstWeek=1,ERA=1,
		   * YEAR=2019,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,
		   * DAY_OF_MONTH=9,
		   * DAY_OF_YEAR=99,
		   * DAY_OF_WEEK=3,
		   * DAY_OF_WEEK_IN_MONTH=2,
		   * AM_PM=0,
		   * HOUR=9,
		   * HOUR_OF_DAY=9,
		   * MINUTE=35,
		   * SECOND=51,
		   * MILLISECOND=8,ZONE_OFFSET=28800000,DST_OFFSET=0]
           */
		  System.out.println(c);
		  int year=c.get(Calendar.YEAR);
		  int month=c.get(Calendar.MONTH)+1;
		  int day=c.get(Calendar.DAY_OF_MONTH);
		  System.out.println(year+"年"+month+"月"+day+"日");
		  
		  //设置年月日
		  c.set(2008,10,23);
		  c.set(Calendar.HOUR_OF_DAY, 10);
		  int year1=c.get(Calendar.YEAR);
		  int month1=c.get(Calendar.MONTH)+1;
		  int day1=c.get(Calendar.DAY_OF_MONTH);
		  System.out.println(year1+"年"+month1+"月"+day1+"日");
		  }
 
}
