package com.legenda.lee.utilcollection.utils.validation.validator;


import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.legenda.lee.utilcollection.utils.validation.annotation.CompanyInformation;
import com.legenda.lee.utilcollection.utils.validation.model.CompanyInfo;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CompanyInfoValidator implements ConstraintValidator<CompanyInformation,String> {

	

	@Override
	public boolean isValid(String companyInfoStr, ConstraintValidatorContext context) {
		if(StringUtils.isEmpty(companyInfoStr)){
			return true;
		}
		Gson gson = new Gson();
		CompanyInfo info ;
		try {
			info = gson.fromJson(companyInfoStr, CompanyInfo.class);
		} catch (JsonSyntaxException e) {
			//禁用默认的message的值  
			context.disableDefaultConstraintViolation();
	        //重新添加错误提示语句  
			context.buildConstraintViolationWithTemplate("公司信息的格式不合法").addConstraintViolation();  
			return false;
		}
//		StringBuffer errorBuffer = new StringBuffer();
//		if (StringUtils.isBlank(info.getCompanyName())) {
//			errorBuffer.append("公司姓名不能为空,");
//		}
//		if (StringUtils.isNotBlank(info.getCompanyAddress())) {
//			errorBuffer.append("公司地址不能为空");
//		}
		
		
//		if (StringUtils.isNotBlank(info.getCompanyNature()) &&  CompanyNatureEnum.valueOfKey(info.getCompanyNature()) == null) {
//			errorBuffer.append("公司性质类型错误");
//		}
//
//		if (StringUtils.isNotBlank(info.getCompanyLevel()) && CompanyLevelEnum.valueOfKey(info.getCompanyLevel()) == null) {
//			errorBuffer.append("公司级别类型错误");
//		}
//
//		if (StringUtils.isNotBlank(info.getCompanyType()) && IndustryClassificationEnum.keyOf(info.getCompanyType()) == null) {
//			errorBuffer.append("公司类型错误");
//		}
//
//		if (errorBuffer.length() > 0) {
//			context.disableDefaultConstraintViolation();
//			context.buildConstraintViolationWithTemplate(errorBuffer.toString()).addConstraintViolation();
//			return false;
//		}
		return true;
	}

	@Override
	public void initialize(CompanyInformation constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

}
