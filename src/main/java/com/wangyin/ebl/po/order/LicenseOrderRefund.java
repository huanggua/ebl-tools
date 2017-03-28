package com.wangyin.ebl.po.order;

import java.math.BigDecimal;
import java.util.Date;

import com.wangyin.ebl.po.license.LicenseBusinessLicense;

public class LicenseOrderRefund {
    private Integer id;

    private String orderNo;

    private String outId;

    private String payId;

    private String refundId;

    private BigDecimal applyRefundAmount;

    private BigDecimal refundAmount;

    private String refundRecvAccount;

    private String returnRefundNo;

    private String refundStatus;

    private String returnCode;

    private String returnMsg;

    private String remark;

    private Byte dbStatus;

    private Date createdDate;

    private String created;

    private Date modifiedDate;

    private String modified;
        
    private String bizId;
    
    private LicenseOrderInfo licenseOrderInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getOutId() {
        return outId;
    }

    public void setOutId(String outId) {
        this.outId = outId == null ? null : outId.trim();
    }

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId == null ? null : payId.trim();
    }

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId == null ? null : refundId.trim();
    }

    public BigDecimal getApplyRefundAmount() {
        return applyRefundAmount;
    }

    public void setApplyRefundAmount(BigDecimal applyRefundAmount) {
        this.applyRefundAmount = applyRefundAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundRecvAccount() {
        return refundRecvAccount;
    }

    public void setRefundRecvAccount(String refundRecvAccount) {
        this.refundRecvAccount = refundRecvAccount == null ? null : refundRecvAccount.trim();
    }

    public String getReturnRefundNo() {
        return returnRefundNo;
    }

    public void setReturnRefundNo(String returnRefundNo) {
        this.returnRefundNo = returnRefundNo == null ? null : returnRefundNo.trim();
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus == null ? null : refundStatus.trim();
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode == null ? null : returnCode.trim();
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg == null ? null : returnMsg.trim();
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
    public LicenseOrderInfo getLicenseOrderInfo() {
        return licenseOrderInfo;
    }

    public void setLicenseOrderInfo(LicenseOrderInfo licenseOrderInfo) {
        this.licenseOrderInfo = licenseOrderInfo == null ? null : licenseOrderInfo;
    }
}