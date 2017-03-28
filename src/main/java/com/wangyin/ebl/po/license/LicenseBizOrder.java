package com.wangyin.ebl.po.license;

import java.util.Date;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public class LicenseBizOrder {
    private Integer id;

    private String userId;

    private String bizId;

    private String bizStatus;

    private Date bizStart;

    private Date bizEnd;

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

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus == null ? null : bizStatus.trim();
    }

    public Date getBizStart() {
        return bizStart;
    }

    public void setBizStart(Date bizStart) {
        this.bizStart = bizStart;
    }

    public Date getBizEnd() {
        return bizEnd;
    }

    public void setBizEnd(Date bizEnd) {
        this.bizEnd = bizEnd;
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