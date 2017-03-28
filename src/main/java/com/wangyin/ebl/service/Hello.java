package com.wangyin.ebl.service;

import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.wangyin.ebl.util.StringUtil;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月12日 下午4:11:31 
 * @version 1.0 
 * @remark
 */
public class Hello {
public static String getMethodName(String tableName) {
	  String[]list = tableName.split("_");
	  String res = "";
	  for(int i = 0; i<list.length; ++i)
		  res += trans(list[i].toLowerCase());
	  return  "deleteFrom" + res + "ByPrimaryKey";
}
public static String trans(String str) {
	char[] c=new char[str.length()];
	c=str.toCharArray();
	c[0] = (char) (c[0]-32);
	String str2 = new String(c);
	return str2;
}	
public static void main(String[] args) throws  Exception {
	
  String className = "com.wangyin.ebl.service.impl.LicenseServiceImpl";
  String methodName = StringUtil.getMethodName("ABC_DE_F");
  Class clz = Class.forName(className);;
  clz.getFields();
  //  
  Object obj = clz.newInstance();
  //获取方法  
  Method m = obj.getClass().getDeclaredMethod(methodName, Integer.class);
  //调用方法  
  String  result = (String) m.invoke(obj, 6);
  System.out.println(result);
 }
}