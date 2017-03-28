package com.wangyin.ebl.dao.order;

import java.util.List;

import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;

public interface LicenseOrderRefundMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseOrderRefund record);

    int insertSelective(LicenseOrderRefund record);

    LicenseOrderRefund selectByPrimaryKey(Integer id);

    List<LicenseOrderRefund> selectByBizId(String bizId);
    
    List<LicenseOrderRefund> selectByUserId(String userId);
    
    List<LicenseOrderRefund> selectByOrderNo(String orderNo);
    
    int updateByPrimaryKeySelective(LicenseOrderRefund record);

    int updateByPrimaryKey(LicenseOrderRefund record);
}