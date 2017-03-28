package com.wangyin.ebl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.enterprise.LicenseServiceApplyMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoiceApplyInfoMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoiceInfoMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoicePlatformOrderMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoicePlatformOrderProductMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoiceProductAdrateMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoiceProductMapper;
import com.wangyin.ebl.dao.invoice.LicenseInvoiceTaxMapper;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.invoice.LicenseInvoiceApplyInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoiceInfo;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrder;
import com.wangyin.ebl.po.invoice.LicenseInvoicePlatformOrderProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProduct;
import com.wangyin.ebl.po.invoice.LicenseInvoiceProductAdrate;
import com.wangyin.ebl.po.invoice.LicenseInvoiceTax;
import com.wangyin.ebl.service.InvoiceService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 上午10:31:57 
 * @version 1.0 
 * @remark
 */
@Service("invoiceService")
public class InvoiceServiceImpl extends BaseServiceImpl implements InvoiceService {

	@Resource
	private LicenseServiceApplyMapper licenseServiceApplyMapper;
	@Resource	
	private LicenseInvoiceApplyInfoMapper licenseInvoiceApplyInfoMapper;
	@Resource
	private LicenseInvoiceInfoMapper licenseInvoiceInfoMapper;
	@Resource
	private LicenseInvoicePlatformOrderMapper licenseInvoicePlatformOrderMapper;
	@Resource
	private LicenseInvoicePlatformOrderProductMapper licenseInvoicePlatformOrderProductMapper;
	@Resource
	private LicenseInvoiceProductAdrateMapper licenseInvoiceProductAdrateMapper;
	@Resource
	private LicenseInvoiceProductMapper licenseInvoiceProductMapper;
	@Resource
	private LicenseInvoiceTaxMapper licenseInvoiceTaxMapper;
	
	@Override
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseServiceApplyMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseServiceApplyMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoiceApplyInfo> selectFromLicenseInvoiceApplyInfo(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoiceApplyInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoiceApplyInfoMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoiceInfo> selectFromLicenseInvoiceInfo(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoiceInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoiceInfoMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoicePlatformOrder> selectFromLicenseInvoicePlatformOrder(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoicePlatformOrderMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoicePlatformOrderMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoicePlatformOrderProduct> selectFromLicenseInvoicePlatformOrderProduct(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoicePlatformOrderProductMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoicePlatformOrderProductMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoiceProduct> selectFromLicenseInvoiceProduct(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoiceProductMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoiceProductMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoiceProductAdrate> selectFromLicenseInvoiceProductAdrate(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoiceProductAdrateMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoiceProductAdrateMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public List<LicenseInvoiceTax> selectFromLicenseInvoiceTax(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseInvoiceTaxMapper.selectByEntId(condition);
		else if(by.trim().equals("INVOICE_APPLY_ID"))
			return licenseInvoiceTaxMapper.selectByInvoiceApplyId(condition);
		else
			return null;
	}

	@Override
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseServiceApplyMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoiceApplyInfoByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoiceApplyInfoMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoiceInfoByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoiceInfoMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoicePlatformOrderByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoicePlatformOrderMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoicePlatformOrderProductByPrimaryKey(
			Long id) {
		// TODO Auto-generated method stub
		return licenseInvoicePlatformOrderProductMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoiceProductByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoiceProductMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoiceProductAdrateByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoiceProductAdrateMapper.deleteByPrimaryKey(id);	
	}

	@Override
	public int deleteFromLicenseInvoiceTaxByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return licenseInvoiceTaxMapper.deleteByPrimaryKey(id);	
	}

}
