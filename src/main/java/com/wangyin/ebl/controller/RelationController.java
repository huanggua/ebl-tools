package com.wangyin.ebl.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.wangyin.ebl.domain.QueryResultEntity;
import com.wangyin.ebl.domain.RelationQueryEntity;
import com.wangyin.ebl.domain.ResultCode;
import com.wangyin.ebl.domain.TableTypeEnum;
import com.wangyin.ebl.filter.MultipleDataSource;
import com.wangyin.ebl.po.enterprise.LicenseEntAuth;
import com.wangyin.ebl.po.enterprise.LicenseEntLogin;
import com.wangyin.ebl.po.enterprise.LicenseServiceApply;
import com.wangyin.ebl.po.enterprise.LicenseStore;
import com.wangyin.ebl.po.invoice.*;
import com.wangyin.ebl.po.license.*;
import com.wangyin.ebl.po.order.LicenseOrderInfo;
import com.wangyin.ebl.po.order.LicenseOrderPay;
import com.wangyin.ebl.po.order.LicenseOrderProduct;
import com.wangyin.ebl.po.order.LicenseOrderRefund;
import com.wangyin.ebl.po.tax.*;
import com.wangyin.ebl.po.user.*;
import com.wangyin.ebl.service.*;
import com.wangyin.ebl.util.HtmlUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.annotation.Resource;



/**
 * Created by wylaihuiying on 2016/9/29.
 */
@Controller
public class RelationController extends BaseController{
    @Resource
    UserService userService;
    @Resource
    EnterpriseService enterpriseService;
    @Resource
    LicenseService licenseService;
    @Resource
    TaxService taxService;
    @Resource
    InvoiceService invoiceService;
    @Resource
    OrderService orderService;


    private final String FUNCDATASOURCEKEY = "dataSourceFunc";
    private final String AUTODATASOURCEKEY = "dataSourceCI";
    private final String DEVDATASOURCEKEY = "dataSourceDev";
    /**
     * 根据参数查询用户相关基础信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource   数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "/query/userRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryUserByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        RelationQueryEntity rqe = new RelationQueryEntity();

        /**
         * 第一步查询license_user_login表
         */

        List<LicenseUserLogin> luls = null;
        try{
            luls = userService.selectFromLicenseUserLogin(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_USER_LOGIN.getTableName());

            if (luls == null || luls.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }
            else{
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(luls.get(0)));
                StringBuffer sb = new StringBuffer();

                for (LicenseUserLogin lul : luls){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lul,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第二步查询license_user_basic表
         */

        List<LicenseUserBasic> lubs = null;
        try {
            lubs = userService.selectFromLicenseUserBasic(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_USER_BASIC.getTableName());

            if (lubs == null || lubs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lubs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseUserBasic lub : lubs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lub,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_user_security表
         */
        List<LicenseUserSecurity> luss = null;
        try {
            luss = userService.selectFromLicenseUserSecurity(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_USER_SECURITY.getTableName());

            if (luss == null || luss.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(luss.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseUserSecurity lus : luss){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lus,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_user_external_info表
         */
        List<LicenseExternalInfo> leis = null;
        try {
            leis = userService.selectFromLicenseExternalInfo(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_USER_EXTERNAL_INFO.getTableName());

            if (leis == null || leis.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(leis.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseExternalInfo lei : leis){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lei,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第五步查询license_ship_addr表
         */
        List<LicenseShipAddr> lsas = null;
        try {
            lsas = userService.selectFromLicenseShipAddr(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_SHIP_ADDR.getTableName());

            if (lsas == null || lsas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lsas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseShipAddr lsa : lsas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lsa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第五步查询license_digital_cert表
         */
        List<LicenseDigitalCert> ldcs = null;
        try {
            ldcs = userService.selectFromLicenseDigitalCert(columnName,columnValue,datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_DIGITAL_CERT.getTableName());

            if (ldcs == null || ldcs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ldcs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseDigitalCert ldc : ldcs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ldc,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }


        String result = JSON.toJSONString(rqe, SerializerFeature.BrowserCompatible);

        return result;
    }


    /**
     * 根据参数查询营业执照相关信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource   数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "/query/licenseRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryLicenseByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }

        RelationQueryEntity rqe = new RelationQueryEntity();

        /**
         * 第一步查询license_proxy_appointment表
         */
        List<LicenseProxyAppointment> lpas = null;
        try {
            lpas = licenseService.selectFromLicenseProxyAppointment(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_PROXY_APPOINTMENT.getTableName());

            if (lpas == null || lpas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lpas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseProxyAppointment lpa : lpas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lpa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第二步查询license_biz_order表
         */
        List<LicenseBizOrder> lbos = null;
        try {
            lbos = licenseService.selectFromLicenseBizOrder(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_BIZ_ORDER.getTableName());

            if (lbos == null || lbos.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lbos.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseBizOrder lbo : lbos){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lbo,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_biz_prdt表
         */
        List<LicenseBizPrdt> lbps = null;
        try {
            lbps = licenseService.selectFromLicenseBizPrdt(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_BIZ_PRDT.getTableName());

            if (lbps == null || lbps.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lbps.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseBizPrdt lbp : lbps){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lbp,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_biz_item表
         */
        List<LicenseBizItem> lbis = null;
        try {
            lbis = licenseService.selectFromLicenseBizItem(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_BIZ_ITEM.getTableName());

            if (lbis == null || lbis.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lbis.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseBizItem lbi : lbis){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lbi,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        /**
         * 第五步查询license_business_license表
         */
        List<LicenseBusinessLicense> lbls = null;
        try {
            lbls = licenseService.selectFromLicenseBusinessLicense(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getTableName());

            if (lbls == null || lbls.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lbls.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseBusinessLicense lbl : lbls){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lbl,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第六步查询license_goods_ship表
         */
        List<LicenseGoodsShip> lgss = null;
        try {
            lgss = licenseService.selectFromLicenseGoodsShip(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_GOODS_SHIP.getTableName());

            if (lgss == null || lgss.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lgss.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseGoodsShip lgs : lgss){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lgs,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第七步查询license_order_info表
         */
        List<LicenseOrderInfo> lois = null;
        try {
            lois = licenseService.selectFromLicenseOrderInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());

            if (lois == null || lois.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lois.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderInfo loi : lois){
                    sb.append(HtmlUtil.generateTR4RelateQuery(loi,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }


        /**
         * 第八步查询license_order_product表
         */
        List<LicenseOrderProduct> loprs = null;
        try {
            loprs = licenseService.selectFromLicenseOrderProduct(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());

            if (loprs == null || loprs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(loprs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderProduct lopr : loprs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lopr,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第九步查询license_order_pay表
         */
        List<LicenseOrderPay> lops = null;
        try {
            lops = licenseService.selectFromLicenseOrderPay(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());

            if (lops == null || lops.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lops.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderPay lop : lops){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lop,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }


        /**
         * 第十步查询license_order_refund表
         */
        List<LicenseOrderRefund> lors = null;
        try {
            lors = licenseService.selectFromLicenseOrderRefund(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_REFUND.getTableName());

            if (lors == null || lors.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lors.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderRefund lor : lors){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lor,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第十一步查询license_file_sign表
         */
        List<LicenseFileSign> lfss = null;
        try {
            lfss = licenseService.selectFromLicenseFileSign(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_FILE_SIGN.getTableName());

            if (lfss == null || lfss.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lfss.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseFileSign lfs : lfss){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lfs,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }


        return JSON.toJSONString(rqe,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据参数查询企业相关基础信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource   数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "/query/entpriseRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryEntByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }

        RelationQueryEntity rqe = new RelationQueryEntity();


        /**
         * 第一步查询license_business_license表
         */
        List<LicenseBusinessLicense> lbls = null;
        try {
            lbls =  licenseService.selectFromLicenseBusinessLicense(columnName, columnValue, datasource);
            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_BUSINESS_LICENSE.getTableName());

            if (lbls==null || lbls.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lbls.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseBusinessLicense lbl : lbls){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lbl,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }


        /**
         * 第二步查询license_ent_login表
         */
        List<LicenseEntLogin> lels = null;
        try {
            lels = enterpriseService.selectFromLicenseEntLogin(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ENT_LOGIN.getTableName());

            if (lels==null || lels.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lels.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseEntLogin lel : lels){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lel,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_ent_auth表
         */
        List<LicenseEntAuth> leas = null;
        try {
            leas = enterpriseService.selectFromLicenseEntAuth(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ENT_AUTH.getTableName());

            if (leas==null || leas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(leas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseEntAuth lea : leas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lea,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_store表
         */
        List<LicenseStore> lss = null;
        try {
            lss = enterpriseService.selectFromLicenseStore(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_STORE.getTableName());

            if (lss==null || lss.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lss.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseStore ls : lss){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ls,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第五步查询license_service_apply表
         */
        List<LicenseServiceApply> lsas = null;
        try {
            lsas = enterpriseService.selectFromLicenseServiceApply(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());

            if (lsas==null || lsas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lsas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseServiceApply lsa : lsas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lsa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }


        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }

        return JSON.toJSONString(rqe,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据参数查询税务相关信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource  数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "query/taxRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryTaxByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }

        RelationQueryEntity rqe = new RelationQueryEntity();


        /**
         * 第一步查询license_service_apply表
         */
        List<LicenseServiceApply> lsas = null;
        try {
            lsas = enterpriseService.selectFromLicenseServiceApply(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());

            if (lsas == null || lsas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lsas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseServiceApply lsa : lsas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lsa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第二步查询license_tax_server_info表
         */
        List<LicenseTaxServerInfo> ltsis = null;
        try {
            ltsis = taxService.selectFromLicenseTaxServerInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_SERVER_INFO.getTableName());

            if (ltsis == null || ltsis.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltsis.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxServerInfo ltsi : ltsis){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ltsi,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_tax_info表
         */
        List<LicenseTaxInfo> ltis = null;
        try {
            ltis = taxService.selectFromLicenseTaxInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_INFO.getTableName());

            if (ltis == null || ltis.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltis.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxInfo lti : ltis){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lti,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_tax_rate_info表
         */
        List<LicenseTaxRateInfo> ltris = null;
        try {
            ltris = taxService.selectFromLicenseTaxRateInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_RATE_INFO.getTableName());

            if (ltris == null || ltris.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltris.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxRateInfo ltri : ltris){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ltri,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第五步查询license_dzf_contract表
         */
        List<LicenseDzfContact> ldcs = null;
        try {
            ldcs = taxService.selectFromLicenseDzfContact(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_DZF_CONTRACT.getTableName());

            if (ldcs == null || ldcs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ldcs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseDzfContact ldc : ldcs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ldc,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第六步查询license_tax_pay表
         */
        List<LicenseTaxPay> ltps = null;
        try {
            ltps = taxService.selectFromLicenseTaxPay(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_PAY.getTableName());

            if (ltps == null || ltps.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltps.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxPay ltp : ltps){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ltp,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第七步查询license_tax_pay_detail表
         */
        List<LicenseTaxPayDetail> ltpds = null;
        try {
            ltpds = taxService.selectFromLicenseTaxPayDetail(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_PAY_DETAIL.getTableName());

            if (ltpds == null || ltpds.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltpds.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxPayDetail ltpd : ltpds){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ltpd,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第八步查询license_order_info表
         */
        List<LicenseOrderInfo> lois = null;
        try {
            lois = taxService.selectFromLicenseOrderInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());

            if (lois == null || lois.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lois.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderInfo loi : lois){
                    sb.append(HtmlUtil.generateTR4RelateQuery(loi,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第九步查询license_order_product
         */
        List<LicenseOrderProduct> loprs = null;
        try {
            loprs = taxService.selectFromLicenseOrderProduct(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());

            if (loprs == null || loprs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(loprs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderProduct lopr : loprs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lopr,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第十步查询license_order_pay表
         */
        List<LicenseOrderPay> lops = null;
        try {
            lops = taxService.selectFromLicenseOrderPay(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());

            if (lops == null || lops.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lops.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderPay lop : lops){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lop,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第十一步查询license_tax_credential表
         */
        List<LicenseTaxCredential> ltcs = null;
        try {
            ltcs = taxService.selectFromLicenseTaxCredential(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_TAX_CREDENTIAL.getTableName());

            if (ltcs == null || ltcs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(ltcs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseTaxCredential ltc : ltcs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(ltc,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }


        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }

        return JSON.toJSONString(rqe,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据参数查询电子发票相关信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource   数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "/query/invoiceRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryInvoiceByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }

        RelationQueryEntity rqe = new RelationQueryEntity();

        /**
         * 第一步查询license_service_apply表
         */
        List<LicenseServiceApply> lsas = null;
        try {
            lsas = invoiceService.selectFromLicenseServiceApply(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_SERVICE_APPLY.getTableName());

            if (lsas == null || lsas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lsas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseServiceApply lsa : lsas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lsa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第二步查询license_invoice_apply_info表
         */
        List<LicenseInvoiceApplyInfo> liais = null;
        try {
            liais = invoiceService.selectFromLicenseInvoiceApplyInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_APPLY_INFO.getTableName());

            if (liais == null || liais.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(liais.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoiceApplyInfo liai : liais){
                    sb.append(HtmlUtil.generateTR4RelateQuery(liai,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_invoice_info表
         */
        List<LicenseInvoiceInfo> liis = null;
        try {
            liis = invoiceService.selectFromLicenseInvoiceInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_INFO.getTableName());

            if (liis == null || liis.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(liis.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoiceInfo lii : liis){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lii,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_invoice_platform_order表
         */
        List<LicenseInvoicePlatformOrder> lipos = null;
        try {
            lipos = invoiceService.selectFromLicenseInvoicePlatformOrder(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_PLATFORM_ORDER.getTableName());

            if (lipos == null || lipos.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lipos.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoicePlatformOrder lipo : lipos){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lipo,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第五步查询license_invoice_platform_order_product表
         */
        List<LicenseInvoicePlatformOrderProduct> lipops = null;
        try {
            lipops = invoiceService.selectFromLicenseInvoicePlatformOrderProduct(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_PLATFORM_ORDER_PRODUCT.getTableName());

            if (lipops == null || lipops.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lipops.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoicePlatformOrderProduct lipop : lipops){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lipop,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第六步查询license_invoice_product表
         */
        List<LicenseInvoiceProduct> lips = null;
        try {
            lips = invoiceService.selectFromLicenseInvoiceProduct(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_PRODUCT.getTableName());

            if (lips == null || lips.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lips.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoiceProduct lip : lips){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lip,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第七步查询license_invoice_product_adrate表
         */
        List<LicenseInvoiceProductAdrate> lipas = null;
        try {
            lipas = invoiceService.selectFromLicenseInvoiceProductAdrate(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_PRODUCT_ADRATE.getTableName());

            if (lipas == null || lipas.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lipas.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoiceProductAdrate lipa : lipas){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lipa,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第八步查询license_invoice_tax表
         */
        List<LicenseInvoiceTax> lits = null;
        try {
            lits = invoiceService.selectFromLicenseInvoiceTax(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_INVOICE_TAX.getTableName());

            if (lits == null || lits.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lits.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseInvoiceTax lit : lits){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lit,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }



        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }

        return JSON.toJSONString(rqe,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据参数查询订单相关信息
     * @param columnName   属性名
     * @param columnValue  属性值
     * @param datasource   数据源(功能FUNC或自动化AUTO或DEV)
     * @param httpSession
     * @return  JSON串
     */
    @RequestMapping(value = "/query/orderRelate/byParams.do",method = RequestMethod.POST)
    @ResponseBody
    public String queryOrderByParam(@RequestParam String columnName, @RequestParam String columnValue, @RequestParam String datasource, HttpSession httpSession){
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }

        RelationQueryEntity rqe = new RelationQueryEntity();

        /**
         * 第一步查询license_order_info表
         */
        List<LicenseOrderInfo> lois = null;
        try {
            lois = orderService.selectFromLicenseOrderInfo(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_INFO.getTableName());

            if (lois == null || lois.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lois.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderInfo loi : lois){
                    sb.append(HtmlUtil.generateTR4RelateQuery(loi,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第er步查询license_order_product
         */
        List<LicenseOrderProduct> loprs = null;
        try {
            loprs = orderService.selectFromLicenseOrderProduct(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PRODUCT.getTableName());

            if (loprs == null || loprs.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(loprs.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderProduct lopr : loprs){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lopr,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第三步查询license_order_pay表
         */
        List<LicenseOrderPay> lops = null;
        try {
            lops = orderService.selectFromLicenseOrderPay(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_PAY.getTableName());

            if (lops == null || lops.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lops.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderPay lop : lops){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lop,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }

        /**
         * 第四步查询license_order_refund表
         */
        List<LicenseOrderRefund> lors = null;
        try {
            lors = orderService.selectFromLicenseOrderRefund(columnName, columnValue, datasource);

            QueryResultEntity qr = new QueryResultEntity();

            qr.setTableName(TableTypeEnum.LICENSE_ORDER_REFUND.getTableName());

            if (lors == null || lors.size()==0){
                qr.setThead("");
                qr.setTbody("");
            }else {
                qr.setThead(HtmlUtil.generateTheadWithCheckbox(lors.get(0)));
                StringBuffer sb = new StringBuffer();
                for (LicenseOrderRefund lor : lors){
                    sb.append(HtmlUtil.generateTR4RelateQuery(lor,columnName,qr.getTableName()));
                }
                qr.setTbody(sb.toString());
            }
            rqe.addQueryResult(qr);
            rqe.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }




        if (!rqe.isSuccess()){
            rqe.setMessage(ResultCode.NO_DATA.getDescription());
        }

        return JSON.toJSONString(rqe,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据数据库自增序列的id删除用户模块的数据
     * @param id          数据库自增序列
     * @param tableName   数据库表名
     * @param datasource  数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/userRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteUserById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

         int number = userService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据id删除营业执照相关模块的数据
     * @param id
     * @param tableName   数据库表名
     * @param datasource  数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/licenseRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteLicenseById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

        int number = licenseService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据id删除企业模块的数据
     * @param id
     * @param tableName  表名
     * @param datasource 数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/entpriseRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteEntById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

        int number = enterpriseService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据id删除税务模块的数据
     * @param id
     * @param tableName  表名
     * @param datasource 数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/taxRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteTaxById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

        int number = taxService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据id删除电子发票模块的数据
     * @param id
     * @param tableName   表名
     * @param datasource  数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/invoiceRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteInvoiceById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

        int number = invoiceService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


    /**
     * 根据id删除订单模块的数据
     * @param id
     * @param tableName  表名
     * @param datasource 数据源
     * @return
     * @throws ClassNotFoundException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    @RequestMapping(value = "/delete/orderRelate/deleteById.do", method = RequestMethod.POST)
    @ResponseBody
    public String deleteorderById(@RequestParam String id, @RequestParam String tableName, @RequestParam String datasource) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //根据数据源，设置不同的数据源key
        if(datasource.equals("FUNC")){
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }
        else if (datasource.equals("AUTO")){
            MultipleDataSource.setDataSourceKey(AUTODATASOURCEKEY);
        }
        else if (datasource.equals("DEV")){
            MultipleDataSource.setDataSourceKey(DEVDATASOURCEKEY);
        }
        else {
            MultipleDataSource.setDataSourceKey(FUNCDATASOURCEKEY);
        }


        QueryResultEntity result = new QueryResultEntity();

        int number = orderService.deleteByPrimaryKey(tableName,Integer.parseInt(id));

        if (number == 1){
            result.setSuccess(true);
            result.setMessage("数据删除成功");
        }else {
            result.setSuccess(false);
            result.setMessage("数据删除失败");
        }

        return JSON.toJSONString(result,SerializerFeature.BrowserCompatible);
    }


}
