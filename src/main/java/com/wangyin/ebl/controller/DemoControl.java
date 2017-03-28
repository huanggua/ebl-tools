package com.wangyin.ebl.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wangyin.ebl.dao.user.LicenseDigitalCertMapper;
import com.wangyin.ebl.dao.user.LicenseExternalInfoMapper;
import com.wangyin.ebl.dao.user.LicenseLoginLogMapper;
import com.wangyin.ebl.dao.user.LicenseRealnameLogMapper;
import com.wangyin.ebl.dao.user.LicenseShipAddrMapper;
import com.wangyin.ebl.dao.user.LicenseUserBasicMapper;
import com.wangyin.ebl.dao.user.LicenseUserSecurityMapper;
import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseEntLogin;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.enterprise.LicenseStore;
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
import com.wangyin.ebl.po.tax.LicenseDzfContact;
import com.wangyin.ebl.po.tax.LicenseTaxCredential;
import com.wangyin.ebl.po.tax.LicenseTaxInfo;
import com.wangyin.ebl.po.tax.LicenseTaxPay;
import com.wangyin.ebl.po.tax.LicenseTaxPayDetail;
import com.wangyin.ebl.po.tax.LicenseTaxRateInfo;
import com.wangyin.ebl.po.tax.LicenseTaxServerInfo;
import com.wangyin.ebl.po.user.LicenseDigitalCert;
import com.wangyin.ebl.po.user.LicenseExternalInfo;
import com.wangyin.ebl.po.user.LicenseLoginLog;
import com.wangyin.ebl.po.user.LicenseRealnameLog;
import com.wangyin.ebl.po.user.LicenseShipAddr;
import com.wangyin.ebl.po.user.LicenseUserBasic;
import com.wangyin.ebl.po.user.LicenseUserLogin;
import com.wangyin.ebl.po.user.LicenseUserSecurity;
import com.wangyin.ebl.service.InvoiceService;
import com.wangyin.ebl.service.LicenseService;
import com.wangyin.ebl.service.OrderService;
import com.wangyin.ebl.service.TaxService;
import com.wangyin.ebl.service.UserService;
import com.wangyin.ebl.service.EnterpriseService;

/** 
 * @author huangshuli@jd.com
 * @date 2016年9月27日 上午11:29:54 
 * @version 1.0 
 * @remark
 */

@Controller
public class DemoControl {
//	@Resource
//	private LicenseUserBasicMapper licenseUserBasicMapper;
//	
//	@Resource
//	private LicenseUserSecurityMapper licenseUserSecurityMapper;
//	
//	@Resource
//	private LicenseShipAddrMapper licenseShipAddrMapper;
//	
//	@Resource
//	private LicenseRealnameLogMapper licenseRealnameLogMapper;
//	
//	@Resource
//	private LicenseLoginLogMapper licenseLoginLogMapper;
//	
//	@Resource
//	private LicenseExternalInfoMapper licenseExternalInfoMapper;
//	
//	@Resource
//	private LicenseDigitalCertMapper licenseDigitalCertMapper;
//	
	@Resource(name = "userService")
	private UserService userService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private EnterpriseService enterpriseService;
	
	@Autowired
	private InvoiceService invoiceService;
	
	@Autowired
	private LicenseService licenseService;
	
	@Autowired
	private TaxService taxService;
//	
	@RequestMapping(value = "demo.do")
	public String demoAction(HttpServletRequest request){
		try {
			userService.deleteByPrimaryKey("LICENSE_USER_BASIC", 3);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "template"; //(后面会加上.jsp的后缀)
	}
}
