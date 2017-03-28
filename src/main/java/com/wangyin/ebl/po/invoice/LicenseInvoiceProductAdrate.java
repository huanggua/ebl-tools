package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoiceProductAdrate {
    private Long id;

    private String invoiceApplyId;

    private String pfProductId;

    private String taxItemName;

    private String taxItemCode;

    private BigDecimal taxRate;

    private BigDecimal taxAmount;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

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

    public String getPfProductId() {
        return pfProductId;
    }

    public void setPfProductId(String pfProductId) {
        this.pfProductId = pfProductId == null ? null : pfProductId.trim();
    }

    public String getTaxItemName() {
        return taxItemName;
    }

    public void setTaxItemName(String taxItemName) {
        this.taxItemName = taxItemName == null ? null : taxItemName.trim();
    }

    public String getTaxItemCode() {
        return taxItemCode;
    }

    public void setTaxItemCode(String taxItemCode) {
        this.taxItemCode = taxItemCode == null ? null : taxItemCode.trim();
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
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