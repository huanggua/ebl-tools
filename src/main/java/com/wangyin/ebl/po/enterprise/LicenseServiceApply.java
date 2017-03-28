package com.wangyin.ebl.po.enterprise;

import java.util.Date;

import com.wangyin.ebl.po.invoice.LicenseInvoiceInfo;

public class LicenseServiceApply {
    private Integer id;

    private String serviceApplyId;

    private String taxNo;

    private String servicePlatform;

    private String serviceType;

    private String serviceApplyStatus;

    private String remark;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String entId;

    private String applyCertPath;

    private String confirmed;    
    
    private LicenseEntLogin licenseEntLogin;
    
    private LicenseInvoiceInfo licenseInvoiceInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceApplyId() {
        return serviceApplyId;
    }

    public void setServiceApplyId(String serviceApplyId) {
        this.serviceApplyId = serviceApplyId == null ? null : serviceApplyId.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getServicePlatform() {
        return servicePlatform;
    }

    public void setServicePlatform(String servicePlatform) {
        this.servicePlatform = servicePlatform == null ? null : servicePlatform.trim();
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType == null ? null : serviceType.trim();
    }

    public String getServiceApplyStatus() {
        return serviceApplyStatus;
    }

    public void setServiceApplyStatus(String serviceApplyStatus) {
        this.serviceApplyStatus = serviceApplyStatus == null ? null : serviceApplyStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }

    public String getApplyCertPath() {
        return applyCertPath;
    }

    public void setApplyCertPath(String applyCertPath) {
        this.applyCertPath = applyCertPath == null ? null : applyCertPath.trim();
    }

    public String getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(String confirmed) {
        this.confirmed = confirmed == null ? null : confirmed.trim();
    }
    
    public LicenseEntLogin getLicenseEntLogin() {
        return licenseEntLogin;
    }

    public void setLicenseEntLogin(LicenseEntLogin licenseEntLogin) {
        this.licenseEntLogin = licenseEntLogin == null ? null : licenseEntLogin;
    }

    public LicenseInvoiceInfo getLicenseInvoiceInfo() {
        return licenseInvoiceInfo;
    }

    public void setLicenseInvoiceInfo(LicenseInvoiceInfo licenseInvoiceInfo) {
        this.licenseInvoiceInfo = licenseInvoiceInfo == null ? null : licenseInvoiceInfo;
    }
}