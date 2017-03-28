package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseTaxPay;
import com.wangyin.ebl.po.tax.LicenseTaxRateInfo;

public interface LicenseTaxRateInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxRateInfo record);

    int insertSelective(LicenseTaxRateInfo record);

    LicenseTaxRateInfo selectByPrimaryKey(Integer id);
    
    List<LicenseTaxRateInfo> selectByTaxNo(String taxNo);
    
    List<LicenseTaxRateInfo> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxRateInfo record);

    int updateByPrimaryKey(LicenseTaxRateInfo record);
}