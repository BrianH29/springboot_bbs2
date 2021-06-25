package com.bh.bbs2.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class TestDao {
    private final static String NAMESPACE = "test";
    private final SqlSession sqlsession;

    public String selectTest(){
        return sqlsession.selectOne(NAMESPACE+".selectTest");
    }
}
