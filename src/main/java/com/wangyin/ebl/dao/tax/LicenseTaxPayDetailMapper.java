package com.wangyin.ebl.dao.tax;

import java.util.List;

import com.wangyin.ebl.po.tax.LicenseTaxInfo;
import com.wangyin.ebl.po.tax.LicenseTaxPayDetail;

public interface LicenseTaxPayDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseTaxPayDetail record);

    int insertSelective(LicenseTaxPayDetail record);

    LicenseTaxPayDetail selectByPrimaryKey(Integer id);
    
    List<LicenseTaxPayDetail> selectByTaxNo(String taxNo);
    
    List<LicenseTaxPayDetail> selectByEntId(String entId);
    
    int updateByPrimaryKeySelective(LicenseTaxPayDetail record);

    int updateByPrimaryKey(LicenseTaxPayDetail record);
}