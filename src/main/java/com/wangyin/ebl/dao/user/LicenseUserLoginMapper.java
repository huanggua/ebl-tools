package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseUserLogin;

public interface LicenseUserLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseUserLogin record);

    int insertSelective(LicenseUserLogin record);

    LicenseUserLogin selectByPrimaryKey(Integer id);
    
    List<LicenseUserLogin> selectByUserId(String userId);
    
    List<LicenseUserLogin> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseUserLogin record);

    int updateByPrimaryKey(LicenseUserLogin record);
}