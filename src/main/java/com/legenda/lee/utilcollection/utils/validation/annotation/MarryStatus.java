package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.*;


@Pattern(regexp = "^\\d+$", message = "婚姻状况不合法")
@NotNull(message="婚姻状况不能为空")
@Size(min = 1, max = 1, message = "婚姻状况长度不合法")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MarryStatus {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}