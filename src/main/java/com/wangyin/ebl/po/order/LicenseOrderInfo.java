package com.wangyin.ebl.po.order;

import java.math.BigDecimal;
import java.util.Date;

import com.wangyin.ebl.po.license.LicenseBusinessLicense;

public class LicenseOrderInfo {
    private Integer id;

    private String userId;

    private String orderNo;

    private String bizId;

    private String bizType;

    private String orderName;

    private String orderDes;

    private BigDecimal orderPrice;

    private BigDecimal confirmRefundAmount;

    private String refundConfirm;

    private String payStatus;

    private String remark;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;

    private String entId;

    private String callbackType;
    
    private LicenseBusinessLicense licenseBusinessLicense;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId == null ? null : bizId.trim();
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType == null ? null : bizType.trim();
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName == null ? null : orderName.trim();
    }

    public String getOrderDes() {
        return orderDes;
    }

    public void setOrderDes(String orderDes) {
        this.orderDes = orderDes == null ? null : orderDes.trim();
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public BigDecimal getConfirmRefundAmount() {
        return confirmRefundAmount;
    }

    public void setConfirmRefundAmount(BigDecimal confirmRefundAmount) {
        this.confirmRefundAmount = confirmRefundAmount;
    }

    public String getRefundConfirm() {
        return refundConfirm;
    }

    public void setRefundConfirm(String refundConfirm) {
        this.refundConfirm = refundConfirm == null ? null : refundConfirm.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
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

    public String getCallbackType() {
        return callbackType;
    }

    public void setCallbackType(String callbackType) {
        this.callbackType = callbackType == null ? null : callbackType.trim();
    }
    
    public LicenseBusinessLicense getLicenseBusinessLicense() {
        return licenseBusinessLicense;
    }

    public void setLicenseBusinessLicense(LicenseBusinessLicense licenseBusinessLicense) {
        this.licenseBusinessLicense = licenseBusinessLicense == null ? null : licenseBusinessLicense;
    }
}