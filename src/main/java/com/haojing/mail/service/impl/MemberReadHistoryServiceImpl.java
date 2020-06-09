package com.haojing.mail.service.impl;

import com.haojing.mail.nosql.mongo.document.MemberReadHistory;
import com.haojing.mail.nosql.mongo.repository.MemberReadHistoryRepository;
import com.haojing.mail.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 会员浏览记录管理Service实现类
 * @author jiange
 * @date 2020/6/9 19:32
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {

    @Autowired
    private MemberReadHistoryRepository memberReadHistoryRepository;

    @Override
    public int create(MemberReadHistory memberReadHistory) {
        memberReadHistory.setId(null);
        memberReadHistory.setCreateTime(new Date());
        memberReadHistoryRepository.save(memberReadHistory);
        return 1;
    }

    @Override
    public int delete(List<String> ids) {
        List<MemberReadHistory> deleteList = new ArrayList<>();
        for(String id:ids){
            MemberReadHistory memberReadHistory = new MemberReadHistory();
            memberReadHistory.setId(id);
            deleteList.add(memberReadHistory);
        }
        memberReadHistoryRepository.deleteAll(deleteList);
        return ids.size();
    }

    @Override
    public List<MemberReadHistory> list(Long memberId) {
        MemberReadHistory memberReadHistory = new MemberReadHistory();
        memberReadHistory.setMemberId(memberId);
        Example<MemberReadHistory> example = Example.of(memberReadHistory);
        return memberReadHistoryRepository.findAll(example);
    }
}
