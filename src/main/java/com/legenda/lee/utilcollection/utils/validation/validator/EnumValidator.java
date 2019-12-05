package com.legenda.lee.utilcollection.utils.validation.validator;



import com.legenda.lee.utilcollection.utils.validation.annotation.EnumCheck;
import com.legenda.lee.utilcollection.utils.validation.model.BaseEnum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class EnumValidator implements ConstraintValidator<EnumCheck,Integer> {

	private Class clazz;
	@Override
	public void initialize(EnumCheck constraintAnnotation) {
		clazz = constraintAnnotation.clazz();
	}

	@Override
	public boolean isValid(Integer code, ConstraintValidatorContext context) {
		//不做非空判断
		if (code == null) {
			return true;
		}
		BaseEnum inter[];
		inter = (BaseEnum[]) clazz.getEnumConstants(); 
		for (BaseEnum baseEnum : inter) {
		    if (baseEnum.getCode() == code) {
				return true;
			}
		}
		context.disableDefaultConstraintViolation();
		context.buildConstraintViolationWithTemplate(clazz.getSimpleName()+"信息中没有"+code).addConstraintViolation();  
		return false;
	}
}
