package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseTaxCredential;
import com.wangyin.ebl.po.tax.LicenseTaxInfo;

public interface LicenseTaxInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxInfo record);

    int insertSelective(LicenseTaxInfo record);

    LicenseTaxInfo selectByPrimaryKey(Integer id);
    
    List<LicenseTaxInfo> selectByTaxNo(String taxNo);
    
    List<LicenseTaxInfo> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxInfo record);

    int updateByPrimaryKey(LicenseTaxInfo record);
}