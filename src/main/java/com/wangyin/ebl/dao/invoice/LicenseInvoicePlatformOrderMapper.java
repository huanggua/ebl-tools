package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoiceInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrder;

public interface LicenseInvoicePlatformOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoicePlatformOrder record);

    int insertSelective(LicenseInvoicePlatformOrder record);

    LicenseInvoicePlatformOrder selectByPrimaryKey(Long id);
    
    List<LicenseInvoicePlatformOrder> selectByEntId(String entId);
    
    List<LicenseInvoicePlatformOrder> selectByInvoiceApplyId(String invoiceApplyId);

    int updateByPrimaryKeySelective(LicenseInvoicePlatformOrder record);

    int updateByPrimaryKey(LicenseInvoicePlatformOrder record);
}