package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseBizOrder;
import com.wangyin.ebl.po.license.LicenseBizPrdt;

public interface LicenseBizPrdtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseBizPrdt record);

    int insertSelective(LicenseBizPrdt record);

    LicenseBizPrdt selectByPrimaryKey(Integer id);
    
    List<LicenseBizPrdt> selectByBizId(String bizId);
    
    List<LicenseBizPrdt> selectByUserId(String userId);
    
    List<LicenseBizPrdt> selectByOrderNo(String orderNo);

    int updateByPrimaryKeySelective(LicenseBizPrdt record);

    int updateByPrimaryKey(LicenseBizPrdt record);
}