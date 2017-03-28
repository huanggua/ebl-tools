package com.wangyin.ebl.po.tax;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseTaxPay {
    private Integer id;

    private String taxNo;

    private String taxPayId;

    private String outerReqNo;

    private String taxPeriod;

    private BigDecimal countTaxAmt;

    private BigDecimal shouldPayTax;

    private BigDecimal paidTaxAmt;

    private String taxPayStatus;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String entId;

    private BigDecimal needPayTax;

    private Date taxStartDate;

    private Date taxEndDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getTaxPayId() {
        return taxPayId;
    }

    public void setTaxPayId(String taxPayId) {
        this.taxPayId = taxPayId == null ? null : taxPayId.trim();
    }

    public String getOuterReqNo() {
        return outerReqNo;
    }

    public void setOuterReqNo(String outerReqNo) {
        this.outerReqNo = outerReqNo == null ? null : outerReqNo.trim();
    }

    public String getTaxPeriod() {
        return taxPeriod;
    }

    public void setTaxPeriod(String taxPeriod) {
        this.taxPeriod = taxPeriod == null ? null : taxPeriod.trim();
    }

    public BigDecimal getCountTaxAmt() {
        return countTaxAmt;
    }

    public void setCountTaxAmt(BigDecimal countTaxAmt) {
        this.countTaxAmt = countTaxAmt;
    }

    public BigDecimal getShouldPayTax() {
        return shouldPayTax;
    }

    public void setShouldPayTax(BigDecimal shouldPayTax) {
        this.shouldPayTax = shouldPayTax;
    }

    public BigDecimal getPaidTaxAmt() {
        return paidTaxAmt;
    }

    public void setPaidTaxAmt(BigDecimal paidTaxAmt) {
        this.paidTaxAmt = paidTaxAmt;
    }

    public String getTaxPayStatus() {
        return taxPayStatus;
    }

    public void setTaxPayStatus(String taxPayStatus) {
        this.taxPayStatus = taxPayStatus == null ? null : taxPayStatus.trim();
    }

    public Byte getDbStatus() {
        return dbStatus;
    }

    public void setDbStatus(Byte dbStatus) {
        this.dbStatus = dbStatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified == null ? null : modified.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public BigDecimal getNeedPayTax() {
        return needPayTax;
    }

    public void setNeedPayTax(BigDecimal needPayTax) {
        this.needPayTax = needPayTax;
    }

    public Date getTaxStartDate() {
        return taxStartDate;
    }

    public void setTaxStartDate(Date taxStartDate) {
        this.taxStartDate = taxStartDate;
    }

    public Date getTaxEndDate() {
        return taxEndDate;
    }

    public void setTaxEndDate(Date taxEndDate) {
        this.taxEndDate = taxEndDate;
    }
}