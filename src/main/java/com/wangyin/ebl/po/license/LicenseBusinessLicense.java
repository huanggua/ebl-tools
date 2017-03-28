package com.wangyin.ebl.po.license;

import java.math.BigDecimal;
import java.util.Date;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public class LicenseBusinessLicense {
    private Integer id;

    private String userId;

    private String entName;

    private BigDecimal entPrice;

    private String entType;

    private String entAddr;

    private String entRange;

    private String ownName;

    private String ownCertid;

    private String ownCertty;

    private String entLicNum;

    private String entLicPath;

    private String bizStatus;

    private String revokeStatus;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String taxNo;

    private String entId;

    private String bankName;

    private String bankAccount;

    private String accountPlatform;
    
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

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName == null ? null : entName.trim();
    }

    public BigDecimal getEntPrice() {
        return entPrice;
    }

    public void setEntPrice(BigDecimal entPrice) {
        this.entPrice = entPrice;
    }

    public String getEntType() {
        return entType;
    }

    public void setEntType(String entType) {
        this.entType = entType == null ? null : entType.trim();
    }

    public String getEntAddr() {
        return entAddr;
    }

    public void setEntAddr(String entAddr) {
        this.entAddr = entAddr == null ? null : entAddr.trim();
    }

    public String getEntRange() {
        return entRange;
    }

    public void setEntRange(String entRange) {
        this.entRange = entRange == null ? null : entRange.trim();
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

    public String getEntLicNum() {
        return entLicNum;
    }

    public void setEntLicNum(String entLicNum) {
        this.entLicNum = entLicNum == null ? null : entLicNum.trim();
    }

    public String getEntLicPath() {
        return entLicPath;
    }

    public void setEntLicPath(String entLicPath) {
        this.entLicPath = entLicPath == null ? null : entLicPath.trim();
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus == null ? null : bizStatus.trim();
    }

    public String getRevokeStatus() {
        return revokeStatus;
    }

    public void setRevokeStatus(String revokeStatus) {
        this.revokeStatus = revokeStatus == null ? null : revokeStatus.trim();
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

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getAccountPlatform() {
        return accountPlatform;
    }

    public void setAccountPlatform(String accountPlatform) {
        this.accountPlatform = accountPlatform == null ? null : accountPlatform.trim();
    }
    
    public LicenseOrderInfo getLicenseOrderInfo() {
        return licenseOrderInfo;
    }

    public void setLicenseOrderInfo(LicenseOrderInfo licenseOrderInfo) {
        this.licenseOrderInfo = accountPlatform == null ? null : licenseOrderInfo;
    }
}