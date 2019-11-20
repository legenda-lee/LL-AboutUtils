package com.legenda.lee.utilcollection.utils.ip;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 * @author Legenda-Lee
 * @date 2019-11-19 20:20:34
 * @description 获取本地IP地址的方法工具类
 */
@Slf4j
public class IpUtil {

	/**
	 * 因为IP地址这种一般是获取一次就好了，所以不用每次都去调用方法重复计算效率低，通过变量初始化的方式使用。
	 */
    public static String ip = getIpAddress();

	/**
	 * 获取IP地址32位的后8位即最后一个byte的值
	 */
	public static String tailOfIp;
    static {
        if (!StringUtils.isEmpty(ip)) {
			tailOfIp = ip.substring(ip.lastIndexOf(".") + 1);
        }
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:21:11
     * @description 获取本地IP地址的方法
     *
     * @return String IP地址
     */
    public static String getIpAddress() {
        try {
            Enumeration<NetworkInterface> allNetInterfaces = NetworkInterface.getNetworkInterfaces();
            InetAddress ip;
            while (allNetInterfaces.hasMoreElements()) {
                NetworkInterface netInterface = allNetInterfaces.nextElement();
                if (netInterface.isLoopback() || netInterface.isVirtual() || !netInterface.isUp()) {
                    continue;
                } else {
                    Enumeration<InetAddress> addresses = netInterface.getInetAddresses();
                    while (addresses.hasMoreElements()) {
                        ip = addresses.nextElement();
                        if (ip != null && ip instanceof Inet4Address) {
                            return ip.getHostAddress();
                        }
                    }
                }
            }
        } catch (Exception e) {
        	log.error("获取本地IP地址失败");
        }
        return "";
    }


    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:23:54
     * @description 测试
     */
    public static void main(String[] args) {
        System.out.println(getIpAddress());
		System.out.println(tailOfIp);
    }
}
