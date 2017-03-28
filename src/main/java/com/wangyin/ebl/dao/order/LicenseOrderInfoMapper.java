package com.wangyin.ebl.dao.order;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.order.LicenseOrderInfo;

public interface LicenseOrderInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseOrderInfo record);

    int insertSelective(LicenseOrderInfo record);

    LicenseOrderInfo selectByPrimaryKey(Integer id);

    List<LicenseOrderInfo> selectByBizId(String bizId);
    
    List<LicenseOrderInfo> selectByUserId(String userId);
    
    List<LicenseOrderInfo> selectByOrderNo(String orderNo);
    
    List<LicenseOrderInfo> selectByEntId(String entId);
    
    List<LicenseOrderInfo> selectByTaxNo(String taxNo);
    
    int updateByPrimaryKeySelective(LicenseOrderInfo record);

    int updateByPrimaryKey(LicenseOrderInfo record);
}