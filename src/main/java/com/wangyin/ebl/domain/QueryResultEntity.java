package com.wangyin.ebl.domain;

public class QueryResultEntity {
	private boolean success = false;
	private String tbody;
	private String thead;
	private String message;
	private String tableName;
	
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getTbody() {
		return tbody;
	}
	public void setTbody(String tbody) {
		this.tbody = tbody;
	}
	public String getThead() {
		return thead;
	}
	public void setThead(String thead) {
		this.thead = thead;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
