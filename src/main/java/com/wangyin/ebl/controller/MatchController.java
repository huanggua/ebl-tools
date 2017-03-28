package com.wangyin.ebl.controller;

import com.wangyin.ebl.domain.RelateTable;
import com.wangyin.ebl.domain.RelateTable.RelateTypeEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MatchController {
	@RequestMapping(value="/common/query/user.do")
	public String toUserBasicPage(HttpServletRequest request){
		request.setAttribute("location", "userRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.USER_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.USER_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping(value="/common/query/enterprise.do")
	public String toEnterprisePage(HttpServletRequest request){
		request.setAttribute("location", "entpriseRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.ENTPRISE_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.ENTPRISE_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping(value="/common/query/license.do")
	public String toLicensePage(HttpServletRequest request){
		request.setAttribute("location", "licenseRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.LICENSE_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.LICENSE_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping(value="/common/query/tax.do")
	public String toTaxPage(HttpServletRequest request){
		request.setAttribute("location", "taxRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.TAX_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.TAX_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping(value="/common/query/invoice.do")
	public String toInvoicePage(HttpServletRequest request){
		request.setAttribute("location", "invoiceRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.INVOICE_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.INVOICE_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
	@RequestMapping(value="/common/query/order.do")
	public String toOrderPage(HttpServletRequest request){
		request.setAttribute("location", "orderRelate");
		request.setAttribute("primaryKey", "column value");
		request.setAttribute("tableNames", RelateTable.getInstance().getRelation(RelateTypeEnum.ORDER_RELATION).get(RelateTable.RELATE_TABLES));
		request.setAttribute("columns", RelateTable.getInstance().getRelation(RelateTypeEnum.ORDER_RELATION).get(RelateTable.QUERY_COLUMNS));
		return "relation";
	}
	
}
