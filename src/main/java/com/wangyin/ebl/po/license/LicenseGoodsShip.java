package com.wangyin.ebl.po.license;

import java.util.Date;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public class LicenseGoodsShip {
    private Integer id;

    private String userId;

    private String bizId;

    private String shipName;

    private String shipTel;

    private String shipAddr;

    private String shipCode;

    private String shipStatus;

    private String shipSender;

    private String shipComp;

    private String shipNum;

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

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName == null ? null : shipName.trim();
    }

    public String getShipTel() {
        return shipTel;
    }

    public void setShipTel(String shipTel) {
        this.shipTel = shipTel == null ? null : shipTel.trim();
    }

    public String getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(String shipAddr) {
        this.shipAddr = shipAddr == null ? null : shipAddr.trim();
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipStatus() {
        return shipStatus;
    }

    public void setShipStatus(String shipStatus) {
        this.shipStatus = shipStatus == null ? null : shipStatus.trim();
    }

    public String getShipSender() {
        return shipSender;
    }

    public void setShipSender(String shipSender) {
        this.shipSender = shipSender == null ? null : shipSender.trim();
    }

    public String getShipComp() {
        return shipComp;
    }

    public void setShipComp(String shipComp) {
        this.shipComp = shipComp == null ? null : shipComp.trim();
    }

    public String getShipNum() {
        return shipNum;
    }

    public void setShipNum(String shipNum) {
        this.shipNum = shipNum == null ? null : shipNum.trim();
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