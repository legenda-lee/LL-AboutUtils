package com.legenda.lee.utilcollection.utils.validation.annotation;


import com.legenda.lee.utilcollection.utils.validation.validator.EnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Constraint(validatedBy = EnumValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EnumCheck {
	
    Class clazz();
    
    String message() default "";
    
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
    
    
}
