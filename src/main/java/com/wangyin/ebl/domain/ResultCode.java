/**
 * @Title: ResultCodeEnum.java
 * 
 * @Package com.wangyin.marketing.domain
 *
 * @date 2015-11-7 下午11:15:05
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.domain;

public enum ResultCode {
	
	SAVE_SUCCESS("SAVE_SUCCESS","插入成功!"),
	SAVE_FAILED("SAVE_FAILED","插入失败!"),
	UPDATE_SUCCESS("UPDATE_SUCCESS","修改成功!"),
	UPDATE_FAILED("UPDATE_FAILED","修改失败!"),
	DELETE_SUCCESS("UPDATE_SUCCESS","成功删除%s条记录!"),
	DELETE_FAILED("DELETE_FAILED","删除失败!"),
	NO_DATA_SOURCE("NO_DATA_SOURCE","未传入数据源参数!"),
	NO_DATA("NO_DATA","没有查询到任何记录!");
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	ResultCode(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	private String code;
	private String description;
}
