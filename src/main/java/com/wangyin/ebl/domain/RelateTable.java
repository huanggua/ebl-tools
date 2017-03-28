/**
 * @Title: RelateTable.java
 * 
 * @Package com.wangyin.marketing.domain
 *
 * @date 2015-11-8 下午2:54:39
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 保存关系查询的表结构及查询关键字
 * @author 
 *
 */
public class RelateTable {
	/**
	 * Map中存放的关键字  -- 关联的数据表
	 */
	public final static String RELATE_TABLES = "relateTables";
	
	/**
	 * Map中存放的关键字  -- 查询关键字
	 */
	public final static String QUERY_COLUMNS = "queryColumns";
	
	/**
	 * 支持的模块类型
	 *
	 * @author 
	 *
	 */
	public enum RelateTypeEnum{
		USER_RELATION,      //用户基础模块
		LICENSE_RELATION,   //营业执照模块
		ENTPRISE_RELATION,  //企业基础模块
		ORDER_RELATION,     //订单模块
		TAX_RELATION,       //企业财税模块
		INVOICE_RELATION;   //企业电子发票模块
		
	}
	
	/*
	 * 用户基础模块
	 */
	//需要查询的关联table
	private  List<String> userRelateTable = new ArrayList<String>();
	//查询的关键字
	private  List<String> userRelateKey = new ArrayList<String>();
	
	private  Map<String, List<String>> userRelate = new HashMap<String, List<String>>();
	
	/*
	 * 营业执照模块
	 */
	private  List<String> licenseRelateTable = new ArrayList<String>();
	private  List<String> licenseRelateKey = new ArrayList<String>();
	private  Map<String, List<String>> licenseRelate = new HashMap<String, List<String>>();
	
	/*
	 * 企业基础模块
	 */
	private List<String> entpriseRelateTable = new ArrayList<String>();
	private List<String> entpriseRelateKey = new ArrayList<String>();
	private Map<String, List<String>> entpriseRelate = new HashMap<String, List<String>>();
	
	/*
	 * 订单模块
	 */
	private List<String> orderRelateTable = new ArrayList<String>();
	private List<String> orderRelateKey = new ArrayList<String>();
	private Map<String, List<String>> orderRelate = new HashMap<String, List<String>>();
	
	
	/*
	 *企业财税模块
	 */
	private List<String> taxRelateTable = new ArrayList<String>();
	private List<String> taxRelateKey = new ArrayList<String>();
	private Map<String, List<String>> taxRelate = new HashMap<String, List<String>>();
	
	/*
	 * 企业电子发票模块
	 */
	private List<String> invoiceRelateTable = new ArrayList<String>();
	private List<String> invoiceRelateKey = new ArrayList<String>();
	private Map<String, List<String>> invoiceRelate = new HashMap<String, List<String>>();
	
	
	
	
	
	private RelateTable(){
		init();
	}
	/**
	 * 初始化Map
	 */
	private void init(){
		/**
		 * 用户基础模块
		 */
		//数据表
		userRelateTable.add(TableTypeEnum.LICENSE_USER_LOGIN.getTableName());      //用户登录表
		userRelateTable.add(TableTypeEnum.LICENSE_USER_BASIC.getTableName());      //用户基础信息表
		userRelateTable.add(TableTypeEnum.LICENSE_USER_SECURITY.getTableName());   //用户安全信息表
		userRelateTable.add(TableTypeEnum.LICENSE_USER_EXTERNAL_INFO.getTableName());//用户外部信息表
		userRelateTable.add(TableTypeEnum.LICENSE_SHIP_ADDR.getTableName());       //用户收货地址表
		userRelateTable.add(TableTypeEnum.LICENSE_DIGITAL_CERT.getTableName());    //用户数字证书表
		userRelate.put(RELATE_TABLES, userRelateTable);
		//查询的列
		userRelateKey.add(TableTypeEnum.LICENSE_USER_LOGIN.getPrimaryKey());
		userRelateKey.add(TableTypeEnum.LICENSE_USER_BASIC.getPrimaryKey());
		userRelate.put(QUERY_COLUMNS, userRelateKey);
		
		/**
		 * 营业执照模块
		 */
		licenseRelateTable.add(TableTypeEnum.LICENSE_PROXY_APPOINTMENT.getTableName());   //用户业务授权记录表
		licenseRelateTable.add(TableTypeEnum.LICENSE_BIZ_ORDER.getTableName());           //用户业务订单表
		licenseRelateTable.add(TableTypeEnum.LICENSE_BIZ_PRDT.getTableName());            //用户业务产品表
		licenseRelateTable.add(TableTypeEnum.LICENSE_BIZ_ITEM.getTableName());            //用户业务项目执行表
		licenseRelateTable.add(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getTableName());   //营业执照表
		licenseRelateTable.add(TableTypeEnum.LICENSE_GOODS_SHIP.getTableName());           //用户物品快递表
		licenseRelateTable.add(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());      //订单信息表
		licenseRelateTable.add(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());           //订单商品表
		licenseRelateTable.add(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());    //业务订单支付表
		licenseRelateTable.add(TableTypeEnum.LICENSE_ORDER_REFUND.getTableName());           //退款流水表
		licenseRelateTable.add(TableTypeEnum.LICENSE_FILE_SIGN.getTableName());   //文件签名表
		
		licenseRelate.put(RELATE_TABLES, licenseRelateTable);
		
		//查询的列
//		licenseRelateKey.add(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getPrimaryKey());
		licenseRelateKey.add(TableTypeEnum.LICENSE_BIZ_ORDER.getPrimaryKey());
		licenseRelateKey.add(TableTypeEnum.LICENSE_ORDER_PAY.getPrimaryKey());
        licenseRelateKey.add("USER_ID");
		licenseRelate.put(QUERY_COLUMNS, licenseRelateKey);
		
		
		/**
		 * 企业基础模块
		 */
		entpriseRelateTable.add(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getTableName());  //营业执照表
		entpriseRelateTable.add(TableTypeEnum.LICENSE_ENT_LOGIN.getTableName());   //企业登录表
		entpriseRelateTable.add(TableTypeEnum.LICENSE_ENT_AUTH.getTableName());   //企业登录表
		entpriseRelateTable.add(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());   //企业登录表
		entpriseRelate.put(RELATE_TABLES, entpriseRelateTable);
		
		//查询的列
		entpriseRelateKey.add(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getPrimaryKey()); 
		entpriseRelateKey.add(TableTypeEnum.LICENSE_ENT_LOGIN.getPrimaryKey());
		entpriseRelateKey.add(TableTypeEnum.LICENSE_SERVICE_APPLY.getPrimaryKey());
		entpriseRelate.put(QUERY_COLUMNS, entpriseRelateKey);
		
		
		/**
		 * 订单模块
		 */
		orderRelateTable.add(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());  //订单表
		orderRelateTable.add(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());  //订单商品表
		orderRelateTable.add(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());  //业务订单支付表
		orderRelateTable.add(TableTypeEnum.LICENSE_ORDER_REFUND.getTableName());  //退款流水表
		orderRelate.put(RELATE_TABLES, orderRelateTable);
		
		orderRelateKey.add(TableTypeEnum.LICENSE_ORDER_INFO.getPrimaryKey());
		orderRelateKey.add(TableTypeEnum.LICENSE_ORDER_PAY.getPrimaryKey());
		orderRelateKey.add("USER_ID");
		orderRelate.put(QUERY_COLUMNS, orderRelateKey);
		
		/**
		 * 企业财税模块
		 */
		taxRelateTable.add(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());  //服务申请表
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_SERVER_INFO.getTableName());  //会计服务人员信息表
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_INFO.getTableName());        //税务信息表
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_RATE_INFO.getTableName());  //税率明细表
		taxRelateTable.add(TableTypeEnum.LICENSE_DZF_CONTRACT.getTableName());  //大帐房合同表
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_PAY.getTableName());      //纳税流水表
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_PAY_DETAIL.getTableName());  //纳税明细表
		taxRelateTable.add(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());
		taxRelateTable.add(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());
		taxRelateTable.add(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());
		taxRelateTable.add(TableTypeEnum.LICENSE_TAX_CREDENTIAL.getTableName());  //原始凭证表
		taxRelate.put(RELATE_TABLES, taxRelateTable);
		
		taxRelateKey.add(TableTypeEnum.LICENSE_TAX_INFO.getPrimaryKey());
		taxRelateKey.add(TableTypeEnum.LICENSE_TAX_CREDENTIAL.getPrimaryKey());
		taxRelate.put(QUERY_COLUMNS, taxRelateKey);
		
		
		/**
		 * 企业电子发票
		 */
		invoiceRelateTable.add(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_APPLY_INFO.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_INFO.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_PLATFORM_ORDER.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_PLATFORM_ORDER_PRODUCT.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_PRODUCT.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_PRODUCT_ADRATE.getTableName());
		invoiceRelateTable.add(TableTypeEnum.LICENSE_INVOICE_TAX.getTableName());
		invoiceRelate.put(RELATE_TABLES, invoiceRelateTable);
		
		invoiceRelateKey.add(TableTypeEnum.LICENSE_INVOICE_INFO.getPrimaryKey());
		invoiceRelateKey.add(TableTypeEnum.LICENSE_INVOICE_APPLY_INFO.getPrimaryKey());
		invoiceRelate.put(QUERY_COLUMNS, invoiceRelateKey);
	}
	private static RelateTable relateTable = null;
	
	public static RelateTable getInstance(){
		if( null == relateTable)
			relateTable = new RelateTable();
		return relateTable;
	}
	/**
	 * 获得关系表
	 * @param relateTypeEnum
	 * @return
	 */
	public Map<String, List<String>> getRelation(RelateTypeEnum relateTypeEnum){
		switch (relateTypeEnum) {
		case USER_RELATION:
			return userRelate;
		case LICENSE_RELATION:
			return licenseRelate;
		case ENTPRISE_RELATION:
			return entpriseRelate;
		case ORDER_RELATION:
			return orderRelate;
		case TAX_RELATION:
			return taxRelate;
		case INVOICE_RELATION:
			return invoiceRelate;
		default:
			return null;
		}
	}
}
