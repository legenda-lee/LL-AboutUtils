package com.legenda.lee.utilcollection.utils.validation.model;
/** 
* @author 作者 hzchenjie2: 
* @version 创建时间：2016年9月26日 下午3:56:02 
* 枚举类型接口
*/
public interface BaseEnum {

	/**
     * 整型唯一值，多用于存储数据库中
     *
     * @return 唯一值
     */
	int getCode();
	/**
     * Enum 字面量，用于输出、显示等
     *
     * @return 可读字面量
     */
	String getKey();
}
