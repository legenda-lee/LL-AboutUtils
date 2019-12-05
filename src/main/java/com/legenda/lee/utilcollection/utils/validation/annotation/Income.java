package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Payload;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.lang.annotation.*;


@Max(value = 999999, message = "收入不合法")
@Min(value = 100, message = "收入不合法")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Income {

    String message() default "{common.name.Pattern}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}