package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseExternalInfo;
import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseUserSecurity;

public interface LicenseExternalInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseExternalInfo record);

    int insertSelective(LicenseExternalInfo record);

    LicenseExternalInfo selectByPrimaryKey(Integer id);

    List<LicenseExternalInfo> selectByUserId(String userId);
    
    List<LicenseExternalInfo> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseExternalInfo record);

    int updateByPrimaryKey(LicenseExternalInfo record);
}