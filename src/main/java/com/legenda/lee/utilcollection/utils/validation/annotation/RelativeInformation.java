package com.legenda.lee.utilcollection.utils.validation.annotation;

import com.legenda.lee.utilcollection.utils.validation.validator.RelativeInfoValidator;
import org.hibernate.validator.constraints.Length;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author hzchenjie2
 * @create time: 2016年10月11日
 * @todo: 獬豸的联系人信息的校验
 */
@Constraint(validatedBy = RelativeInfoValidator.class)
//@NotBlank(message="联系人信息不能为空")
@Length(min=0,max=1024)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RelativeInformation {
        
    String message() default "";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
