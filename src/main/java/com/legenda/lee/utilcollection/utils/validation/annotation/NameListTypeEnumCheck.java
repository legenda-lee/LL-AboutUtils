package com.legenda.lee.utilcollection.utils.validation.annotation;


import com.legenda.lee.utilcollection.utils.validation.validator.NameListTypeEnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * @author Legenda-Lee
 * @date 2019-12-06 19:55:13
 * @description
 */
@Constraint(validatedBy = NameListTypeEnumValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NameListTypeEnumCheck {
	
    Class clazz();

    String message() default "";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
}
