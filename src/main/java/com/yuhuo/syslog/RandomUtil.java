package com.yuhuo.syslog;

import java.util.Random;

/**
 * @author rick.zhang E-mail:292743926@qq.com
 * @version 创建时间：2017年11月2日 下午12:13:28
 */
public class RandomUtil {

	public static String getRandomString(int length) { //length表示生成字符串的长度  
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	 }
	
	public static int getRandomId(){
		int max=2147483647;
		int min=0;
		Random random = new Random();
		int s = random.nextInt(max)%(max-min+1) + min;
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(getRandomId());
		System.out.println(getRandomString(15));
	}
}
