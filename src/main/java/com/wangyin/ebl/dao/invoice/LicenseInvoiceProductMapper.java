package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoiceProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProductAdrate;

public interface LicenseInvoiceProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoiceProduct record);

    int insertSelective(LicenseInvoiceProduct record);

    LicenseInvoiceProduct selectByPrimaryKey(Long id);
    
    List<LicenseInvoiceProduct> selectByEntId(String entId);
    
    List<LicenseInvoiceProduct> selectByInvoiceApplyId(String invoiceApplyId);
    
    int updateByPrimaryKeySelective(LicenseInvoiceProduct record);

    int updateByPrimaryKey(LicenseInvoiceProduct record);
}