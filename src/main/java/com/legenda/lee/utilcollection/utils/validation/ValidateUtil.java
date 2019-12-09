package com.legenda.lee.utilcollection.utils.validation;



import com.legenda.lee.utilcollection.utils.validation.validator.MobileNumValidator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;


public class ValidateUtil {

    /**
     * 定义校验操作对象
     */
    private static Validator validator;

    static {
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        validator = validatorFactory.getValidator();
    }

    /**
     * Author: Legenda-Lee
     * Date: 2019-03-06 16:48:01
     * Description: 校验对象中参数合法性的方法
     *
     * @param obj 待校验的参数对象
     */
    public static  <T> String validate(T obj) {
        Set<ConstraintViolation<T>> validateResults = validator.validate(obj);
        // 参数全部合法则通过
        if (validateResults == null || validateResults.isEmpty()) {
            return null;
        }
        // 否则返回第一个不合法字段描述信息
        for (ConstraintViolation<T> cv : validateResults) {
            String message = cv.getMessage();
            return message;
        } 
        return null;
    }
    
}
