package com.wangyin.ebl.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.wangyin.ebl.service.BaseService;
import com.wangyin.ebl.util.StringUtil;


/** 
 * @author huangshuli@jd.com
 * @date 2016年10月13日 上午11:04:02 
 * @version 1.0 
 * @remark
 */
public class BaseServiceImpl implements BaseService{

	public int deleteByPrimaryKey(String tableName, Integer id)
			throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, NoSuchMethodException, SecurityException,
			IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub

		String methodName = StringUtil.getMethodName(tableName);
		Method m = this.getClass().getDeclaredMethod(methodName, Integer.class);
		Object result = m.invoke(this, id);
		System.out.println(result);
		return Integer.parseInt(result.toString());
	}
}
