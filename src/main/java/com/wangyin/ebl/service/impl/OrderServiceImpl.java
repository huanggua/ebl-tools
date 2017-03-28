package com.wangyin.ebl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.order.LicenseOrderInfoMapper;
import com.wangyin.ebl.dao.order.LicenseOrderPayMapper;
import com.wangyin.ebl.dao.order.LicenseOrderProductMapper;
import com.wangyin.ebl.dao.order.LicenseOrderRefundMapper;
import com.wangyin.ebl.dao.user.LicenseDigitalCertMapper;
import com.wangyin.ebl.dao.user.LicenseExternalInfoMapper;
import com.wangyin.ebl.dao.user.LicenseLoginLogMapper;
import com.wangyin.ebl.dao.user.LicenseRealnameLogMapper;
import com.wangyin.ebl.dao.user.LicenseShipAddrMapper;
import com.wangyin.ebl.dao.user.LicenseUserBasicMapper;
import com.wangyin.ebl.dao.user.LicenseUserSecurityMapper;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;
import com.wangyin.ebl.po.user.LicenseUserBasic;
import com.wangyin.ebl.service.OrderService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月29日 下午7:59:24 
 * @version 1.0 
 * @remark
 */

@Service("orderService")
public class OrderServiceImpl  extends BaseServiceImpl implements OrderService{

	@Resource
	private LicenseOrderInfoMapper licenseOrderInfoMapper;

	@Resource
	private LicenseOrderPayMapper licenseOrderPayMapper;

	@Resource
	private LicenseOrderProductMapper licenseOrderProductMapper;
	
	@Resource
	private LicenseOrderRefundMapper licenseOrderRefundMapper;
	
	public void selectByUserId(String userId) {
		List<LicenseOrderInfo> licenseOrderInfo = licenseOrderInfoMapper.selectByUserId(userId);
		List<LicenseOrderPay> licenseOrderPay = licenseOrderPayMapper.selectByUserId(userId);
		List<LicenseOrderProduct> licenseOrderProduct = licenseOrderProductMapper.selectByUserId(userId);
		List<LicenseOrderRefund> licenseOrderRefund = licenseOrderRefundMapper.selectByUserId(userId);
	}
	
	public void selectByBizId(String bizId) {
		licenseOrderInfoMapper.selectByBizId(bizId);
		licenseOrderPayMapper.selectByBizId(bizId);
		licenseOrderProductMapper.selectByBizId(bizId);
		licenseOrderRefundMapper.selectByBizId(bizId);
	}
	
	public void selectByOrderNo(String orderNo) {
		licenseOrderInfoMapper.selectByOrderNo(orderNo);
		licenseOrderPayMapper.selectByOrderNo(orderNo);
		licenseOrderProductMapper.selectByOrderNo(orderNo);
		licenseOrderRefundMapper.selectByOrderNo(orderNo);
	}
	
	@Override
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by, String condition, String dataSource) {
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
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by, String condition, String dataSource) {
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
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by, String condition, String dataSource) {
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
	public List<LicenseOrderRefund> selectFromLicenseOrderRefund(String by, String condition, String dataSource) {
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
	
}
