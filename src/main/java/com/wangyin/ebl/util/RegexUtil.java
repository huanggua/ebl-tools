package com.wangyin.ebl.util;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexUtil {
	
	private static String  regInsert = "INSERT\\s*INTO\\s*[\\w\\.]+\\s*\\(([\\w,\\s]+)\\)\\s*VALUES\\s*\\(([\\w\\W_,\\s\'\\u4e00-\\u9fa5]+)\\);";

	public static boolean isValidInsert(String sql){
		Pattern pattern = Pattern.compile(regInsert);
		Matcher matcher = pattern.matcher(sql);  
		return matcher.matches();
	}

	/**
	 * 获取Insert语句中的key和value值
	 * @param sql
	 * @return
	 * @throws SQLException 
	 */
	
	public static Map<String, String> getSqlKeyValues(String sql)
			throws SQLException {
		if (null == sql)
			throw new SQLException("sql statement can not be null.");
		
		String[] keys = sql.replaceAll(regInsert, "$1").split(",");
		String[] values = sql.replaceAll(regInsert, "$2").split(",");

		if (keys.length > values.length){
			throw new SQLException(
					"[ERROR]-> invalid insert sql statement cause key and value not match correctly,check it manually. [" + sql +"]");
		}else if(keys.length < values.length){
			values = repairValue(values);
		}
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < keys.length; i++) {
			String value = values[i].trim();
			//单引号必须成对出现
			if(value.contains("'")){
				if(StringUtil.countChar(value, '\'')!=2)
					throw new SQLException("[ERROR]-> invalid use \"'\" for value [ " +value +" ]");
				//去掉单引号
				value = value.substring(1,value.length()-1);
			}
			map.put(keys[i].trim(), value);
		}
		return map;
	}

	/**
	 * 由于value中的中文描述可能存在 '活动,活动' 的情况，使用split("'")会造成数据错误
	 * 该方法用于修复这种错误
	 * @param values
	 * @return
	 */
	private static String[] repairValue(String[]  values){
		List<String> list = new ArrayList<String>();
		String temp = "";
		boolean isRepair = false;
		for (int i = 0; i < values.length; i++) {
			String value = values[i];
			if(isRepair){
				if(StringUtil.countChar(value,'\'') % 2 == 0){
					temp += (value + ",");
				}else{
					//修复成功
					temp += value;
					list.add(temp);
					temp = "";
					isRepair = false;
				}
			}else{
				if(StringUtil.countChar(value,'\'') % 2 == 0){
					list.add(value);
				}else{
					temp += (value + ",");
					isRepair = true;
				}
			}

		}
		return list.toArray(new String[0]);
	}
    public static void main(String[] args) throws ParseException
    {
        String sql = "INSERT INTO PROMOTION_RULE_INFO (RULE_TYPE, ENTRANCE_ID, FIELD, FIELD_SOURCE, CAL_TYPE, CAL_VALUE, CAL_VALUE_TYPE, CAL_GROUPID, PRIZE_ID, " +
				"PRIZE_OVERLAY, STATUS, CREATED_DATE, CREATED, MODIFIED_DATE, MODIFIED) " +
				"VALUES ('03', 2015102900000302, 'orderType', 'O', 'IN', '104', 'c', '1', '1,2,3,4,5,6', 'a,b,c,d,e,f', '0',now(), 'shixx', now(), 'shixx');";
        
        if(isValidInsert(sql)){
        	try {
				Map<String, String> map = getSqlKeyValues(sql);
				System.err.println(map.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }else{
        	System.err.println("invalid insert sql.");
        }

	}
}
