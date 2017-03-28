package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoiceTax {
    private Long id;

    private String invoiceApplyId;

    private String pfOrderId;

    private String pfRefundId;

    private Date orderDate;

    private BigDecimal totalNoContainsTaxAmount;

    private BigDecimal totalVatTaxAmount;

    private BigDecimal totalAdrateTaxAmount;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

    private Byte dbStatus;

    private String platform;

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

    public String getPfOrderId() {
        return pfOrderId;
    }

    public void setPfOrderId(String pfOrderId) {
        this.pfOrderId = pfOrderId == null ? null : pfOrderId.trim();
    }

    public String getPfRefundId() {
        return pfRefundId;
    }

    public void setPfRefundId(String pfRefundId) {
        this.pfRefundId = pfRefundId == null ? null : pfRefundId.trim();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getTotalNoContainsTaxAmount() {
        return totalNoContainsTaxAmount;
    }

    public void setTotalNoContainsTaxAmount(BigDecimal totalNoContainsTaxAmount) {
        this.totalNoContainsTaxAmount = totalNoContainsTaxAmount;
    }

    public BigDecimal getTotalVatTaxAmount() {
        return totalVatTaxAmount;
    }

    public void setTotalVatTaxAmount(BigDecimal totalVatTaxAmount) {
        this.totalVatTaxAmount = totalVatTaxAmount;
    }

    public BigDecimal getTotalAdrateTaxAmount() {
        return totalAdrateTaxAmount;
    }

    public void setTotalAdrateTaxAmount(BigDecimal totalAdrateTaxAmount) {
        this.totalAdrateTaxAmount = totalAdrateTaxAmount;
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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getEntId() {
        return entId;
    }

    public void setEntId(String entId) {
        this.entId = entId == null ? null : entId.trim();
    }
}