package com.haojing.mail.service;

import com.haojing.mail.nosql.mongo.document.MemberReadHistory;

import java.util.List;

/**
 * 会员浏览记录管理Service
 * @author jiange
 * @date 2020/6/9 19:31
 */
public interface MemberReadHistoryService {

    /**
     * 生成浏览记录
     */
    int create(MemberReadHistory memberReadHistory);

    /**
     * 批量删除浏览记录
     */
    int delete(List<String> ids);

    /**
     * 获取用户浏览历史记录
     */
    List<MemberReadHistory> list(Long memberId);
}
