package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseDzfContact;
import com.wangyin.ebl.po.tax.LicenseTaxCredential;

public interface LicenseTaxCredentialMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxCredential record);

    int insertSelective(LicenseTaxCredential record);

    LicenseTaxCredential selectByPrimaryKey(Integer id);
    
    List<LicenseTaxCredential> selectByTaxNo(String taxNo);
    
    List<LicenseTaxCredential> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxCredential record);

    int updateByPrimaryKey(LicenseTaxCredential record);
}