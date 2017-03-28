package com.wangyin.ebl.service;

import java.lang.reflect.InvocationTargetException;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月13日 上午11:17:15 
 * @version 1.0 
 * @remark
 */
public interface BaseService {
	
	public int deleteByPrimaryKey(String tableName, Integer id)			throws ClassNotFoundException, InstantiationException,
	IllegalAccessException, NoSuchMethodException, SecurityException,
	IllegalArgumentException, InvocationTargetException; 
}
