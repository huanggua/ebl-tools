package com.wangyin.ebl.po.invoice;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseInvoiceProduct {
    private Long id;

    private String invoiceApplyId;

    private String pfProductId;

    private String productName;

    private String division;

    private String sellingType;

    private String specifications;

    private String taxClassificationCode;

    private String containsTaxFlag;

    private Integer itemCount;

    private BigDecimal parTaxRate;

    private BigDecimal productMerPrice;

    private BigDecimal noContainsTaxAmount;

    private BigDecimal vatTaxAmount;

    private BigDecimal adrateTaxAmount;

    private String created;

    private Date createdDate;

    private String modified;

    private Date modifiedDate;

    private Byte discountFlag;

    private Byte dbStatus;

    private String entId;

    private BigDecimal parNoContainsTaxAmount;

    private BigDecimal parTaxAmount;

    private BigDecimal parMerPrice;

    private String invoiceProperty;

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division == null ? null : division.trim();
    }

    public String getSellingType() {
        return sellingType;
    }

    public void setSellingType(String sellingType) {
        this.sellingType = sellingType == null ? null : sellingType.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getTaxClassificationCode() {
        return taxClassificationCode;
    }

    public void setTaxClassificationCode(String taxClassificationCode) {
        this.taxClassificationCode = taxClassificationCode == null ? null : taxClassificationCode.trim();
    }

    public String getContainsTaxFlag() {
        return containsTaxFlag;
    }

    public void setContainsTaxFlag(String containsTaxFlag) {
        this.containsTaxFlag = containsTaxFlag == null ? null : containsTaxFlag.trim();
    }

    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    public BigDecimal getParTaxRate() {
        return parTaxRate;
    }

    public void setParTaxRate(BigDecimal parTaxRate) {
        this.parTaxRate = parTaxRate;
    }

    public BigDecimal getProductMerPrice() {
        return productMerPrice;
    }

    public void setProductMerPrice(BigDecimal productMerPrice) {
        this.productMerPrice = productMerPrice;
    }

    public BigDecimal getNoContainsTaxAmount() {
        return noContainsTaxAmount;
    }

    public void setNoContainsTaxAmount(BigDecimal noContainsTaxAmount) {
        this.noContainsTaxAmount = noContainsTaxAmount;
    }

    public BigDecimal getVatTaxAmount() {
        return vatTaxAmount;
    }

    public void setVatTaxAmount(BigDecimal vatTaxAmount) {
        this.vatTaxAmount = vatTaxAmount;
    }

    public BigDecimal getAdrateTaxAmount() {
        return adrateTaxAmount;
    }

    public void setAdrateTaxAmount(BigDecimal adrateTaxAmount) {
        this.adrateTaxAmount = adrateTaxAmount;
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

    public Byte getDiscountFlag() {
        return discountFlag;
    }

    public void setDiscountFlag(Byte discountFlag) {
        this.discountFlag = discountFlag;
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

    public BigDecimal getParNoContainsTaxAmount() {
        return parNoContainsTaxAmount;
    }

    public void setParNoContainsTaxAmount(BigDecimal parNoContainsTaxAmount) {
        this.parNoContainsTaxAmount = parNoContainsTaxAmount;
    }

    public BigDecimal getParTaxAmount() {
        return parTaxAmount;
    }

    public void setParTaxAmount(BigDecimal parTaxAmount) {
        this.parTaxAmount = parTaxAmount;
    }

    public BigDecimal getParMerPrice() {
        return parMerPrice;
    }

    public void setParMerPrice(BigDecimal parMerPrice) {
        this.parMerPrice = parMerPrice;
    }

    public String getInvoiceProperty() {
        return invoiceProperty;
    }

    public void setInvoiceProperty(String invoiceProperty) {
        this.invoiceProperty = invoiceProperty == null ? null : invoiceProperty.trim();
    }
}