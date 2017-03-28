package com.wangyin.ebl.domain;

import javax.persistence.Column;

/**
 *
 * @author zhaoyuebing
 *
 */
public class RuleParser implements Comparable<RuleParser>{

	//规则描述
	@Column(name="功能描述")
	private String ruleDecription;
	//规则类型
	@Column(name="使用场景")
	private String ruleType;
	//规则名
	@Column(name="规则名称")
	private String field;
	//规则来源(I/O)
	@Column(name="规则来源")
	private String fieldSource;
	//计算类型
	@Column(name="计算方法")
	private String calType;
	//计算值
	@Column(name="计算值")
	private String calValue;
	//计算值类型
	@Column(name="计算值类型")
	private String calValueType;
	//是否弃用
	@Column(name="是否弃用")
	private boolean abolish = false;
	//数据来源
	@Column(name="数据来源")
	private String dataRef;
	//查询字段
	@Column(name="查询字段")
	private String queryColumn;

	public String getRuleDecription() {
		return ruleDecription;
	}
	public void setRuleDecription(String ruleDecription) {
		this.ruleDecription = ruleDecription;
	}
	public String getRuleType() {
		return ruleType;
	}
	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getFieldSource() {
		return fieldSource;
	}
	public void setFieldSource(String fieldSource) {
		this.fieldSource = fieldSource;
	}
	public String getCalType() {
		return calType;
	}
	public void setCalType(String calType) {
		this.calType = calType;
	}
	public String getCalValue() {
		return calValue;
	}
	public void setCalValue(String calValue) {
		this.calValue = calValue;
	}
	public String getCalValueType() {
		return calValueType;
	}
	public void setCalValueType(String calValueType) {
		this.calValueType = calValueType;
	}
	public boolean isAbolish() {
		return abolish;
	}
	public void setAbolish(boolean abolish) {
		this.abolish = abolish;
	}

	public String getDataRef() {
		return dataRef;
	}
	public void setDataRef(String dataRef) {
		this.dataRef = dataRef;
	}
	public String getQueryColumn() {
		return queryColumn;
	}
	public void setQueryColumn(String queryColumn) {
		this.queryColumn = queryColumn;
	}

	@Override
	public String toString() {
		return "RuleParser [ruleDecription=" + ruleDecription + ", ruleType="
				+ ruleType + ", field=" + field + ", fieldSource="
				+ fieldSource + ", calType=" + calType + ", calValue="
				+ calValue + ", calValueType=" + calValueType + ", abolish="
				+ abolish + ", dataRef=" + dataRef + ", queryColumn="
				+ queryColumn + "]";
	}

	public int compareTo(RuleParser o) {
		int lastCmp = field.compareTo(o.field);
		return (lastCmp == 0 ? fieldSource.compareTo(o.fieldSource) : lastCmp);
	}

}
