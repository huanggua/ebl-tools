/**
 * @Title: RelationQueryEntity.java
 * 
 * @Package com.wangyin.marketing.domain
 *
 * @date 2015-11-8 下午6:16:34
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.domain;

import java.util.ArrayList;
import java.util.List;

public class RelationQueryEntity {
	private boolean success = false;
	private String message;
	private List<QueryResultEntity> entities = new ArrayList<QueryResultEntity>();
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<QueryResultEntity> getEntities() {
		return entities;
	}
	public void setEntities(List<QueryResultEntity> entities) {
		this.entities = entities;
	}
	public void addQueryResult(QueryResultEntity queryResultEntity){
		entities.add(queryResultEntity);
	}
	
}
