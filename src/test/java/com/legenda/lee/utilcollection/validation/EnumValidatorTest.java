package com.legenda.lee.utilcollection.validation;

import com.legenda.lee.utilcollection.utils.validation.ValidateUtil;
import org.junit.jupiter.api.Test;

/**
 * @author Legenda-Lee
 * @date 2019-12-06 19:25
 * @description
 * @since 1.0.0
 */
public class EnumValidatorTest {


    @Test
    public void testEnumValidator() {
        TestBean testBean = new TestBean();
        testBean.setNameListType(5);

        String errorReqParamMsg = ValidateUtil.validate(testBean);
        System.out.println(errorReqParamMsg);
    }

}
