package com.bh.bbs2.dao;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@Slf4j
public class TestDaoTest {
    @Autowired
    private TestDao dao;

    @Test
    public void dao_test(){
        System.out.println(dao.selectTest());
    }
}
