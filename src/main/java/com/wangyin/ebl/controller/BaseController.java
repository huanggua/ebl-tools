/**
 * @Title: BaseController.java
 * 
 * @Package com.wangyin.marketing.controller
 *
 * @date 2015-11-7 下午3:32:15
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.controller;

import com.wangyin.ebl.filter.CustomTimestampEditor;
//import com.wangyin.ebl.service.*;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class BaseController {
//	@Resource
//	IPromotionInfoService promotionInfoService;
//	@Resource
//	IPromotionExtentionService promotionExtentionService;
//	@Resource
//	IPromotionEntranceInfoService promotionEntranceInfoService;
//	@Resource
//	IPromotionRuleInfoService promotionRuleInfoService;
//	@Resource
//	IPromotionPrizeInfoService promotionPrizeInfoService;
//	@Resource
//	IPromotionPrizeVoucherService promotionPrizeVoucherService;
//	@Resource
//	ICustomerBasicService customerBasicService;
//	@Resource
//	IExperienceMoneyInfoService experienceMoneyInfoService;
//	@Resource
//	IPrizeIssueControlService prizeIssueControlService;
//	@Resource
//	ICustomerExternalRelationService customerExternalRelationService;
//	@Resource
//	IRealnameCertService realnameCertService;
//	@Resource 
//	IRealnameCredentialsService realnameCredentialsService;
//	@Resource
//	IPromotionExchangeInfoService promotionExchangeInfoService;
//	@Resource
//	PromotionCustomerService promotionCustomerService;
//	@Resource
//	PromotionInfoConsumersService promotionInfoConsumersService;
//	@Resource
//	PromotionAccountsService promotionAccountsService;
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder) {
		SimpleDateFormat datetimeFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(datetimeFormat, true));
		//Timestamp 格式绑定
		binder.registerCustomEditor(java.sql.Timestamp.class,new CustomTimestampEditor(datetimeFormat, true));
	}
}
