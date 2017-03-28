package com.wangyin.ebl.util;

public class EntranceKeyUtil {
    public static String PREFIX = "MKT_E";
    public static String SPLIT  = "|";
    public static String WINNER  = "WINNER";
    public static String WYJ  = "WYJ";
    public static String WYQB  = "WYQB";

    public static String getKey(String entranceId, String ruleType) {
        StringBuilder builder = new StringBuilder(30);
        builder.append(PREFIX);
        builder.append(entranceId);
        builder.append(SPLIT);
        builder.append(ruleType);
        return builder.toString();
    }

    /**
     * 抽奖中奖的20名的缓存key生成规则
     * key : MKT_E|入口ID|WINNER
     * @param entranceId
     * @return
     */
    public static String getWinnerKey(String entranceId) {
        StringBuilder builder = new StringBuilder(30);
        builder.append(PREFIX);
        builder.append(SPLIT);
        builder.append(entranceId);
        builder.append(SPLIT);
        builder.append(WINNER);
        return builder.toString();
    }

    /**
     * 网银+获得立减活动的缓存key成规则
     * key : MKT_E|交易订单号|WYJ
     * @param tradeNo
     * @return
     */
    public static String getWYJCutOffCacheKey(String tradeNo){
        StringBuilder builder = new StringBuilder(30);
        builder.append(PREFIX);
        builder.append(SPLIT);
        builder.append(tradeNo);
        builder.append(SPLIT);
        builder.append(WYJ);
        return builder.toString();
    }

    /**
     * 网银钱包获得立减活动的缓存key成规则
     * key : MKT_E|交易订单号|WYQB
     * @param tradeNo
     * @return
     */
    public static String getWYQBCutOffCacheKey(String tradeNo){
        StringBuilder builder = new StringBuilder(30);
        builder.append(PREFIX);
        builder.append(SPLIT);
        builder.append(tradeNo);
        builder.append(SPLIT);
        builder.append(WYQB);
        return builder.toString();
    }
}