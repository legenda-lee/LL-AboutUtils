package com.legenda.lee.utilcollection.utils.randomcode;

import com.legenda.lee.utilcollection.utils.ip.IpUtil;


/**
 * @author Legenda-Lee
 * @date 2019-11-19 13:50
 * @description 曾经做过的随机数
 * @since 1.0.0
 */
public class DecisionOrderNo {

    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:17:23
     * @description 获取随机数：机器IP+线程尾号+时间戳+四位随机数字
     *
     * @return java.lang.String 随机数
     */
    public static String getSerialNo() {
        StringBuilder sb = new StringBuilder();
        sb.append(IpUtil.tailOfIp);
        String currentThreadId = String.valueOf(Thread.currentThread().getId());
        sb.append(currentThreadId.substring(currentThreadId.length() - 1));
        sb.append("yyyyMMddHHmmssSSS");
        sb.append("四位数字随机数");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getSerialNo());
    }
}
