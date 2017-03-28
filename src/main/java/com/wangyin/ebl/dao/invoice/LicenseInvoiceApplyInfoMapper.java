package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoiceApplyInfo;

public interface LicenseInvoiceApplyInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoiceApplyInfo record);

    int insertSelective(LicenseInvoiceApplyInfo record);

    LicenseInvoiceApplyInfo selectByPrimaryKey(Long id);
    
    List<LicenseInvoiceApplyInfo> selectByEntId(String entId);
    
    List<LicenseInvoiceApplyInfo> selectByInvoiceApplyId(String invoiceApplyId);

    int updateByPrimaryKeySelective(LicenseInvoiceApplyInfo record);

    int updateByPrimaryKey(LicenseInvoiceApplyInfo record);
}