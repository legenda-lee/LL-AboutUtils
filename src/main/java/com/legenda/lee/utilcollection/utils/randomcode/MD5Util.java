package com.legenda.lee.utilcollection.utils.randomcode;

import lombok.extern.slf4j.Slf4j;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * @author Legenda-Lee
 * @date 2019-11-16 20:46
 * @description MD5加密工具类
 * @since : 1.0.0
 */
@Slf4j
public class MD5Util {

    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:43:50
     * @description
     *
     * @param key 需要加密的字符串
     * @return String字符串 加密后的字符串
     */
    public static String getMD5(String key) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] bs = digest.digest(key.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : bs) {
                int temp = b & 255;
                if (temp < 16 && temp >= 0) {
                    hexString.append("0").append(Integer.toHexString(temp));
                } else {
                    hexString.append(Integer.toHexString(temp));
                }
            }
            return hexString.toString().toUpperCase();
        } catch (NoSuchAlgorithmException e) {
            log.error("加密失败，返回XXX");
        }
        return "XXX";
    }



    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:45:05
     * @description 测试
     */
    public static void main(String[] args) {
        String pwd = MD5Util.getMD5("Legenda-Lee");

        String pwd2 = MD5Util.getMD5("Legenda-Lee");
        System.out.println(pwd);
        System.out.println(pwd2);

        System.out.println(pwd.equals(pwd2));
    }

}
