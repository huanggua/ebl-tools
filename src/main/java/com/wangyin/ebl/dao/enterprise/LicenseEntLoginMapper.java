package com.wangyin.ebl.dao.enterprise;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseEntLogin;

public interface LicenseEntLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseEntLogin record);

    int insertSelective(LicenseEntLogin record);

    LicenseEntLogin selectByPrimaryKey(Integer id);
    
    List<LicenseEntLogin> selectByEntId(String entId);
    
    List<LicenseEntLogin> selectByEntName(String entName);
    
    List<LicenseEntLogin> selectByTaxNo(String taxNo);

    int updateByPrimaryKeySelective(LicenseEntLogin record);

    int updateByPrimaryKey(LicenseEntLogin record);
}