package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseBizItem;
import com.wangyin.ebl.po.order.LicenseOrderInfo;

public interface LicenseBizItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseBizItem record);

    int insertSelective(LicenseBizItem record);

    LicenseBizItem selectByPrimaryKey(Integer id);
    
    List<LicenseBizItem> selectByBizId(String bizId);
    
    List<LicenseBizItem> selectByUserId(String userId);
    
    List<LicenseBizItem> selectByOrderNo(String orderNo);

    int updateByPrimaryKeySelective(LicenseBizItem record);

    int updateByPrimaryKey(LicenseBizItem record);
}