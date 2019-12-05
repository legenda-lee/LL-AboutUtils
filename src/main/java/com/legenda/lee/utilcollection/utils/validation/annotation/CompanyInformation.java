package com.legenda.lee.utilcollection.utils.validation.annotation;

import com.legenda.lee.utilcollection.utils.validation.validator.CompanyInfoValidator;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = CompanyInfoValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Length(min = 0,max = 1024)
public @interface CompanyInformation {
        
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
