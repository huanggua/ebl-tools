package com.wangyin.ebl.po.license;

import java.util.Date;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public class LicenseBizItem {
    private Integer id;

    private String userId;

    private String bizId;

    private String prdtKey;

    private String itemKey;

    private String itemName;

    private String itemStatus;

    private String itemOnOpe;

    private String itemOffOpe;

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

    public String getPrdtKey() {
        return prdtKey;
    }

    public void setPrdtKey(String prdtKey) {
        this.prdtKey = prdtKey == null ? null : prdtKey.trim();
    }

    public String getItemKey() {
        return itemKey;
    }

    public void setItemKey(String itemKey) {
        this.itemKey = itemKey == null ? null : itemKey.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus == null ? null : itemStatus.trim();
    }

    public String getItemOnOpe() {
        return itemOnOpe;
    }

    public void setItemOnOpe(String itemOnOpe) {
        this.itemOnOpe = itemOnOpe == null ? null : itemOnOpe.trim();
    }

    public String getItemOffOpe() {
        return itemOffOpe;
    }

    public void setItemOffOpe(String itemOffOpe) {
        this.itemOffOpe = itemOffOpe == null ? null : itemOffOpe.trim();
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

    public LicenseOrderInfo getlicenseOrderInfo() {
        return licenseOrderInfo;
    }

    public void setLicenseOrderInfo(LicenseOrderInfo licenseOrderInfo) {
        this.licenseOrderInfo = licenseOrderInfo == null ? null : licenseOrderInfo;
    }

}