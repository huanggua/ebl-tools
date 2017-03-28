package com.wangyin.ebl.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.license.LicenseBizItemMapper;
import com.wangyin.ebl.dao.license.LicenseBizOrderMapper;
import com.wangyin.ebl.dao.license.LicenseBizPrdtMapper;
import com.wangyin.ebl.dao.license.LicenseBusinessLicenseMapper;
import com.wangyin.ebl.dao.license.LicenseFileSignMapper;
import com.wangyin.ebl.dao.license.LicenseGoodsShipMapper;
import com.wangyin.ebl.dao.license.LicenseProxyAppointmentMapper;
import com.wangyin.ebl.dao.order.LicenseOrderInfoMapper;
import com.wangyin.ebl.dao.order.LicenseOrderPayMapper;
import com.wangyin.ebl.dao.order.LicenseOrderProductMapper;
import com.wangyin.ebl.dao.order.LicenseOrderRefundMapper;
import com.wangyin.ebl.po.license.LicenseBizItem;
import com.wangyin.ebl.po.license.LicenseBizOrder;
import com.wangyin.ebl.po.license.LicenseBizPrdt;
import com.wangyin.ebl.po.license.LicenseBusinessLicense;
import com.wangyin.ebl.po.license.LicenseFileSign;
import com.wangyin.ebl.po.license.LicenseGoodsShip;
import com.wangyin.ebl.po.license.LicenseProxyAppointment;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;
import com.wangyin.ebl.service.LicenseService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 下午2:43:41 
 * @version 1.0 
 * @remark
 */
@Service("licenseService")
public class LicenseServiceImpl extends BaseServiceImpl implements LicenseService {
	@Resource
	private LicenseProxyAppointmentMapper licenseProxyAppointmentMapper;
	@Resource
	private LicenseBizOrderMapper licenseBizOrderMapper;
	@Resource
	private LicenseBizPrdtMapper licenseBizPrdtMapper;
	@Resource
	private LicenseBizItemMapper licenseBizItemMapper;
	@Resource
	private LicenseBusinessLicenseMapper licenseBusinessLicenseMapper;
	@Resource
	private LicenseGoodsShipMapper licenseGoodsShipMapper;
	@Resource
	private LicenseOrderInfoMapper licenseOrderInfoMapper;
	@Resource
	private LicenseOrderPayMapper licenseOrderPayMapper;
	@Resource
	private LicenseOrderProductMapper licenseOrderProductMapper;
	@Resource
	private LicenseOrderRefundMapper licenseOrderRefundMapper;
	@Resource
	private LicenseFileSignMapper licenseFileSignMapper;
	
	@Override
	public List<LicenseProxyAppointment> selectFromLicenseProxyAppointment(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseProxyAppointmentMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseProxyAppointmentMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseProxyAppointmentMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseBizOrder> selectFromLicenseBizOrder(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseBizOrderMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseBizOrderMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseBizOrderMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseBizPrdt> selectFromLicenseBizPrdt(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseBizPrdtMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseBizPrdtMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseBizPrdtMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseBizItem> selectFromLicenseBizItem(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseBizItemMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseBizItemMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseBizItemMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseBusinessLicense> selectFromLicenseBusinessLicense(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseBusinessLicenseMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseBusinessLicenseMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseBusinessLicenseMapper.selectByOrderNo(condition);
		else if(by.trim().equals("ENT_ID"))
			return licenseBusinessLicenseMapper.selectByEntId(condition);
		else if(by.trim().equals("ENT_NAME"))
			return licenseBusinessLicenseMapper.selectByEntName(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseBusinessLicenseMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseGoodsShip> selectFromLicenseGoodsShip(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseGoodsShipMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseGoodsShipMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseGoodsShipMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseOrderInfoMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseOrderInfoMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseOrderInfoMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseOrderPayMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseOrderPayMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseOrderPayMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseOrderProductMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseOrderProductMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseOrderProductMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderRefund> selectFromLicenseOrderRefund(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseOrderRefundMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseOrderRefundMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseOrderRefundMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseFileSign> selectFromLicenseFileSign(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("USER_ID"))
			return licenseFileSignMapper.selectByUserId(condition);
		else if(by.trim().equals("BIZ_ID"))
			return licenseFileSignMapper.selectByBizId(condition);
		else if(by.trim().equals("ORDER_NO"))
			return licenseFileSignMapper.selectByOrderNo(condition);
		else
			return null;
	}

	@Override
	public int deleteFromLicenseProxyAppointmentByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseProxyAppointmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseBizOrderByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseBizOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseBizPrdtByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseBizPrdtMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseBizItemByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseBizItemMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseBusinessLicenseByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseBusinessLicenseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseGoodsShipByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseGoodsShipMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderPayByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderPayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderProductByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderProductMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderRefundByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderRefundMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseFileSignByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseFileSignMapper.deleteByPrimaryKey(id);
	}
}
