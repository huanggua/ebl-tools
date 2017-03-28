package com.wangyin.ebl.po.tax;

import java.math.BigDecimal;
import java.util.Date;

public class LicenseTaxRateInfo {
    private Integer id;

    private String taxNo;

    private String taxItemName;

    private String taxItemCode;

    private BigDecimal taxRate;

    private String taxRateBasic;

    private BigDecimal exemptSaleLimit;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String entId;

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

    public String getTaxRateBasic() {
        return taxRateBasic;
    }

    public void setTaxRateBasic(String taxRateBasic) {
        this.taxRateBasic = taxRateBasic == null ? null : taxRateBasic.trim();
    }

    public BigDecimal getExemptSaleLimit() {
        return exemptSaleLimit;
    }

    public void setExemptSaleLimit(BigDecimal exemptSaleLimit) {
        this.exemptSaleLimit = exemptSaleLimit;
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
}