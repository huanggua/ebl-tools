package com.wangyin.ebl.dao.enterprise;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseEntAuth;

public interface LicenseEntAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseEntAuth record);

    int insertSelective(LicenseEntAuth record);

    LicenseEntAuth selectByPrimaryKey(Integer id);
    
    List<LicenseEntAuth> selectByEntId(String entId);
    
    List<LicenseEntAuth> selectByEntName(String entName);
    
    List<LicenseEntAuth> selectByTaxNo(String taxNo);

    int updateByPrimaryKeySelective(LicenseEntAuth record);

    int updateByPrimaryKey(LicenseEntAuth record);
}