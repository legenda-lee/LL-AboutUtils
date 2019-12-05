package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;


@Pattern(regexp = "^([a-zA-Z0-9_\\.\\-]){1,30}@([\\w-]+\\.){1,4}\\w+$", message = "邮箱地址不合法")
@Constraint(validatedBy = {})
@NotNull(message = "邮箱地址不能为空")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EmailAddress {
    
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
