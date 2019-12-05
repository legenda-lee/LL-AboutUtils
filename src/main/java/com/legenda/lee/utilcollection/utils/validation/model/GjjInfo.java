package com.legenda.lee.utilcollection.utils.validation.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GjjInfo {

	private String gjjAccount;

	private String gjjPassword;

	private String gjjCity;
	//见枚举类GjjAccountTypeEnum
	private Integer gjjAccountType;

	private String other;
   
}
