package com.legenda.lee.utilcollection.utils.gps;

import com.legenda.lee.utilcollection.dto.GpsAnalysisAddressDTO;
import com.legenda.lee.utilcollection.utils.json.JsonUtils;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;


/**
 * @author Legenda-lee
 * @date 2019-11-20 11:51
 * @description
 * @since 1.0.0
 */
public class GPSUtils {

    /**
     * 高德地图根据GPS经纬度解析物理地址的URL
     * 注意：其中key来自于互联网，过期时间不详。
     */
    private static final String key = "389880a06e3f893ea46036f030c94700";
    private static final String GPS_ANALYSIS_URL = "https://restapi.amap.com/v3/geocode/regeo?output=json&key=" + key + "&location=";



    /**
     * @author Legenda-Lee
     * @date 2019-11-20 15:26:57
     * @description 通过GPS地址解析物理地址：
     *              g_country	GPS国家	　
     *              g_prov	GPS省份	　
     *              g_city	GPS城市	　
     *              g_dist	GPS区县市
     *
     * @param longitude 经度
     * @param latitude 纬度
     * @return java.util.HashMap<java.lang.String,java.lang.String> 包含国家、省份、城市等地址的map
     */
    public static HashMap<String, String> getPhysicsAddressByGPS(String longitude, String latitude) {
        HashMap<String, String> gpsAddressResultMap = new HashMap<>();
        if (StringUtils.isEmpty(longitude) || StringUtils.isEmpty(latitude)) {
            return gpsAddressResultMap;
        }
        try {
            // 1、请求解析GPS
            URL url = new URL(GPS_ANALYSIS_URL + longitude + "," + latitude);
            URLConnection conn = url.openConnection();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            String line;
            StringBuffer result = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();

            // 2、解析返回的json
            GpsAnalysisAddressDTO gpsAnalysisAddressDTO  = JsonUtils.json2Bean(result.toString(), GpsAnalysisAddressDTO.class);
            if ("OK".equals(gpsAnalysisAddressDTO.getInfo()) && "1".equals(gpsAnalysisAddressDTO.getStatus())) {
                String country = gpsAnalysisAddressDTO.getRegeocode().getAddressComponent().getCountry();
                String province = gpsAnalysisAddressDTO.getRegeocode().getAddressComponent().getProvince();
                String city = gpsAnalysisAddressDTO.getRegeocode().getAddressComponent().getCity();
                String dist = gpsAnalysisAddressDTO.getRegeocode().getAddressComponent().getDistrict();

                // 组装返回的信息
                gpsAddressResultMap.put("g_country", country);
                gpsAddressResultMap.put("g_prov", province);
                gpsAddressResultMap.put("g_city", city);
                gpsAddressResultMap.put("g_dist", dist);
                gpsAddressResultMap.put("name", "");
            }
        } catch (Exception e) {
            System.out.println("GPS对应的物理地址解析失败");
        }
        // 3、返回组装结果
        return gpsAddressResultMap;
    }


    /**
     * @author Legenda-Lee
     * @date 2019-11-20 15:49:10
     * @description 测试
     */
    public static void main(String[] args) {
        System.out.println(getPhysicsAddressByGPS("120.219375416", "30.2592444615"));
    }

}
