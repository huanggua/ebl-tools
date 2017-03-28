package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrder;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrderProduct;

public interface LicenseInvoicePlatformOrderProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoicePlatformOrderProduct record);

    int insertSelective(LicenseInvoicePlatformOrderProduct record);

    LicenseInvoicePlatformOrderProduct selectByPrimaryKey(Long id);
    
    List<LicenseInvoicePlatformOrderProduct> selectByEntId(String entId);
    
    List<LicenseInvoicePlatformOrderProduct> selectByInvoiceApplyId(String invoiceApplyId);

    int updateByPrimaryKeySelective(LicenseInvoicePlatformOrderProduct record);

    int updateByPrimaryKey(LicenseInvoicePlatformOrderProduct record);
}