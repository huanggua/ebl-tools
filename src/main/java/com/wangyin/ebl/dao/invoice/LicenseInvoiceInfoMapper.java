package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoiceApplyInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoiceInfo;

public interface LicenseInvoiceInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoiceInfo record);

    int insertSelective(LicenseInvoiceInfo record);

    LicenseInvoiceInfo selectByPrimaryKey(Long id); 
    
    List<LicenseInvoiceInfo> selectByEntId(String entId);
    
    List<LicenseInvoiceInfo> selectByInvoiceApplyId(String invoiceApplyId);

    int updateByPrimaryKeySelective(LicenseInvoiceInfo record);

    int updateByPrimaryKey(LicenseInvoiceInfo record);
}