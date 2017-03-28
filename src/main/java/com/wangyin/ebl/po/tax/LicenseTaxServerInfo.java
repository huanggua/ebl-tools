package com.wangyin.ebl.po.tax;

import java.util.Date;

public class LicenseTaxServerInfo {
    private Integer id;

    private String taxNo;

    private String customerManager;

    private String mainAccountant;

    private String mainAccountantTel;

    private String outAccountant;

    private String outAccountantTel;

    private String serviceTel;

    private String serviceOrg;

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

    public String getCustomerManager() {
        return customerManager;
    }

    public void setCustomerManager(String customerManager) {
        this.customerManager = customerManager == null ? null : customerManager.trim();
    }

    public String getMainAccountant() {
        return mainAccountant;
    }

    public void setMainAccountant(String mainAccountant) {
        this.mainAccountant = mainAccountant == null ? null : mainAccountant.trim();
    }

    public String getMainAccountantTel() {
        return mainAccountantTel;
    }

    public void setMainAccountantTel(String mainAccountantTel) {
        this.mainAccountantTel = mainAccountantTel == null ? null : mainAccountantTel.trim();
    }

    public String getOutAccountant() {
        return outAccountant;
    }

    public void setOutAccountant(String outAccountant) {
        this.outAccountant = outAccountant == null ? null : outAccountant.trim();
    }

    public String getOutAccountantTel() {
        return outAccountantTel;
    }

    public void setOutAccountantTel(String outAccountantTel) {
        this.outAccountantTel = outAccountantTel == null ? null : outAccountantTel.trim();
    }

    public String getServiceTel() {
        return serviceTel;
    }

    public void setServiceTel(String serviceTel) {
        this.serviceTel = serviceTel == null ? null : serviceTel.trim();
    }

    public String getServiceOrg() {
        return serviceOrg;
    }

    public void setServiceOrg(String serviceOrg) {
        this.serviceOrg = serviceOrg == null ? null : serviceOrg.trim();
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