package com.wangyin.ebl.dao.enterprise;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrderProduct;

public interface LicenseServiceApplyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseServiceApply record);

    int insertSelective(LicenseServiceApply record);

    LicenseServiceApply selectByPrimaryKey(Integer id);
    
    List<LicenseServiceApply> selectByEntId(String entId);
    
    List<LicenseServiceApply> selectByEntName(String entName);
    
    List<LicenseServiceApply> selectByTaxNo(String taxNo);
    
    List<LicenseServiceApply> selectByInvoiceApplyId(String invoiceApplyId);

    int updateByPrimaryKeySelective(LicenseServiceApply record);

    int updateByPrimaryKey(LicenseServiceApply record);
}