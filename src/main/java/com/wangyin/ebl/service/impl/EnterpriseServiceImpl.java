package com.wangyin.ebl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.enterprise.LicenseEntAuthMapper;
import com.wangyin.ebl.dao.enterprise.LicenseEntLoginMapper;
import com.wangyin.ebl.dao.enterprise.LicenseServiceApplyMapper;
import com.wangyin.ebl.dao.enterprise.LicenseStoreMapper;
import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseEntLogin;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.enterprise.LicenseStore;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.service.EnterpriseService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月30日 下午4:34:18 
 * @version 1.0 
 * @remark
 */
@Service("enterpriseService")
public class EnterpriseServiceImpl extends BaseServiceImpl implements EnterpriseService{
	@Resource
	private LicenseEntAuthMapper licenseEntAuthMapper;
	
	@Resource
	private LicenseEntLoginMapper licenseEntLoginMapper;
	
	@Resource
	private LicenseServiceApplyMapper licenseServiceApplyMapper;
	
	@Resource
	private LicenseStoreMapper licenseStoreMapper;
	
	@Override
	public List<LicenseEntAuth> selectFromLicenseEntAuth(String by, String condition, String dataSource) {
		if (by.trim().equals("ENT_ID"))
			return licenseEntAuthMapper.selectByEntId(condition);
		else if(by.trim().equals("ENT_NAME"))
			return licenseEntAuthMapper.selectByEntName(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseEntAuthMapper.selectByTaxNo(condition);
		else
			return null;
	}
	
	@Override
	public List<LicenseEntLogin> selectFromLicenseEntLogin(String by, String condition, String dataSource) {
		if (by.trim().equals("ENT_ID"))
			return licenseEntLoginMapper.selectByEntId(condition);
		else if(by.trim().equals("ENT_NAME"))
			return licenseEntLoginMapper.selectByEntName(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseEntLoginMapper.selectByTaxNo(condition);
		else
			return null;
	}
	
	@Override
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by, String condition, String dataSource) {
		if (by.trim().equals("ENT_ID"))
			return licenseServiceApplyMapper.selectByEntId(condition);
		else if(by.trim().equals("ENT_NAME"))
			return licenseServiceApplyMapper.selectByEntName(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseServiceApplyMapper.selectByTaxNo(condition);
		else
			return null;
	}
	
	@Override
	public List<LicenseStore> selectFromLicenseStore(String by, String condition, String dataSource) {
		if (by.trim().equals("ENT_ID"))
			return licenseStoreMapper.selectByEntId(condition);
		else if(by.trim().equals("ENT_NAME"))
			return licenseStoreMapper.selectByEntName(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseStoreMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public int deleteFromLicenseEntAuthByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseEntAuthMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseEntLoginByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseEntLoginMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseServiceApplyMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseStoreByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseStoreMapper.deleteByPrimaryKey(id);
	}
	
	
}
