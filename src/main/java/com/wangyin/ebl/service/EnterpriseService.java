package com.wangyin.ebl.service;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseEntLogin;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.enterprise.LicenseStore;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月30日 下午4:33:52 
 * @version 1.0 
 * @remark
 */
public interface EnterpriseService extends BaseService{
	public List<LicenseEntAuth> selectFromLicenseEntAuth(String by, String condition, String dataSource);
	public List<LicenseEntLogin> selectFromLicenseEntLogin(String by, String condition, String dataSource);
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by, String condition, String dataSource);
	public List<LicenseStore> selectFromLicenseStore(String by, String condition, String dataSource);
	
	public int deleteFromLicenseEntAuthByPrimaryKey(Integer id);
	public int deleteFromLicenseEntLoginByPrimaryKey(Integer id);
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id);
	public int deleteFromLicenseStoreByPrimaryKey(Integer id);
}
