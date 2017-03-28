package com.wangyin.ebl.po.enterprise;

import java.util.Date;

public class LicenseStore {
    private Integer id;

    private String entId;

    private String storeType;

    private String name;

    private String url;

    private Byte auditState;

    private String auditFailDesc;

    private String refreshToken;

    private String accessToken;

    private String storeExt;

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

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Byte getAuditState() {
        return auditState;
    }

    public void setAuditState(Byte auditState) {
        this.auditState = auditState;
    }

    public String getAuditFailDesc() {
        return auditFailDesc;
    }

    public void setAuditFailDesc(String auditFailDesc) {
        this.auditFailDesc = auditFailDesc == null ? null : auditFailDesc.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getStoreExt() {
        return storeExt;
    }

    public void setStoreExt(String storeExt) {
        this.storeExt = storeExt == null ? null : storeExt.trim();
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