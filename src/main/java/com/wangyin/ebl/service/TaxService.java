package com.wangyin.ebl.service;

import java.util.List;

import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;
import com.wangyin.ebl.po.tax.LicenseDzfContact;
import com.wangyin.ebl.po.tax.LicenseTaxCredential;
import com.wangyin.ebl.po.tax.LicenseTaxInfo;
import com.wangyin.ebl.po.tax.LicenseTaxPay;
import com.wangyin.ebl.po.tax.LicenseTaxPayDetail;
import com.wangyin.ebl.po.tax.LicenseTaxRateInfo;
import com.wangyin.ebl.po.tax.LicenseTaxServerInfo;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 下午4:18:55 
 * @version 1.0 
 * @remark
 */
public interface TaxService extends BaseService{
	public List<LicenseTaxServerInfo> selectFromLicenseTaxServerInfo(String by, String condition, String dataSource);
	public List<LicenseTaxInfo> selectFromLicenseTaxInfo(String by, String condition, String dataSource);
	public List<LicenseTaxRateInfo> selectFromLicenseTaxRateInfo(String by, String condition, String dataSource);
	public List<LicenseDzfContact> selectFromLicenseDzfContact(String by, String condition, String dataSource);
	public List<LicenseTaxPay> selectFromLicenseTaxPay(String by, String condition, String dataSource);
	public List<LicenseTaxPayDetail> selectFromLicenseTaxPayDetail(String by, String condition, String dataSource);
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by, String condition, String dataSource);
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by, String condition, String dataSource);
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by, String condition, String dataSource);
	public List<LicenseTaxCredential> selectFromLicenseTaxCredential(String by, String condition, String dataSource);
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by, String condition, String dataSource);
	
	public int deleteFromLicenseTaxServerInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseTaxInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseTaxRateInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseDzfContactByPrimaryKey(Integer id);
	public int deleteFromLicenseTaxPayByPrimaryKey(Integer id);
	public int deleteFromLicenseTaxPayDetailByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderPayByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderInfoByPrimaryKey(Integer id);
	public int deleteFromLicenseOrderProductByPrimaryKey(Integer id);
	public int deleteFromLicenseTaxCredentialByPrimaryKey(Integer id);
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id);
}
