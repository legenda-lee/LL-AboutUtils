package com.legenda.lee.utilcollection.validation;

import com.legenda.lee.utilcollection.utils.validation.annotation.NameListTypeEnumCheck;
import com.legenda.lee.utilcollection.utils.validation.model.NameListTypeEnum;
import lombok.Data;

/**
 * @author Legenda-Lee
 * @date 2019-12-06 19:36
 * @description
 * @since 1.0.0
 */
@Data
public class TestBean {

    @NameListTypeEnumCheck(clazz = NameListTypeEnum.class)
    int nameListType;
}
