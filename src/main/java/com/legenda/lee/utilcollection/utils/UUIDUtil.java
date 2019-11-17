package com.legenda.lee.utilcollection.utils;

import java.util.UUID;

/**
 * @author Legenda-Lee(lee.legenda@gmail.com)
 * @date 2019-11-17 22:20
 * @description
 * @since : 1.0.0
 */
public class UUIDUtil {

    public static String  getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static void main(String[] args) {
        System.out.println(getUUID());
    }
}
