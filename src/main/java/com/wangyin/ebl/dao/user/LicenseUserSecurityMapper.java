package com.wangyin.ebl.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wangyin.ebl.po.user.LicenseUserSecurity;

@Repository("licenseUserSecurity")
public interface LicenseUserSecurityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseUserSecurity record);

    int insertSelective(LicenseUserSecurity record);

    LicenseUserSecurity selectByPrimaryKey(Integer id);
    
    List<LicenseUserSecurity> selectByUserId(String userId);
    
    List<LicenseUserSecurity> selectByLoginName(String loginName);

    int updateByPrimaryKeySelective(LicenseUserSecurity record);

    int updateByPrimaryKey(LicenseUserSecurity record);
}