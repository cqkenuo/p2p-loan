package com.vanguard.p2p.utils;


import java.util.Calendar;
import java.util.Date;

/**
 * @Descripe
 * @Author vanguard
 * @Date: 2018/01/31
 * @Version 1.0
 *
 */
public class DateUtil {
  private DateUtil(){};

  /**
   * 获得一天结束的时间
   * @param date
   * @return
   */
  public static Date getEndDate(Date date){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.set(Calendar.HOUR_OF_DAY,23);
    c.set(Calendar.MINUTE,59);
    c.set(Calendar.SECOND,59);
    return c.getTime();
  }

  /**
   * 获得一天开始的时间
   * @param date
   * @return
   */
  public static Date getBeginDate(Date date){
    Calendar c = Calendar.getInstance();
    c.setTime(date);
    c.set(Calendar.HOUR_OF_DAY,0);
    c.set(Calendar.MINUTE,0);
    c.set(Calendar.SECOND,0);
    return c.getTime();
  }

  /**
   * 获取两个时之差
   * @param current
   * @param other
   * @return
   */
  public static long getBetweenTime(Date current,Date other){
	  return Math.abs((current.getTime() - other.getTime())/1000);
  }
}
