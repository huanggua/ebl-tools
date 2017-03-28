package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoicePlatformOrder {
    private Long id;

    private String platform;

    private String pfUserName;

    private String pfOrderId;

    private String pfRefundId;

    private Date orderDate;

    private BigDecimal orderAmount;

    private String orderInvoiceStatus;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

    private Byte dbStatus;

    private String entId;

    private LicenseInvoiceInfo licenseInvoiceInfo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getPfUserName() {
        return pfUserName;
    }

    public void setPfUserName(String pfUserName) {
        this.pfUserName = pfUserName == null ? null : pfUserName.trim();
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

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderInvoiceStatus() {
        return orderInvoiceStatus;
    }

    public void setOrderInvoiceStatus(String orderInvoiceStatus) {
        this.orderInvoiceStatus = orderInvoiceStatus == null ? null : orderInvoiceStatus.trim();
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

    public LicenseInvoiceInfo getLicenseInvoiceInfo() {
        return licenseInvoiceInfo;
    }

    public void setLicenseInvoiceInfo(LicenseInvoiceInfo licenseInvoiceInfo) {
        this.licenseInvoiceInfo = licenseInvoiceInfo == null ? null : licenseInvoiceInfo;
    }
}