package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseRealnameLog;
import com.wangyin.ebl.po.user.LicenseShipAddr;
import com.wangyin.ebl.po.user.LicenseUserBasic;

public interface LicenseShipAddrMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseShipAddr record);

    int insertSelective(LicenseShipAddr record);

    LicenseShipAddr selectByPrimaryKey(Integer id);

    List<LicenseShipAddr> selectByUserId(String userId);
    
    List<LicenseShipAddr> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseShipAddr record);

    int updateByPrimaryKey(LicenseShipAddr record);
}