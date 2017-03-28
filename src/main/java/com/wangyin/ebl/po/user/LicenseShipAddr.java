package com.wangyin.ebl.po.user;

import java.util.Date;

public class LicenseShipAddr {
    private Integer id;

    private String userId;

    private String shipName;

    private String shipTel;

    private String shipCode;

    private String shipAddr;

    private String addrProvince;

    private String addrCity;

    private String addrBlock;

    private Byte addrFlag;

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

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode == null ? null : shipCode.trim();
    }

    public String getShipAddr() {
        return shipAddr;
    }

    public void setShipAddr(String shipAddr) {
        this.shipAddr = shipAddr == null ? null : shipAddr.trim();
    }

    public String getAddrProvince() {
        return addrProvince;
    }

    public void setAddrProvince(String addrProvince) {
        this.addrProvince = addrProvince == null ? null : addrProvince.trim();
    }

    public String getAddrCity() {
        return addrCity;
    }

    public void setAddrCity(String addrCity) {
        this.addrCity = addrCity == null ? null : addrCity.trim();
    }

    public String getAddrBlock() {
        return addrBlock;
    }

    public void setAddrBlock(String addrBlock) {
        this.addrBlock = addrBlock == null ? null : addrBlock.trim();
    }

    public Byte getAddrFlag() {
        return addrFlag;
    }

    public void setAddrFlag(Byte addrFlag) {
        this.addrFlag = addrFlag;
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