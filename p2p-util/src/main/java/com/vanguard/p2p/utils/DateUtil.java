package com.vanguard.p2p.utils;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
  private DateUtil(){};
  public static Date getEndDate(Date date){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.set(Calendar.HOUR_OF_DAY,23);
    c.set(Calendar.MINUTE,59);
    c.set(Calendar.SECOND,59);
    return c.getTime();
  }
  public static Date getBeginDate(Date date){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.set(Calendar.HOUR_OF_DAY,0);
    c.set(Calendar.MINUTE,0);
    c.set(Calendar.SECOND,0);
    return c.getTime();
  }
  public static void main(String[] args) {
    Date beginDate = getBeginDate(new Date());
    DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    System.out.println("beginDate = " + format.format(beginDate));
  }
  //获取两个时间之差
  public static long getBetweenTime(Date current,Date other){
	  return Math.abs((current.getTime() - other.getTime())/1000);
  }
}
