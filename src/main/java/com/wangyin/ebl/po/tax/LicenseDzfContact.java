package com.wangyin.ebl.po.tax;

import java.util.Date;

public class LicenseDzfContact {
    private Integer id;

    private String taxNo;

    private String contractNo;

    private Date serviceBeginDate;

    private Date serviceEndDate;

    private String declareDocument;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
    
    private LicenseTaxInfo licenseTaxInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Date getServiceBeginDate() {
        return serviceBeginDate;
    }

    public void setServiceBeginDate(Date serviceBeginDate) {
        this.serviceBeginDate = serviceBeginDate;
    }

    public Date getServiceEndDate() {
        return serviceEndDate;
    }

    public void setServiceEndDate(Date serviceEndDate) {
        this.serviceEndDate = serviceEndDate;
    }

    public String getDeclareDocument() {
        return declareDocument;
    }

    public void setDeclareDocument(String declareDocument) {
        this.declareDocument = declareDocument == null ? null : declareDocument.trim();
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
    
    public LicenseTaxInfo getLicenseTaxInfo() {
        return licenseTaxInfo;
    }

    public void setLicenseTaxInfo(LicenseTaxInfo licenseTaxInfo) {
        this.licenseTaxInfo = licenseTaxInfo == null ? null : licenseTaxInfo;
    }
}