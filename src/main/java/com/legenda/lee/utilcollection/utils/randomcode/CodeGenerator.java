package com.legenda.lee.utilcollection.utils.randomcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


/**
 * @author Legenda-Lee
 * @date 2019-11-19 20:12:39
 * @description 从26个字母和10个阿拉伯数字组合中获取指定需求的随机数的工具类
 * @since 1.0.0
 */
public class CodeGenerator {

    /**
     * 私有化构造方法
     */
    private CodeGenerator() {};

    /**
     * 大小写字母和阿拉伯数字组合，共62个字符。
     */
    private static final char[] LETTER_UPPER_LOWER_NUMBER = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
            'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * 小写字母和阿拉伯数字组合，共36个字符。
     */
    private static final char[] LETTER_NUMBER = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * 大写字母和阿拉伯数字组合，共36个字符。
     */
    private static final char[] LETTER_UPPER_NUMBER = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * 小写字母集合，共36个字符。
     */
    private static final char[] LETTER = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
            'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /**
     * 大写字母集合，共26个字符。
     */
    private static final char[] LETTER_UPPER = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
            'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /**
     * 阿拉伯数字组合，共10个字符。
     */
    private static final char[] NUMBER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /**
     * 随机变量
     */
    private static Random random = new Random();


    /**
     * @author Legenda-Lee
     * @date 2019-11-19 19:29:45
     * @description 获取指定组合类型和指定长度的随机数的方法
     *
     * @param chars 随机组合数据源集合
     * @param length 随机数目标长度
     * @return java.lang.String 随机数
     */
    private static String getRandom(char[] chars, int length) {
        StringBuilder sb = new StringBuilder();
        // 随机数的每个字符随机计步器
        int count = 1;
        while (count <= length) {
            // randomNumber值域:[0, chars.length)
            int randomNumber = Math.abs(random.nextInt(chars.length));
            if (randomNumber >= 0 && randomNumber < chars.length) {
                sb.append(chars[randomNumber]);
                count++;
            }
        }
        return sb.toString();
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-19 19:59:30
     * @description 从大写字母集合，共26个字符中获取指定长度随机数的方法。
     *
     * @param length 随机数目标长度
     * @return java.lang.String 随机数
     */
    public static String getRandomOfLetterUpper(int length) {
        // 长度不能小于1，并且长度不能太长，最长是36，根据需求调整。
        if (length < 1 || length > 36) {
            return "null";
        }
        return getRandom(LETTER_UPPER, length);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-19 19:59:30
     * @description 从大写字母和阿拉伯数字组合，共36个字符中获取指定长度随机数的方法。
     *
     * @param length 随机数目标长度
     * @return java.lang.String 随机数
     */
    public static String getRandomOfLetterUpperNumber(int length) {
        // 长度不能小于1，并且长度不能太长，最长是36，根据需求调整。
        if (length < 1 || length > 36) {
            return "null";
        }
        return getRandom(LETTER_UPPER_NUMBER, length);
    }

    // 其他组合请自行补充方法...



    /**
     * @author Legenda-Lee
     * @date 2019-11-19 17:59:00
     * @description 测试
     */
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        long a = System.currentTimeMillis();
        for (int i = 0; i < 300000; i++) {
            String temp = "";
            temp = getRandomOfLetterUpperNumber(8);
            s.add(temp);
            System.out.println(temp);
        }
        System.out.println("耗时:" + (System.currentTimeMillis() - a));
        System.out.println("重复情况：" + s.size());

        // System.out.println(getRandomOfLetterAndNumber(5));
        // System.out.println(getRandomOfNumber(5));
        // System.out.println(getRandomOfLetter(5));
        // System.out.println(getRandomOfLetterUpper(5));

        // for (int i = 0; i < 10000; i++) {
        //     System.out.println(random.nextInt(62));
        // }

    }
}
