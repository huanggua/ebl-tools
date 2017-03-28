package com.wangyin.ebl.po.user;

import java.util.Date;

public class LicenseDigitalCert {
    private Integer id;

    private String userId;

    private String bizId;

    private String envsn;

    private String envsncode;

    private String alg;

    private String dt;

    private String tt;

    private String errorCode;

    private String bjcatradesn;

    private String result;

    private String downRs;

    private String downEc;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseUserLogin licenseUserLogin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    public String getEnvsn() {
        return envsn;
    }

    public void setEnvsn(String envsn) {
        this.envsn = envsn == null ? null : envsn.trim();
    }

    public String getEnvsncode() {
        return envsncode;
    }

    public void setEnvsncode(String envsncode) {
        this.envsncode = envsncode == null ? null : envsncode.trim();
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg == null ? null : alg.trim();
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt == null ? null : dt.trim();
    }

    public String getTt() {
        return tt;
    }

    public void setTt(String tt) {
        this.tt = tt == null ? null : tt.trim();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    public String getBjcatradesn() {
        return bjcatradesn;
    }

    public void setBjcatradesn(String bjcatradesn) {
        this.bjcatradesn = bjcatradesn == null ? null : bjcatradesn.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getDownRs() {
        return downRs;
    }

    public void setDownRs(String downRs) {
        this.downRs = downRs == null ? null : downRs.trim();
    }

    public String getDownEc() {
        return downEc;
    }

    public void setDownEc(String downEc) {
        this.downEc = downEc == null ? null : downEc.trim();
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
    
    public LicenseUserLogin getLicenseUserLogin() {
    	return licenseUserLogin;
    }
    
    public void setLicenseUserLogin(LicenseUserLogin licenseUserLogin1) {
    	this.licenseUserLogin = licenseUserLogin1;
    }
}