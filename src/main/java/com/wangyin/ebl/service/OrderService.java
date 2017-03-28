package com.wangyin.ebl.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月29日 下午7:59:02 
 * @version 1.0 
 * @remark
 */

public interface OrderService extends BaseService{
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by, String condition, String dataSource);
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by, String condition, String dataSource);
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by, String condition, String dataSource);
	public List<LicenseOrderRefund> selectFromLicenseOrderRefund(String by, String condition, String dataSource);
	
	public int deleteFromLicenseOrderInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderPayByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderProductByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderRefundByPrimaryKey(Integer id);
	
}
