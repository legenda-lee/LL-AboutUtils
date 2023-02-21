package com.legenda.lee.utilcollection.utils.singleton;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2023-02-21 上午10:56
 * @description:
 */
public class TestSingleton {

    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a == b);
    }
}
