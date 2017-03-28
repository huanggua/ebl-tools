package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseTaxPay;
import com.wangyin.ebl.po.tax.LicenseTaxPayDetail;

public interface LicenseTaxPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxPay record);

    int insertSelective(LicenseTaxPay record);

    LicenseTaxPay selectByPrimaryKey(Integer id);
    
    List<LicenseTaxPay> selectByTaxNo(String taxNo);
    
    List<LicenseTaxPay> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxPay record);

    int updateByPrimaryKey(LicenseTaxPay record);
}