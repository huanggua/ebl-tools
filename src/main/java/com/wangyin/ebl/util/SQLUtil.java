package com.wangyin.ebl.util;

import java.util.HashMap;
import java.util.Map;

import com.wangyin.ebl.domain.TableTypeEnum;

public class SQLUtil {

	/**
	 * 不带分页的sql
	 * 
	 * @param tableType
	 * @param params
	 * @return sql
	 */
	public static String generateSelectStatement(TableTypeEnum tableType,
			Map<String, Object> params) {

		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM ");
		sb.append(tableType.getTableName());
		if (null == params)
			return sb.toString();
		boolean isWhereNeed = true;
		for (Map.Entry<String, Object> entry : params.entrySet()) {
			if (isWhereNeed) {
				sb.append(" WHERE ");
				isWhereNeed = false;
			} else {
				sb.append(" AND ");
			}

			if (entry.getValue() != null) {
				sb.append(entry.getKey() + " ='" + entry.getValue() + "'");
			} else {
				sb.append(entry.getKey() + " IS NULL");
			}
		}
		return sb.toString();
	}

	public static String generateSelectStatement(TableTypeEnum tableType,
			Map<String, Object> params, int pageSize, int pageIndex) {

		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM ");
		sb.append(tableType.getTableName());
		int start = pageSize * (pageIndex -1);
		if (null == params){
			sb.append(" LIMIT " +start+","+ pageSize);
			return sb.toString();
		}
		boolean isWhereNeed = true;

		for (Map.Entry<String, Object> entry : params.entrySet()) {
			if (isWhereNeed) {
				sb.append(" WHERE ");
				isWhereNeed = false;
			} else {
				sb.append(" AND ");
			}

			if (entry.getValue() != null) {
				sb.append(entry.getKey() + " ='" + entry.getValue() + "'");
			} else {
				sb.append(entry.getKey() + " IS NULL");
			}
		}
		sb.append(" LIMIT " +start+"," + pageSize);
		return sb.toString();
	}

	public static void main(String[] args) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("EXP_MONEY_TYPE", 20);
		params.put("EXP_MONEY", 100000);
		params.put("COUNT_TIME", null);
//		System.err.println(generateSelectStatement(TableTypeEnum.EXPERIENCE_MONEY_INFO, params));
//		System.err.println(generateSelectStatement(TableTypeEnum.EXPERIENCE_MONEY_INFO, null));
//		System.err.println(generateSelectStatement(TableTypeEnum.EXPERIENCE_MONEY_INFO, params,10,1));
//		System.err.println(generateSelectStatement(TableTypeEnum.EXPERIENCE_MONEY_INFO, null,15,3));
	}
}
