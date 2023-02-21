package com.legenda.lee.utilcollection.utils.singleton;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2023-02-21 上午10:50
 * @description:
 */
public class Singleton {

    private volatile static Singleton instance;

    /**
     * 私有化构造方法
     */
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
