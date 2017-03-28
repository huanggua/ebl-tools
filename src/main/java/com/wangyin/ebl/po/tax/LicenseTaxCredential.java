package com.wangyin.ebl.po.tax;

import java.util.Date;

public class LicenseTaxCredential {
    private Integer id;

    private String entId;

    private String taxNo;

    private String credentialPath;

    private String credentialYear;

    private String credentialMonth;

    private String credentialId;

    private String extCredentialId;

    private Byte uploadFlag;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String nanoCredentialPath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getCredentialPath() {
        return credentialPath;
    }

    public void setCredentialPath(String credentialPath) {
        this.credentialPath = credentialPath == null ? null : credentialPath.trim();
    }

    public String getCredentialYear() {
        return credentialYear;
    }

    public void setCredentialYear(String credentialYear) {
        this.credentialYear = credentialYear == null ? null : credentialYear.trim();
    }

    public String getCredentialMonth() {
        return credentialMonth;
    }

    public void setCredentialMonth(String credentialMonth) {
        this.credentialMonth = credentialMonth == null ? null : credentialMonth.trim();
    }

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId == null ? null : credentialId.trim();
    }

    public String getExtCredentialId() {
        return extCredentialId;
    }

    public void setExtCredentialId(String extCredentialId) {
        this.extCredentialId = extCredentialId == null ? null : extCredentialId.trim();
    }

    public Byte getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Byte uploadFlag) {
        this.uploadFlag = uploadFlag;
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

    public String getNanoCredentialPath() {
        return nanoCredentialPath;
    }

    public void setNanoCredentialPath(String nanoCredentialPath) {
        this.nanoCredentialPath = nanoCredentialPath == null ? null : nanoCredentialPath.trim();
    }
}