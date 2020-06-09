package com.haojing.mail.service;

import com.haojing.mail.dto.OssCallbackResult;
import com.haojing.mail.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jiange
 * @date 2020/6/9 20:14
 */
public interface OssService {

    /**
     * oss上传策略生成
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     */
    OssCallbackResult callback(HttpServletRequest request);
}
