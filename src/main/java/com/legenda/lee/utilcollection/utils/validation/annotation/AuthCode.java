package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;


@Pattern(regexp =  "\\d{6}", message = "验证码不规范(6位数字)")
@Constraint(validatedBy = {})
@NotNull(message="验证码不能为空")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AuthCode {
        
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
