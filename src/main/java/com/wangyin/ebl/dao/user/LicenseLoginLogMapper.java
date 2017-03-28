package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseRealnameLog;

public interface LicenseLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseLoginLog record);

    int insertSelective(LicenseLoginLog record);

    LicenseLoginLog selectByPrimaryKey(Integer id);

    List<LicenseLoginLog> selectByUserId(String userId);
    
    List<LicenseLoginLog> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseLoginLog record);

    int updateByPrimaryKey(LicenseLoginLog record);
}