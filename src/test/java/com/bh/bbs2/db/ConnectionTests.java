package com.bh.bbs2.db;


import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConnectionTests {
    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void Connection_test(){
        try(Connection con = sqlSessionFactory.openSession().getConnection()){
            System.out.println("Connection success");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void mapper_test(){
        try(SqlSession sqlSession = sqlSessionFactory.openSession()){
            String sysdate = sqlSession.selectOne("test.selectTest");
            System.out.println(sysdate);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
