package com.wangyin.ebl.filter;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 
 * @author huangshuli@jd.com
 * @date 2016年10月11日 上午10:39:41 
 * @version 1.0 
 * @remark
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
	
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
