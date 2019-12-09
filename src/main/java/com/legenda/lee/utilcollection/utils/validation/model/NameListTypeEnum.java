package com.legenda.lee.utilcollection.utils.validation.model;


/**
 * @author Legenda-Lee
 * @date 2019-12-04 14:14:09
 * @description
 */
public enum NameListTypeEnum {

    /**
     * 黑名单
     */
    BLACK_NAME_LIST_TYPE(1,"黑名单"),

    /**
     * 白名单
     */
    WHITE_NAME_LIST_TYPE(2,"白名单"),

    /**
     * 灰名单
     */
    GREY_NAME_LIST_TYPE(3,"灰名单");


    /**
     * 名单类型
     */
    private int type;

    /**
     * 类型描述
     */
    private String desc;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @author Legenda-Lee
     * @date 2019-12-04 11:52:51
     * @description 构造方法，默认是private。
     */
    NameListTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

}
