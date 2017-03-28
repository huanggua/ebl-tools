package com.wangyin.ebl.dao.order;

import java.util.List;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;

public interface LicenseOrderProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseOrderProduct record);

    int insertSelective(LicenseOrderProduct record);

    LicenseOrderProduct selectByPrimaryKey(Integer id);

    List<LicenseOrderProduct> selectByBizId(String bizId);
    
    List<LicenseOrderProduct> selectByUserId(String userId);
    
    List<LicenseOrderProduct> selectByOrderNo(String orderNo);
    
    List<LicenseOrderProduct> selectByEntId(String entId);
    
    List<LicenseOrderProduct> selectByTaxNo(String taxNo);
    
    int updateByPrimaryKeySelective(LicenseOrderProduct record);

    int updateByPrimaryKey(LicenseOrderProduct record);
}