package com.legenda.lee.utilcollection.utils.io;

import java.io.*;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2021-01-25 12:28 下午
 * @description:
 */
public class AppendUtil {

    public static void main(String[] args) {
        addStr("/Users/legendalee/Downloads/抗生素格式化-前", "');", "/Users/legendalee/Downloads/抗生素格式化-后");
    }


    /**
     * 为指定文本文件的的每一行的结尾添加指定字符串并写入新文件中
     */
    public static void addStr(String sourceFilePath, String appendStr, String destFilePath) {
        File fileReaded = new File(sourceFilePath);
        try {
            //定义读取文件
            FileReader fr = new FileReader(fileReaded);
            BufferedReader br = new BufferedReader(fr);
            String content = br.readLine();

            //定义写出文件
            FileWriter fw = new FileWriter(destFilePath);
            BufferedWriter bw = new BufferedWriter(fw);

            while (content != null) {
                System.out.println("读入内容:\t" + content);
                System.out.println("写出内容：\t" + content + appendStr);
                if (content.indexOf(appendStr) > 0) {
                    bw.write(content + "\n");
                } else {
                    bw.write(content + appendStr + "\n");
                }
                content = br.readLine();
            }

            fw.flush();
            bw.flush();
            fw.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
