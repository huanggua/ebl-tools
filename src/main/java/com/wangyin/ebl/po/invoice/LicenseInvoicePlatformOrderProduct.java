package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoicePlatformOrderProduct {
    private Long id;

    private String pfOrderId;

    private String pfProductId;

    private String pfProductName;

    private BigDecimal productMerPrice;

    private Integer productCount;

    private String productInvoiceStatus;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

    private BigDecimal productPreferentialAmount;

    private Byte dbStatus;

    private String entId;

    private LicenseInvoiceInfo licenseInvoiceInfo;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPfOrderId() {
        return pfOrderId;
    }

    public void setPfOrderId(String pfOrderId) {
        this.pfOrderId = pfOrderId == null ? null : pfOrderId.trim();
    }

    public String getPfProductId() {
        return pfProductId;
    }

    public void setPfProductId(String pfProductId) {
        this.pfProductId = pfProductId == null ? null : pfProductId.trim();
    }

    public String getPfProductName() {
        return pfProductName;
    }

    public void setPfProductName(String pfProductName) {
        this.pfProductName = pfProductName == null ? null : pfProductName.trim();
    }

    public BigDecimal getProductMerPrice() {
        return productMerPrice;
    }

    public void setProductMerPrice(BigDecimal productMerPrice) {
        this.productMerPrice = productMerPrice;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    public String getProductInvoiceStatus() {
        return productInvoiceStatus;
    }

    public void setProductInvoiceStatus(String productInvoiceStatus) {
        this.productInvoiceStatus = productInvoiceStatus == null ? null : productInvoiceStatus.trim();
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

    public BigDecimal getProductPreferentialAmount() {
        return productPreferentialAmount;
    }

    public void setProductPreferentialAmount(BigDecimal productPreferentialAmount) {
        this.productPreferentialAmount = productPreferentialAmount;
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