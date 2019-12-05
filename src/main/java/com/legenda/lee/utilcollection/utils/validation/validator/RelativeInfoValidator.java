package com.legenda.lee.utilcollection.utils.validation.validator;



import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.legenda.lee.utilcollection.utils.validation.annotation.RelativeInformation;
import com.legenda.lee.utilcollection.utils.validation.model.RelativeInfo;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RelativeInfoValidator implements ConstraintValidator<RelativeInformation,String> {


	@Override
	public boolean isValid(String relativeInfoStr, ConstraintValidatorContext context) {
		if(StringUtils.isEmpty(relativeInfoStr)){
			return true;
		}
		Gson gson = new Gson();
		RelativeInfo info ;
		try {
			info = gson.fromJson(relativeInfoStr, RelativeInfo.class);
		} catch (JsonSyntaxException e) {
			//禁用默认的message的值  
			context.disableDefaultConstraintViolation();
	        //重新添加错误提示语句  
			context.buildConstraintViolationWithTemplate("联系人信息的格式不合法").addConstraintViolation();  
			return false;
		}
//		StringBuffer errorBuffer = new StringBuffer();
//		if (StringUtils.isBlank(info.getRelativeName())) {
//			errorBuffer.append("联系人姓名不能为空,");
//		}
//		if (errorBuffer.length() > 0) {
//			context.disableDefaultConstraintViolation();
//			context.buildConstraintViolationWithTemplate(errorBuffer.toString()).addConstraintViolation();
//			return false;
//		}
		return true;
	}

	@Override
	public void initialize(RelativeInformation constraintAnnotation) {
	}

}
