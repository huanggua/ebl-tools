package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrderProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProductAdrate;

public interface LicenseInvoiceProductAdrateMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoiceProductAdrate record);

    int insertSelective(LicenseInvoiceProductAdrate record);

    LicenseInvoiceProductAdrate selectByPrimaryKey(Long id);
    
    List<LicenseInvoiceProductAdrate> selectByEntId(String entId);
    
    List<LicenseInvoiceProductAdrate> selectByInvoiceApplyId(String invoiceApplyId);
    
    int updateByPrimaryKeySelective(LicenseInvoiceProductAdrate record);

    int updateByPrimaryKey(LicenseInvoiceProductAdrate record);
}