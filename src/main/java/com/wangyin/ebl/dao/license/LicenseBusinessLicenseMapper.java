package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseBizOrder;
import com.wangyin.ebl.po.license.LicenseBizPrdt;
import com.wangyin.ebl.po.license.LicenseBusinessLicense;

public interface LicenseBusinessLicenseMapper {
	
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseBusinessLicense record);

    int insertSelective(LicenseBusinessLicense record);

    LicenseBusinessLicense selectByPrimaryKey(Integer id);
    
    List<LicenseBusinessLicense> selectByBizId(String bizId);
    
    List<LicenseBusinessLicense> selectByUserId(String userId);
    
    List<LicenseBusinessLicense> selectByOrderNo(String orderNo);

    List<LicenseBusinessLicense> selectByEntId(String entId);
    
    List<LicenseBusinessLicense> selectByEntName(String entName);
    
    List<LicenseBusinessLicense> selectByTaxNo(String taxNo);
    
    int updateByPrimaryKeySelective(LicenseBusinessLicense record);

    int updateByPrimaryKey(LicenseBusinessLicense record);
}