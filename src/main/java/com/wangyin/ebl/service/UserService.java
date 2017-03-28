package com.wangyin.ebl.service;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseExternalInfo;
import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseRealnameLog;
import com.wangyin.ebl.po.user.LicenseShipAddr;
import com.wangyin.ebl.po.user.LicenseUserBasic;
import com.wangyin.ebl.po.user.LicenseUserLogin;
import com.wangyin.ebl.po.user.LicenseUserSecurity;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月28日 上午10:00:05 
 * @version 1.0 
 * @remark
 */

public interface UserService extends BaseService{
	public List<LicenseUserBasic> selectFromLicenseUserBasic(String by, String condition, String dataSource);
	public List<LicenseUserSecurity> selectFromLicenseUserSecurity(String by, String condition, String dataSource);
	public List<LicenseShipAddr> selectFromLicenseShipAddr(String by, String condition, String dataSource);
	public List<LicenseRealnameLog> selectFromLicenseRealnameLog(String by, String condition, String dataSource);
	public List<LicenseLoginLog> selectFromLicenseLoginLog(String by, String condition, String dataSource);
	public List<LicenseExternalInfo> selectFromLicenseExternalInfo(String by, String condition, String dataSource);
	public List<LicenseDigitalCert> selectFromLicenseDigitalCert(String by, String condition, String dataSource);
	public List<LicenseUserLogin> selectFromLicenseUserLogin(String by, String condition, String dataSource); 
	
	public int deleteFromLicenseUserBasicByPrimaryKey(Integer id);
	public int deleteFromLicenseUserSecurityByPrimaryKey(Integer id);
	public int deleteFromLicenseShipAddrByPrimaryKey(Integer id);
	public int deleteFromLicenseRealnameLogByPrimaryKey(Integer id);
	public int deleteFromLicenseLoginLogByPrimaryKey(Integer id);
	public int deleteFromLicenseExternalInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseDigitalCertByPrimaryKey(Integer id);
	public int deleteFromLicenseUserLoginByPrimaryKey(Integer id); 
}
