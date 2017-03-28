package com.wangyin.ebl.po.tax;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseTaxInfo {
    private Integer id;

    private String taxNo;

    private String taxpayerType;

    private String declareWay;

    private String collectWay;

    private BigDecimal taxPreferenceLimit;

    private Date auditDate;

    private String taxPlateNo;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String entId;

    private String entPfCode;

    private String entAuthCode;

    private String entRegisterCode;

    private Date firstPayDate;

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

    public String getTaxpayerType() {
        return taxpayerType;
    }

    public void setTaxpayerType(String taxpayerType) {
        this.taxpayerType = taxpayerType == null ? null : taxpayerType.trim();
    }

    public String getDeclareWay() {
        return declareWay;
    }

    public void setDeclareWay(String declareWay) {
        this.declareWay = declareWay == null ? null : declareWay.trim();
    }

    public String getCollectWay() {
        return collectWay;
    }

    public void setCollectWay(String collectWay) {
        this.collectWay = collectWay == null ? null : collectWay.trim();
    }

    public BigDecimal getTaxPreferenceLimit() {
        return taxPreferenceLimit;
    }

    public void setTaxPreferenceLimit(BigDecimal taxPreferenceLimit) {
        this.taxPreferenceLimit = taxPreferenceLimit;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getTaxPlateNo() {
        return taxPlateNo;
    }

    public void setTaxPlateNo(String taxPlateNo) {
        this.taxPlateNo = taxPlateNo == null ? null : taxPlateNo.trim();
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

    public String getEntPfCode() {
        return entPfCode;
    }

    public void setEntPfCode(String entPfCode) {
        this.entPfCode = entPfCode == null ? null : entPfCode.trim();
    }

    public String getEntAuthCode() {
        return entAuthCode;
    }

    public void setEntAuthCode(String entAuthCode) {
        this.entAuthCode = entAuthCode == null ? null : entAuthCode.trim();
    }

    public String getEntRegisterCode() {
        return entRegisterCode;
    }

    public void setEntRegisterCode(String entRegisterCode) {
        this.entRegisterCode = entRegisterCode == null ? null : entRegisterCode.trim();
    }

    public Date getFirstPayDate() {
        return firstPayDate;
    }

    public void setFirstPayDate(Date firstPayDate) {
        this.firstPayDate = firstPayDate;
    }
}