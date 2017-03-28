/**
 * @Title: StringUtil.java
 * 
 * @Package com.wangyin.marketing.util
 *
 * @date 2015-11-8 上午12:02:44
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.util;

import javax.sound.midi.Sequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringUtil {
	private static final char UNDERLINE = '_';
	
	/**
	 * 通过表明获取驼峰形式的方法名
	 * @param tableName
	 * @return
	 */
	public static String getMethodName(String tableName) {
		  String[]list = tableName.split("_");
		  String res = "";
		  for(int i = 0; i<list.length; ++i)
			  res += trans(list[i].toLowerCase());
		  return  "deleteFrom" + res + "ByPrimaryKey";
	}
	
	/**
	 * 首字母转大写
	 * @param str
	 * @return
	 */
	public static String trans(String str) {
		char[] c=new char[str.length()];
		c=str.toCharArray();
		c[0] = (char) (c[0]-32);
		String str2 = new String(c);
		return str2;
	}	
	
	/**
	 * 驼峰转下划线
	 * @param param
	 * @return
	 */
	public static String camelToUnderline(String param) {
		if (param == null || "".equals(param.trim())) {
			return "";
		}
		int len = param.length();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++) {
			char c = param.charAt(i);
			if (Character.isUpperCase(c)) {
				sb.append(UNDERLINE);
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
	
	/**
	 * 下划线转驼峰
	 * @param param
	 * @return
	 */
	public static String underlineToCamel(String param) {
		if (param == null) {
			return null;
		}

		param = param.toLowerCase();

		StringBuilder sb = new StringBuilder(param.length());
		boolean upperCase = false;
		for (int i = 0; i < param.length(); i++) {
			char c = param.charAt(i);

			if (c == UNDERLINE) {
				upperCase = true;
			} else if (upperCase) {
				sb.append(Character.toUpperCase(c));
				upperCase = false;
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}
	
	/**
	 * 统计一个字符串中一个字符出现的个数
	 * @param s
	 * @param c
	 * @return
	 */
	public static int countChar(String s,char c){
		if(null == s)
			return 0;
		int counter = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(c == chars[i])
				counter++;
		}
		return counter;
	}

	public static Boolean isBlank(String s){
		if(null == s || "".equals(s.trim())){
			return true;
		}else{
			return false;
		}
	}

	public static Boolean isNotBlank(String s){
		return	!isBlank(s);
	}

	/**
	 * 获取二维码
	 *
	 * @param length 二维码长度
	 * @return
	 */
	public static String getRandomQRCode(int length){

		char[] str ={'A','B','C','D','E','F','G',
				'H','I','J','K','L','M','N',
				'O','P','Q','R','S','T',
				'U','V','W','X','Y','Z','0','1','2','3','4','5','6','7','8','9'};
		final int maxNum = 36;

		int i; // 生成的随机数

		int count = 0; // 生成的密码的长度

		StringBuffer pwd = new StringBuffer();

		Random r = new Random();

		while (count < length) {
			// 生成随机数，取绝对值，防止生成负数，
			i = Math.abs(r.nextInt(maxNum)); // 生成的数最大为36-1
			if (i >= 0 && i < str.length) {
				pwd.append(str[i]);
				count++;
			}
		}

		return pwd.toString();
	}

	/**
	 *
	 * @param codeLength
	 * @param count
	 * @return
	 */
	public static List<String> getRandomQRCodeList(int codeLength,int count){

		List<String> qrCodes = new ArrayList<String>();
		if(count <= 0)
			throw new IllegalArgumentException("count must in (1,+∞)");

		for (int i = 0; i < count; i++) {
			qrCodes.add(getRandomQRCode(codeLength));
		}

		return qrCodes;
	}
}
