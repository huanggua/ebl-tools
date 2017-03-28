package com.wangyin.ebl.po.enterprise;

import java.util.Date;

public class LicenseEntLogin {
    private Integer id;

    private String entId;

    private String entLicNum;

    private String entName;

    private String ownName;

    private String ownCertid;

    private String ownCertty;

    private String entPassword;

    private String entSalt;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseServiceApply licenseServiceApply;

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

    public String getEntLicNum() {
        return entLicNum;
    }

    public void setEntLicNum(String entLicNum) {
        this.entLicNum = entLicNum == null ? null : entLicNum.trim();
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName == null ? null : ownName.trim();
    }

    public String getOwnCertid() {
        return ownCertid;
    }

    public void setOwnCertid(String ownCertid) {
        this.ownCertid = ownCertid == null ? null : ownCertid.trim();
    }

    public String getOwnCertty() {
        return ownCertty;
    }

    public void setOwnCertty(String ownCertty) {
        this.ownCertty = ownCertty == null ? null : ownCertty.trim();
    }

    public String getEntPassword() {
        return entPassword;
    }

    public void setEntPassword(String entPassword) {
        this.entPassword = entPassword == null ? null : entPassword.trim();
    }

    public String getEntSalt() {
        return entSalt;
    }

    public void setEntSalt(String entSalt) {
        this.entSalt = entSalt == null ? null : entSalt.trim();
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

    public LicenseServiceApply getLicenseServiceApply() {
        return licenseServiceApply;
    }

    public void setLicenseServiceApply(LicenseServiceApply licenseServiceApply) {
        this.licenseServiceApply = licenseServiceApply == null ? null : licenseServiceApply;
    }
}