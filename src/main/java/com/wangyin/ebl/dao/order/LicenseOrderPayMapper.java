package com.wangyin.ebl.dao.order;

import java.util.List;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;

public interface LicenseOrderPayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseOrderPay record);

    int insertSelective(LicenseOrderPay record);

    LicenseOrderPay selectByPrimaryKey(Integer id);

    List<LicenseOrderPay> selectByBizId(String bizId);
    
    List<LicenseOrderPay> selectByUserId(String userId);
    
    List<LicenseOrderPay> selectByOrderNo(String orderNo);
    
    List<LicenseOrderPay> selectByEntId(String entId);
    
    List<LicenseOrderPay> selectByTaxNo(String taxNo);
    
    
    int updateByPrimaryKeySelective(LicenseOrderPay record);

    int updateByPrimaryKey(LicenseOrderPay record);
}