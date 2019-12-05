package com.legenda.lee.utilcollection.utils.validation.validator;



import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.legenda.lee.utilcollection.utils.validation.annotation.GjjInformation;
import com.legenda.lee.utilcollection.utils.validation.model.GjjInfo;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GjjInfoValidator implements ConstraintValidator<GjjInformation,String> {
	private static final Gson gson = new Gson();

	@Override
	public void initialize(GjjInformation constraintAnnotation) {
	}

	@Override
	public boolean isValid(String gjjInfoStr, ConstraintValidatorContext context) {
		if(StringUtils.isEmpty(gjjInfoStr)){
			return true;
		}
		GjjInfo info ;
		try {
			info = gson.fromJson(gjjInfoStr, GjjInfo.class);
		} catch (JsonSyntaxException e) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate("公积金信息的格式不合法").addConstraintViolation();  
			return false;
		}
		StringBuffer errorBuffer = new StringBuffer();
		if (StringUtils.isEmpty(info.getGjjAccount())) {
			errorBuffer.append("公积金帐号不能为空;");
		}
		if (StringUtils.isEmpty(info.getGjjPassword())) {
			errorBuffer.append("公积金密码不能为空;");
		}
		if (errorBuffer.length() > 0) {
			errorBuffer.deleteCharAt(errorBuffer.length()-1);
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(errorBuffer.toString()).addConstraintViolation();  
			return false;
		}
		return true;
	}

}
