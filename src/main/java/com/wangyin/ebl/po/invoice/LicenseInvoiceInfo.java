package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoiceInfo {
    private Long id;

    private String invoiceApplyId;

    private String taxNo;

    private String invoiceCode;

    private String invoiceNo;

    private Date drawerDate;

    private String drawerType;

    private BigDecimal noContainsTaxAmount;

    private String antiFakeCode;

    private BigDecimal taxAmount;

    private String invoicePath;

    private String invoiceStatus;

    private String qrCode;

    private Byte uploadFlag;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

    private String buysName;

    private String buysCode;

    private String buysPhone;

    private String buysEmail;

    private String buysCompanyType;

    private String buysBankcardNo;

    private String drawerName;

    private String remark;

    private Byte dbStatus;

    private String entId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInvoiceApplyId() {
        return invoiceApplyId;
    }

    public void setInvoiceApplyId(String invoiceApplyId) {
        this.invoiceApplyId = invoiceApplyId == null ? null : invoiceApplyId.trim();
    }

    public String getTaxNo() {
        return taxNo;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo == null ? null : taxNo.trim();
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode == null ? null : invoiceCode.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Date getDrawerDate() {
        return drawerDate;
    }

    public void setDrawerDate(Date drawerDate) {
        this.drawerDate = drawerDate;
    }

    public String getDrawerType() {
        return drawerType;
    }

    public void setDrawerType(String drawerType) {
        this.drawerType = drawerType == null ? null : drawerType.trim();
    }

    public BigDecimal getNoContainsTaxAmount() {
        return noContainsTaxAmount;
    }

    public void setNoContainsTaxAmount(BigDecimal noContainsTaxAmount) {
        this.noContainsTaxAmount = noContainsTaxAmount;
    }

    public String getAntiFakeCode() {
        return antiFakeCode;
    }

    public void setAntiFakeCode(String antiFakeCode) {
        this.antiFakeCode = antiFakeCode == null ? null : antiFakeCode.trim();
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getInvoicePath() {
        return invoicePath;
    }

    public void setInvoicePath(String invoicePath) {
        this.invoicePath = invoicePath == null ? null : invoicePath.trim();
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus == null ? null : invoiceStatus.trim();
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode == null ? null : qrCode.trim();
    }

    public Byte getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Byte uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created == null ? null : created.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified == null ? null : modified.trim();
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getBuysName() {
        return buysName;
    }

    public void setBuysName(String buysName) {
        this.buysName = buysName == null ? null : buysName.trim();
    }

    public String getBuysCode() {
        return buysCode;
    }

    public void setBuysCode(String buysCode) {
        this.buysCode = buysCode == null ? null : buysCode.trim();
    }

    public String getBuysPhone() {
        return buysPhone;
    }

    public void setBuysPhone(String buysPhone) {
        this.buysPhone = buysPhone == null ? null : buysPhone.trim();
    }

    public String getBuysEmail() {
        return buysEmail;
    }

    public void setBuysEmail(String buysEmail) {
        this.buysEmail = buysEmail == null ? null : buysEmail.trim();
    }

    public String getBuysCompanyType() {
        return buysCompanyType;
    }

    public void setBuysCompanyType(String buysCompanyType) {
        this.buysCompanyType = buysCompanyType == null ? null : buysCompanyType.trim();
    }

    public String getBuysBankcardNo() {
        return buysBankcardNo;
    }

    public void setBuysBankcardNo(String buysBankcardNo) {
        this.buysBankcardNo = buysBankcardNo == null ? null : buysBankcardNo.trim();
    }

    public String getDrawerName() {
        return drawerName;
    }

    public void setDrawerName(String drawerName) {
        this.drawerName = drawerName == null ? null : drawerName.trim();
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

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }
}