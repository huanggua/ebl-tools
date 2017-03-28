package com.wangyin.ebl.po.license;

import java.util.Date;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public class LicenseProxyAppointment {
    private Integer id;

    private String userId;

    private String bizId;

    private String proxyKey;

    private String proxyName;

    private Date proxyStart;

    private Date proxyEnd;

    private String proxyStatus;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseOrderInfo licenseOrderInfo;
    
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

    public String getProxyKey() {
        return proxyKey;
    }

    public void setProxyKey(String proxyKey) {
        this.proxyKey = proxyKey == null ? null : proxyKey.trim();
    }

    public String getProxyName() {
        return proxyName;
    }

    public void setProxyName(String proxyName) {
        this.proxyName = proxyName == null ? null : proxyName.trim();
    }

    public Date getProxyStart() {
        return proxyStart;
    }

    public void setProxyStart(Date proxyStart) {
        this.proxyStart = proxyStart;
    }

    public Date getProxyEnd() {
        return proxyEnd;
    }

    public void setProxyEnd(Date proxyEnd) {
        this.proxyEnd = proxyEnd;
    }

    public String getProxyStatus() {
        return proxyStatus;
    }

    public void setProxyStatus(String proxyStatus) {
        this.proxyStatus = proxyStatus == null ? null : proxyStatus.trim();
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
    
    public LicenseOrderInfo getLicenseOrderInfo() {
        return licenseOrderInfo;
    }

    public void setLicenseOrderInfo(LicenseOrderInfo licenseOrderInfo) {
        this.licenseOrderInfo = licenseOrderInfo == null ? null : licenseOrderInfo;
    }
}