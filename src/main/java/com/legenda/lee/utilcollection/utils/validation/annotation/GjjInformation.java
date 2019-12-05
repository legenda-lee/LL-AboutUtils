package com.legenda.lee.utilcollection.utils.validation.annotation;


import com.legenda.lee.utilcollection.utils.validation.validator.GjjInfoValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = GjjInfoValidator.class)
//@NotBlank(message="公积金信息不能为空")
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GjjInformation {
        
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
