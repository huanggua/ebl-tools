/**
 * @Title: ReflectUtil.java
 * 
 * @Package com.wangyin.marketing.util
 *
 * @date 2015-11-7 下午11:44:51
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Column;

public class ReflectUtil {

	/**
	 * 反射获取对象的所有属性
	 * 
	 * @param object
	 * @return 下划线方式的字段
	 */
	public static List<String> getDeclareFieldName(Object object) {
		List<String> list = new ArrayList<String>();
		Class<?> superClass = object.getClass().getSuperclass();
		while (true) {
			if (superClass != null) {
				Field[] superFields = superClass.getDeclaredFields();
				if (superFields != null && superFields.length > 0) {
					for (Field field : superFields) {
						list.add(StringUtil.camelToUnderline(field.getName()).toUpperCase());
					}
				}
				superClass = superClass.getSuperclass();
			} else {
				break;
			}
		}
		Field[] objFields = object.getClass().getDeclaredFields();
		if (objFields != null && objFields.length > 0) {
			for (Field field : objFields) {
				list.add(StringUtil.camelToUnderline(field.getName()).toUpperCase());
			}
		}
		return list;
	}

	/**
	 *
	 * @param object
	 * @return
	 */
	public static List<String> getDeclareFieldNameCamel(Object object) {
		List<String> list = new ArrayList<String>();
		Class<?> superClass = object.getClass().getSuperclass();
		while (true) {
			if (superClass != null) {
				Field[] superFields = superClass.getDeclaredFields();
				if (superFields != null && superFields.length > 0) {
					for (Field field : superFields) {
						if("clearData".equals(field.getName())){
							continue;
						}else{
							list.add(field.getName());
						}
					}
				}
				superClass = superClass.getSuperclass();
			} else {
				break;
			}
		}
		Field[] objFields = object.getClass().getDeclaredFields();
		if (objFields != null && objFields.length > 0) {
			for (Field field : objFields) {
				if("clearData".equals(field.getName())){
					continue;
				}else{
					list.add(field.getName());
				}
			}
		}
		return list;
	}

	/**
	 *
	 * @param object
	 * @return
	 */
	public static List<Map<String,String>> getFiledAndValue(Object object){
		List<Map<String,String>> list = new ArrayList<Map<String, String>>();
		Class<?> superClass = object.getClass().getSuperclass();
		while (true) {
			if (superClass != null) {
				Field[] superFields = superClass.getDeclaredFields();
				if (superFields != null && superFields.length > 0) {
					for (Field field : superFields) {
						Map<String,String> map = new HashMap<String,String>();
						map.put(field.getName(),getFieldValue(object,field.getName()));
						list.add(map);
					}
				}
				superClass = superClass.getSuperclass();
			} else {
				break;
			}
		}
		Field[] objFields = object.getClass().getDeclaredFields();
		if (objFields != null && objFields.length > 0) {
			for (Field field : objFields) {
				Map<String,String> map = new HashMap<String,String>();
				map.put(field.getName(),getFieldValue(object,field.getName()));
				list.add(map);
			}
		}
		return  list;
	}
	/**
	 * 反射获取对象的所有属性
	 * 
	 * @param object
	 * @return
	 */
	public static List<String> getColumnName(Object object) {
		List<String> list = new ArrayList<String>();
		Class<?> superClass = object.getClass().getSuperclass();
		while (true) {
			if (superClass != null) {
				Field[] superFields = superClass.getDeclaredFields();
				if (superFields != null && superFields.length > 0) {
					for (Field field : superFields) {
						list.add(field.getAnnotation(Column.class).name());
					}
				}
				superClass = superClass.getSuperclass();
			} else {
				break;
			}
		}
		Field[] objFields = object.getClass().getDeclaredFields();
		if (objFields != null && objFields.length > 0) {
			for (Field field : objFields) {
				list.add(field.getAnnotation(Column.class).name());
			}
		}
		return list;
	}
	
	/**
	 * 获取某个对象属性值
	 * 
	 * @param object 
	 * @param primaryKeyUnderLine  下划线方式的主键（需要转为java的驼峰标志)
	 * @return
	 */
	public static String getPrimaryKeyValue(Object object,String primaryKeyUnderLine) {
		String name = StringUtil.underlineToCamel(primaryKeyUnderLine);
		
		String methodName = "get" + name.substring(0, 1).toUpperCase()
				+ name.substring(1);
		Method method = null;
		Object methodValue = null;
		try {
			method = object.getClass().getMethod(methodName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		
		try {
			methodValue = method.invoke(object);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return methodValue.toString();
	}

	/**
	 * 获取某个对象属性值
	 *
	 * @param object
	 * @param field
	 * @return
	 */
	private static String getFieldValue(Object object,String field) {

		String methodName = "get" + field.substring(0, 1).toUpperCase()
				+ field.substring(1);
		Method method = null;
		Object methodValue = null;
		try {
			method = object.getClass().getMethod(methodName);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		if(null == method){
			methodName = "is" + field.substring(0, 1).toUpperCase()
					+ field.substring(1);
		}

		try {
			method = object.getClass().getMethod(methodName);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}

		try {
			methodValue = method.invoke(object);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return methodValue == null?"":methodValue.toString();
	}
}
