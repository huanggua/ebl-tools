package com.wangyin.ebl.dao.invoice;

import java.util.List;

import com.wangyin.ebl.po.invoice.LicenseInvoiceProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceTax;

public interface LicenseInvoiceTaxMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LicenseInvoiceTax record);

    int insertSelective(LicenseInvoiceTax record);

    LicenseInvoiceTax selectByPrimaryKey(Long id);
    
    List<LicenseInvoiceTax> selectByEntId(String entId);
    
    List<LicenseInvoiceTax> selectByInvoiceApplyId(String invoiceApplyId);
    
    int updateByPrimaryKeySelective(LicenseInvoiceTax record);

    int updateByPrimaryKey(LicenseInvoiceTax record);
}