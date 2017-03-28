package com.wangyin.ebl.po.enterprise;

import java.util.Date;

public class LicenseEntAuth {
    private Integer id;

    private String entId;

    private String authName;

    private String authCertid;

    private String authCertty;

    private Byte authType;

    private String permissionList;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseEntLogin licenseEntLogin;
    
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

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName == null ? null : authName.trim();
    }

    public String getAuthCertid() {
        return authCertid;
    }

    public void setAuthCertid(String authCertid) {
        this.authCertid = authCertid == null ? null : authCertid.trim();
    }

    public String getAuthCertty() {
        return authCertty;
    }

    public void setAuthCertty(String authCertty) {
        this.authCertty = authCertty == null ? null : authCertty.trim();
    }

    public Byte getAuthType() {
        return authType;
    }

    public void setAuthType(Byte authType) {
        this.authType = authType;
    }

    public String getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(String permissionList) {
        this.permissionList = permissionList == null ? null : permissionList.trim();
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
    
    public LicenseEntLogin getLicenseEntLogin() {
        return licenseEntLogin;
    }

    public void setLicenseEntLogin(LicenseEntLogin licenseEntLogin) {
        this.licenseEntLogin = licenseEntLogin == null ? null : licenseEntLogin;
    }
    
    public LicenseServiceApply getLicenseServiceApply() {
        return licenseServiceApply;
    }

    public void setLicenseServiceApply(LicenseServiceApply licenseServiceApply) {
        this.licenseServiceApply = licenseServiceApply == null ? null : licenseServiceApply;
    }
}