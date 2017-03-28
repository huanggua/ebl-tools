package com.wangyin.ebl.service;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.invoice.LicenseInvoiceApplyInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoiceInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrder;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrderProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProductAdrate;
import com.wangyin.ebl.po.invoice.LicenseInvoiceTax;
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

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 下午2:42:59 
 * @version 1.0 
 * @remark
 */
public interface LicenseService extends BaseService{
	public List<LicenseProxyAppointment> selectFromLicenseProxyAppointment(String by, String condition, String dataSource);
	public List<LicenseBizOrder > selectFromLicenseBizOrder(String by, String condition, String dataSource);
	public List<LicenseBizPrdt> selectFromLicenseBizPrdt(String by, String condition, String dataSource);
	public List<LicenseBizItem > selectFromLicenseBizItem(String by, String condition, String dataSource);
	public List<LicenseBusinessLicense> selectFromLicenseBusinessLicense(String by, String condition, String dataSource);
	public List<LicenseGoodsShip> selectFromLicenseGoodsShip(String by, String condition, String dataSource);
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by, String condition, String dataSource);
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by, String condition, String dataSource);
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by, String condition, String dataSource);
	public List<LicenseOrderRefund > selectFromLicenseOrderRefund(String by, String condition, String dataSource);
	public List<LicenseFileSign> selectFromLicenseFileSign(String by, String condition, String dataSource);
	
	public int deleteFromLicenseProxyAppointmentByPrimaryKey(Integer id);
	public int deleteFromLicenseBizOrderByPrimaryKey(Integer id);
	public int deleteFromLicenseBizPrdtByPrimaryKey(Integer id);
	public int deleteFromLicenseBizItemByPrimaryKey(Integer id);
	public int deleteFromLicenseBusinessLicenseByPrimaryKey(Integer id);
	public int deleteFromLicenseGoodsShipByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderPayByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderProductByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderRefundByPrimaryKey(Integer id);
	public int deleteFromLicenseFileSignByPrimaryKey(Integer id);
}
