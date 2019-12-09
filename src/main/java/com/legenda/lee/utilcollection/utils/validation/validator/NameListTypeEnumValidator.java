package com.legenda.lee.utilcollection.utils.validation.validator;



import com.legenda.lee.utilcollection.utils.validation.annotation.NameListTypeEnumCheck;
import com.legenda.lee.utilcollection.utils.validation.model.NameListTypeEnum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class NameListTypeEnumValidator implements ConstraintValidator<NameListTypeEnumCheck, Integer> {

	private Class clazz;

	@Override
	public void initialize(NameListTypeEnumCheck constraintAnnotation) {
		clazz = constraintAnnotation.clazz();
	}

	@Override
	public boolean isValid(Integer type, ConstraintValidatorContext context) {
		NameListTypeEnum[] nameListTypeEnums = (NameListTypeEnum[])clazz.getEnumConstants();
		for (NameListTypeEnum nameListTypeEnum : nameListTypeEnums) {
		    if (nameListTypeEnum.getType() == type.intValue()) {
				return true;
			}
		}
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate( "错误的枚举值：" + type + ", 在枚举" + clazz.getSimpleName() + "中不存在。" ).addConstraintViolation();
		return false;
	}
}
