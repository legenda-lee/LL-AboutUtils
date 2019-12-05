package com.legenda.lee.utilcollection.utils.validation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.lang.annotation.*;


@Pattern(regexp = "^[A-Za-z\u4E00-\u9FA5]*$",message="姓名必须为中文")
@Constraint(validatedBy = {})
@Size(min = 2, max = 6)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ChineseName {

    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
