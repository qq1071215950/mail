package com.haojing.mail.service;

import com.haojing.mail.common.api.CommonResult;

/**
 * 会员管理
 * @author jiange
 * @date 2020/6/9 10:33
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);

}
