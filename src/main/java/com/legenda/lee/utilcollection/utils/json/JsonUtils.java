package com.legenda.lee.utilcollection.utils.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Legenda-Lee
 * @date 2019-11-20 16:32:41
 * @description  基于fastjson的json工具类
 */
public class JsonUtils {

    private static final SerializeConfig config;

    static {
        config = new SerializeConfig();
        // 使用和json-lib兼容的日期输出格式
        config.put(java.util.Date.class, new JSONLibDataFormatSerializer());
        // 使用和json-lib兼容的日期输出格式
        config.put(java.sql.Date.class, new JSONLibDataFormatSerializer());
    }

    private static final SerializerFeature[] features = {
            // 输出空置字段
            SerializerFeature.WriteMapNullValue,
            // list字段如果为null，输出为[]，而不是null
            SerializerFeature.WriteNullListAsEmpty,
            // 数值字段如果为null，输出为0，而不是null
            SerializerFeature.WriteNullNumberAsZero,
            // Boolean字段如果为null，输出为false，而不是null
            SerializerFeature.WriteNullBooleanAsFalse,
            // 字符类型字段如果为null，输出为""，而不是null
            SerializerFeature.WriteNullStringAsEmpty
    };

    // ==============带特殊处理的==============
    public static String obj2json(Object object) {
        return JSON.toJSONString(object, config);
    }

    public static String obj2json2(Object object) {
        return JSON.toJSONString(object, config, features);
    }


    // ==============不带特殊处理的==============
    /**
     * json字符串转map集合
     * @param jsonStr
     * @return
     */
    public static HashMap<String, String> json2Map(String jsonStr){
        return JSON.parseObject(jsonStr, new HashMap<String, String>().getClass());
    }

    /**
     * map转json字符串
     * @param map
     * @return
     */
    public static String map2Json(Map<String, String> map){
        String jsonStr = JSON.toJSONString(map);
        return jsonStr;
    }

    /**
     * json字符串转换成对象
     * @param jsonString
     * @param cls
     * @return
     */
    public static <T> T json2Bean(String jsonString, Class<T> cls){
        T t = null;
        try {
            t = JSON.parseObject(jsonString,cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 对象转换成json字符串
     * @param obj
     * @return
     */
    public static String bean2Json(Object obj){
        return JSON.toJSONString(obj);
    }

    /**
     * json字符串转换成List集合
     * (需要实体类)
     * @param jsonString
     * @return
     */
    public static <T> List<T> json2List(String jsonString, Class cls){
        List<T> list = null;
        try {
            list = JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * json字符串转换成ArrayList集合
     * (需要实体类)
     * @param jsonString
     * @return
     */
    public static <T>ArrayList<T> json2ArrayList(String jsonString,Class cls){
        ArrayList<T> list = null;
        try {
            list = (ArrayList<T>) JSON.parseArray(jsonString, cls);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    /**
     * List集合转换成json字符串
     * @param obj
     * @return
     */
    public static String list2Json(Object obj){
        return JSONArray.toJSONString(obj, true);
    }

    /**
     * json转List
     * (不需要实体类)
     * @param jsonStr
     * @return
     */
    public static JSONArray json2List(String jsonStr){
        return JSON.parseArray(jsonStr);
    }

}
