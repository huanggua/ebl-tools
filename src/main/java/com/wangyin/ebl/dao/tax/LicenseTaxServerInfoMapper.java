package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseTaxRateInfo;
import com.wangyin.ebl.po.tax.LicenseTaxServerInfo;

public interface LicenseTaxServerInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxServerInfo record);

    int insertSelective(LicenseTaxServerInfo record);

    LicenseTaxServerInfo selectByPrimaryKey(Integer id);
    
    List<LicenseTaxServerInfo> selectByTaxNo(String taxNo);
    
    List<LicenseTaxServerInfo> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxServerInfo record);

    int updateByPrimaryKey(LicenseTaxServerInfo record);
}