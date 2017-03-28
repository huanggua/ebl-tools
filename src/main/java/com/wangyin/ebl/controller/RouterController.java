/**
 * @Title: RouterController.java
 * 
 * @Package com.wangyin.marketing.controller
 *
 * @date 2015-11-7 下午6:51:37
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.controller;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import com.wangyin.customer.po.CustomerBasic;
//import com.wangyin.customer.po.CustomerExternalRelation;
//import com.wangyin.customer.po.RealnameCert;
//import com.wangyin.ebl.domain.RelateTable;
//import com.wangyin.ebl.domain.RuleParser;
//import com.wangyin.ebl.domain.TableTypeEnum;
//import com.wangyin.ebl.domain.RelateTable.RelateTypeEnum;
//import com.wangyin.ebl.po.*;
//import com.wangyin.ebl.util.JSONUtil;
//import com.wangyin.ebl.util.ReflectUtil;

@Controller
public class RouterController extends BaseController{
	
	
	//关联查询
	@RequestMapping("/common/query/promotionRelate.do")
	public String toPromotionRelatePage(HttpServletRequest requset){
		requset.setAttribute("location", "promotionRelate");
		requset.setAttribute("primaryKey", "column value");
//		requset.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.PROMOTION_RELATE).get(RelateTable.RELATE_TABLES));
//		requset.setAttribute("columns",RelateTable.getInstance().getRelation(RelateTypeEnum.PROMOTION_RELATE).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping("/common/query/customerRelate.do")
	public String toCustomerRelatePage(HttpServletRequest requset){
		//需要查询的数据库
		requset.setAttribute("location", "customerRelate");
		requset.setAttribute("primaryKey", "column value");
//		requset.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.CUSTOMER_RELATE).get(RelateTable.RELATE_TABLES));
//		requset.setAttribute("columns",RelateTable.getInstance().getRelation(RelateTypeEnum.CUSTOMER_RELATE).get(RelateTable.QUERY_COLUMNS));
		return "customerrelation";
	}
	
	@RequestMapping("/common/query/realnameCert1.do")
	public String toRealnameCertPage(HttpServletRequest requset){
		//需要查询的数据库
		requset.setAttribute("location", "realnameCert1");
		requset.setAttribute("primaryKey", "column value");
//		requset.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.REALNAME_CERT).get(RelateTable.RELATE_TABLES));
//		requset.setAttribute("columns",RelateTable.getInstance().getRelation(RelateTypeEnum.REALNAME_CERT).get(RelateTable.QUERY_COLUMNS));
		return "realnameCert1";
	}
	
	/**
	 * 开发中
	 * @return
	 */
	@RequestMapping("/common/query/dev.do")
	public String toDevPage(HttpServletRequest requset){
		return "development";
	}
	
}
