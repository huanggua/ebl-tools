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
import com.wangyin.ebl.po.order.LicenseOrderInfo;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 上午10:31:20 
 * @version 1.0 
 * @remark
 */
public interface InvoiceService extends BaseService{
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by, String condition, String dataSource);
	public List<LicenseInvoiceApplyInfo> selectFromLicenseInvoiceApplyInfo(String by, String condition, String dataSource);
	public List<LicenseInvoiceInfo> selectFromLicenseInvoiceInfo(String by, String condition, String dataSource);
	public List<LicenseInvoicePlatformOrder > selectFromLicenseInvoicePlatformOrder(String by, String condition, String dataSource);
	public List<LicenseInvoicePlatformOrderProduct> selectFromLicenseInvoicePlatformOrderProduct(String by, String condition, String dataSource);
	public List<LicenseInvoiceProduct> selectFromLicenseInvoiceProduct(String by, String condition, String dataSource);
	public List<LicenseInvoiceProductAdrate> selectFromLicenseInvoiceProductAdrate(String by, String condition, String dataSource);
	public List<LicenseInvoiceTax> selectFromLicenseInvoiceTax(String by, String condition, String dataSource);
	
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id);
	public int deleteFromLicenseInvoiceApplyInfoByPrimaryKey(Long id);
	public int deleteFromLicenseInvoiceInfoByPrimaryKey(Long id);
	public int deleteFromLicenseInvoicePlatformOrderByPrimaryKey(Long id);
	public int deleteFromLicenseInvoicePlatformOrderProductByPrimaryKey(Long id);
	public int deleteFromLicenseInvoiceProductByPrimaryKey(Long id);
	public int deleteFromLicenseInvoiceProductAdrateByPrimaryKey(Long id);
	public int deleteFromLicenseInvoiceTaxByPrimaryKey(Long id);
}
