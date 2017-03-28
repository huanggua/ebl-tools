package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseBizItem;
import com.wangyin.ebl.po.license.LicenseBizOrder;

public interface LicenseBizOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseBizOrder record);

    int insertSelective(LicenseBizOrder record);

    LicenseBizOrder selectByPrimaryKey(Integer id);
    
    List<LicenseBizOrder> selectByBizId(String bizId);
    
    List<LicenseBizOrder> selectByUserId(String userId);
    
    List<LicenseBizOrder> selectByOrderNo(String orderNo);
    
    int updateByPrimaryKeySelective(LicenseBizOrder record);

    int updateByPrimaryKey(LicenseBizOrder record);
}