package com.wangyin.ebl.dao.license;

import java.util.List;

import com.wangyin.ebl.po.license.LicenseGoodsShip;
import com.wangyin.ebl.po.license.LicenseProxyAppointment;

public interface LicenseProxyAppointmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseProxyAppointment record);

    int insertSelective(LicenseProxyAppointment record);

    LicenseProxyAppointment selectByPrimaryKey(Integer id);
    
    List<LicenseProxyAppointment> selectByBizId(String bizId);
    
    List<LicenseProxyAppointment> selectByUserId(String userId);
    
    List<LicenseProxyAppointment> selectByOrderNo(String orderNo);
    
    int updateByPrimaryKeySelective(LicenseProxyAppointment record);

    int updateByPrimaryKey(LicenseProxyAppointment record);
}