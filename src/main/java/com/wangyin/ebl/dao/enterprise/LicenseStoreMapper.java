package com.wangyin.ebl.dao.enterprise;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseStore;

public interface LicenseStoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseStore record);

    int insertSelective(LicenseStore record);

    LicenseStore selectByPrimaryKey(Integer id);
    
    List<LicenseStore> selectByEntId(String entId);
    
    List<LicenseStore> selectByEntName(String entName);
    
    List<LicenseStore> selectByTaxNo(String taxNo);

    int updateByPrimaryKeySelective(LicenseStore record);

    int updateByPrimaryKey(LicenseStore record);
}