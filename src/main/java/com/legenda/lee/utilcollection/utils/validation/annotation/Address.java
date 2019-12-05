package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

@Pattern(regexp = "^[A-Za-z\u4E00-\u9FA5\\d_\\-\\,，（）()]*$", message = "地址信息输入不合法(仅支持_-,，四种特殊字符)")
@Constraint(validatedBy = {})
@NotNull(message = "地址输入信息不能为空")
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Address {
	String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
