package com.legenda.lee.utilcollection.utils.validation;

import org.springframework.util.StringUtils;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-09-29 10:35 上午
 * @description:
 */
public class IsNumUtil {

    /**
     * 是否为数字（正负整数、正负小数）
     *
     * @param str
     * @return
     */
    public static boolean isNum(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$");
    }


    public static void main(String[] args) {
        System.out.println(isNum("432"));
        System.out.println(isNum("432.43"));
        System.out.println(isNum("432.430"));
        System.out.println(isNum("432.43044"));
        System.out.println(isNum("适量"));
        System.out.println(isNum("1/3"));
    }

}
