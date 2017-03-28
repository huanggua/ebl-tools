package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseDzfContact;

public interface LicenseDzfContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseDzfContact record);

    int insertSelective(LicenseDzfContact record);

    LicenseDzfContact selectByPrimaryKey(Integer id);
    
    List<LicenseDzfContact> selectByTaxNo(String taxNo);
    
    List<LicenseDzfContact> selectByEntId(String entId);

    int updateByPrimaryKeySelective(LicenseDzfContact record);

    int updateByPrimaryKey(LicenseDzfContact record);
}