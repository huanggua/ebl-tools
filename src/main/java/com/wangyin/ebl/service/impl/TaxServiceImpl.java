package com.wangyin.ebl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wangyin.ebl.dao.enterprise.LicenseServiceApplyMapper;
import com.wangyin.ebl.dao.order.LicenseOrderInfoMapper;
import com.wangyin.ebl.dao.order.LicenseOrderPayMapper;
import com.wangyin.ebl.dao.order.LicenseOrderProductMapper;
import com.wangyin.ebl.dao.tax.LicenseDzfContactMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxCredentialMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxInfoMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxPayDetailMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxPayMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxRateInfoMapper;
import com.wangyin.ebl.dao.tax.LicenseTaxServerInfoMapper;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.tax.LicenseDzfContact;
import com.wangyin.ebl.po.tax.LicenseTaxCredential;
import com.wangyin.ebl.po.tax.LicenseTaxInfo;
import com.wangyin.ebl.po.tax.LicenseTaxPay;
import com.wangyin.ebl.po.tax.LicenseTaxPayDetail;
import com.wangyin.ebl.po.tax.LicenseTaxRateInfo;
import com.wangyin.ebl.po.tax.LicenseTaxServerInfo;
import com.wangyin.ebl.service.TaxService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月8日 下午4:19:21 
 * @version 1.0 
 * @remark
 */
@Service("taxService")
public class TaxServiceImpl  extends BaseServiceImpl implements TaxService {

	@Resource
	private LicenseTaxServerInfoMapper licenseTaxServiceInfoMapper;
	@Resource
	private LicenseTaxInfoMapper licenseTaxInfoMapper;
	@Resource
	private LicenseTaxRateInfoMapper licenseTaxRateInfoMapper;
	@Resource
	private LicenseDzfContactMapper licenseDzfContactMapper;
	@Resource
	private LicenseTaxPayMapper licenseTaxPayMapper;
	@Resource
	private LicenseTaxPayDetailMapper licenseTaxPayDetailMapper;
	@Resource
	private LicenseOrderPayMapper licenseOrderPayMapper;
	@Resource
	private LicenseOrderInfoMapper licenseOrderInfoMapper;
	@Resource
	private LicenseOrderProductMapper licenseOrderProductMapper;
	@Resource
	private LicenseTaxCredentialMapper licenseTaxCredentialMapper;
	@Resource
	private LicenseServiceApplyMapper licenseServiceApplyMapper;
		
	@Override
	public List<LicenseTaxServerInfo> selectFromLicenseTaxServerInfo(
			String by, String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxServiceInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxServiceInfoMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseTaxInfo> selectFromLicenseTaxInfo(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxInfoMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseTaxRateInfo> selectFromLicenseTaxRateInfo(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxRateInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxRateInfoMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseDzfContact> selectFromLicenseDzfContact(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseDzfContactMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseDzfContactMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseTaxPay> selectFromLicenseTaxPay(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxPayMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxPayMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseTaxPayDetail> selectFromLicenseTaxPayDetail(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxPayDetailMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxPayDetailMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderPay> selectFromLicenseOrderPay(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseOrderPayMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseOrderPayMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderInfo> selectFromLicenseOrderInfo(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseOrderInfoMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseOrderInfoMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseOrderProduct> selectFromLicenseOrderProduct(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseOrderProductMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseOrderProductMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseTaxCredential> selectFromLicenseTaxCredential(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseTaxCredentialMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseTaxCredentialMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public List<LicenseServiceApply> selectFromLicenseServiceApply(String by,
			String condition, String dataSource) {
		// TODO Auto-generated method stub
		if (by.trim().equals("ENT_ID"))
			return licenseServiceApplyMapper.selectByEntId(condition);
		else if(by.trim().equals("TAX_NO"))
			return licenseServiceApplyMapper.selectByTaxNo(condition);
		else
			return null;
	}

	@Override
	public int deleteFromLicenseTaxServerInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxServiceInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseTaxInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseTaxRateInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxRateInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseDzfContactByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseDzfContactMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseTaxPayByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxPayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseTaxPayDetailByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxPayDetailMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderPayByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderPayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderInfoByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseOrderProductByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseOrderProductMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseTaxCredentialByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseTaxCredentialMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteFromLicenseServiceApplyByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return licenseServiceApplyMapper.deleteByPrimaryKey(id);
	}

}
