package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseBizPrdt;
import com.wangyin.ebl.po.license.LicenseFileSign;

public interface LicenseFileSignMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseFileSign record);

    int insertSelective(LicenseFileSign record);

    LicenseFileSign selectByPrimaryKey(Integer id);
    
    List<LicenseFileSign> selectByBizId(String bizId);
    
    List<LicenseFileSign> selectByUserId(String userId);
    
    List<LicenseFileSign> selectByOrderNo(String orderNo);

    int updateByPrimaryKeySelective(LicenseFileSign record);

    int updateByPrimaryKey(LicenseFileSign record);
}