package com.wangyin.ebl.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wangyin.ebl.po.user.LicenseUserBasic;

@Repository("licenseUserBasic")
public interface LicenseUserBasicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LicenseUserBasic record);

    int insertSelective(LicenseUserBasic record);

    LicenseUserBasic selectByPrimaryKey(Integer id);
    
    List<LicenseUserBasic> selectByUserId(String userId);
    
    List<LicenseUserBasic> selectByLoginName(String loginName);

    int updateByPrimaryKeySelective(LicenseUserBasic record);

    int updateByPrimaryKey(LicenseUserBasic record);
}