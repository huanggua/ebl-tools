package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseRealnameLog;
import com.wangyin.ebl.po.user.LicenseShipAddr;

public interface LicenseRealnameLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseRealnameLog record);

    int insertSelective(LicenseRealnameLog record);

    LicenseRealnameLog selectByPrimaryKey(Integer id);

    List<LicenseRealnameLog> selectByUserId(String userId);
    
    List<LicenseRealnameLog> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseRealnameLog record);

    int updateByPrimaryKey(LicenseRealnameLog record);
}