package com.wangyin.ebl.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.user.LicenseDigitalCertMapper;
import com.wangyin.ebl.dao.user.LicenseExternalInfoMapper;
import com.wangyin.ebl.dao.user.LicenseLoginLogMapper;
import com.wangyin.ebl.dao.user.LicenseRealnameLogMapper;
import com.wangyin.ebl.dao.user.LicenseShipAddrMapper;
import com.wangyin.ebl.dao.user.LicenseUserBasicMapper;
import com.wangyin.ebl.dao.user.LicenseUserLoginMapper;
import com.wangyin.ebl.dao.user.LicenseUserSecurityMapper;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;
import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseExternalInfo;
import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseRealnameLog;
import com.wangyin.ebl.po.user.LicenseShipAddr;
import com.wangyin.ebl.po.user.LicenseUserBasic;
import com.wangyin.ebl.po.user.LicenseUserLogin;
import com.wangyin.ebl.po.user.LicenseUserSecurity;
import com.wangyin.ebl.service.UserService;
import com.wangyin.ebl.util.StringUtil;

/**
 * @author huangshuli@jd.com
 * @date 2016年9月28日 上午10:01:13
 * @version 1.0
 * @remark
 */

@Service("userService")
public class UserServiceImpl  extends BaseServiceImpl implements UserService {

	@Resource
	private LicenseUserBasicMapper licenseUserBasicMapper;

	@Resource
	private LicenseUserSecurityMapper licenseUserSecurityMapper;

	@Resource
	private LicenseShipAddrMapper licenseShipAddrMapper;

	@Resource
	private LicenseRealnameLogMapper licenseRealnameLogMapper;

	@Resource
	private LicenseLoginLogMapper licenseLoginLogMapper;

	@Resource
	private LicenseExternalInfoMapper licenseExternalInfoMapper;

	@Resource
	private LicenseDigitalCertMapper licenseDigitalCertMapper;

	@Resource
	private LicenseUserLoginMapper licenseUserLoginMapper;

	@Override
	public List<LicenseUserBasic> selectFromLicenseUserBasic(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseUserBasicMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseUserBasicMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseUserSecurity> selectFromLicenseUserSecurity(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseUserSecurityMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseUserSecurityMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseShipAddr> selectFromLicenseShipAddr(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseShipAddrMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseShipAddrMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseRealnameLog> selectFromLicenseRealnameLog(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseRealnameLogMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseRealnameLogMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseLoginLog> selectFromLicenseLoginLog(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseLoginLogMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseLoginLogMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseExternalInfo> selectFromLicenseExternalInfo(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseExternalInfoMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseExternalInfoMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseDigitalCert> selectFromLicenseDigitalCert(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseDigitalCertMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseDigitalCertMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public List<LicenseUserLogin> selectFromLicenseUserLogin(String by,
			String condition, String dataSource) {
		if (by.trim().equals("USER_ID"))
			return licenseUserLoginMapper.selectByUserId(condition);
		else if (by.trim().equals("LOGIN_NAME"))
			return licenseUserLoginMapper.selectByLoginName(condition);
		else
			return null;
	}

	@Override
	public int deleteFromLicenseUserBasicByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseUserBasicMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseUserSecurityByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseUserSecurityMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseShipAddrByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseShipAddrMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseRealnameLogByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseRealnameLogMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseLoginLogByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseLoginLogMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseExternalInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseExternalInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseDigitalCertByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseDigitalCertMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseUserLoginByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseUserLoginMapper.deleteByPrimaryKey(id);
	}
//	@Override
//	public int deleteByPrimaryKey(String tableName, Integer id)
//			throws ClassNotFoundException, InstantiationException,
//			IllegalAccessException, NoSuchMethodException, SecurityException,
//			IllegalArgumentException, InvocationTargetException {
//		// TODO Auto-generated method stub
//
//		String methodName = StringUtil.getMethodName(tableName);
//		Method m = this.getClass().getDeclaredMethod(methodName, Integer.class);
//		Object result = m.invoke(this, id);
//		System.out.println(result);
//		return Integer.parseInt(result.toString());
//	}

}
