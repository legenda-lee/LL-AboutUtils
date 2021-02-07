package com.legenda.lee.utilcollection.utils.translate;


public class Main {

    // 在平台申请的APP_ID 详见 http://api.fanyi.baidu.com/api/trans/product/desktop?req=developer
    private static final String APP_ID = "20200214000384076";
    private static final String SECURITY_KEY = "DOhswrhYSdsfjR8XbYL2";

    public static void main(String[] args) {
        TransApi api = new TransApi(APP_ID, SECURITY_KEY);

        String query = "呵呵";
        System.out.println(api.getTransResult(query, "zh", "en"));
    }

}
