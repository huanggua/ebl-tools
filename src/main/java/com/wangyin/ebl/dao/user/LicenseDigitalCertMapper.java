package com.wangyin.ebl.dao.user;

import java.util.List;

import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseExternalInfo;

public interface LicenseDigitalCertMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseDigitalCert record);

    int insertSelective(LicenseDigitalCert record);

    LicenseDigitalCert selectByPrimaryKey(Integer id);

    List<LicenseDigitalCert> selectByUserId(String userId);
    
    List<LicenseDigitalCert> selectByLoginName(String loginName);
    
    int updateByPrimaryKeySelective(LicenseDigitalCert record);

    int updateByPrimaryKey(LicenseDigitalCert record);
}