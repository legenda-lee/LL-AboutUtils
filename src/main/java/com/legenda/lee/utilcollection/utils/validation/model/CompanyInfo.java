package com.legenda.lee.utilcollection.utils.validation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyInfo {
	private String companyName;
	private String companyRegisterNo;
	private String companyAddress;
	private Integer companyType;
	private Integer companyLevel;
	private Integer companyNature;
	private String other;

}
