package com.legenda.lee.utilcollection.utils.validation.validator;


import com.legenda.lee.utilcollection.utils.validation.annotation.MobileNum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 有风险 没有列进去的网段都无法兼容
 */
public class MobileNumValidator implements ConstraintValidator<MobileNum, String> {

    private static final Pattern MOBILE_PATTERN = Pattern.compile("^((13[0-9])|(14[5-9])|(15[^4,\\D])|(16[5,6,7])|(17[1-8])|(18[0-9])|(19[1,8,9]))\\d{8}$");

    public static final String GRAMMAR_INVALID_MESSAGE = "手机号格式错误！";
    @Override
    public void initialize(MobileNum constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isMobileNum(value);
    }


    /**
     * 2019年7月发行版 更新
     * 移动号段：134 135 136 137 138 139 147 148 150 151 152 157 158 159  165 172 178 182 183 184 187 188 198
     * 联通号段：130 131 132 145 146 155 156 166 167 171 175 176 185 186
     * 电信号段：133 149 153 173 174 177 180 181 189  191  199
     * 虚拟运营商不让进件
     *
     * @param telNum
     * @return
     */
    public static boolean isMobileNum(String telNum) {
        if (telNum == null || Objects.equals(telNum, "")) {
            return false;
        }
        if (telNum.trim().length() != 11){
            return false;
        }
        Matcher mobileType = MOBILE_PATTERN.matcher(telNum);
        return mobileType.matches();
    }
}
