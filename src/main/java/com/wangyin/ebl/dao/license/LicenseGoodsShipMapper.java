package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseFileSign;
import com.wangyin.ebl.po.license.LicenseGoodsShip;

public interface LicenseGoodsShipMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseGoodsShip record);

    int insertSelective(LicenseGoodsShip record);

    LicenseGoodsShip selectByPrimaryKey(Integer id);
    
    List<LicenseGoodsShip> selectByBizId(String bizId);
    
    List<LicenseGoodsShip> selectByUserId(String userId);
    
    List<LicenseGoodsShip> selectByOrderNo(String orderNo);
    
    int updateByPrimaryKeySelective(LicenseGoodsShip record);

    int updateByPrimaryKey(LicenseGoodsShip record);
}