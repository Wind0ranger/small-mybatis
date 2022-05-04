package com.windranger;

import com.windranger.dao.IUserDao;
import com.windranger.mybatis.binding.MapperProxyFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;


public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);
    @Test
    public void test_MapperProxyFactory() {
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        HashMap<String, String> sqlSession = new HashMap<>();
        sqlSession.put("com.windranger.dao.IUserDao.queryUserName","模拟执行queryUserName");
        sqlSession.put("com.windranger.dao.IUserDao.queryUserAge","模拟执行queryUserAge");
        IUserDao iUserDao = factory.newInstance(sqlSession);
        String res = iUserDao.queryUserName("11");
        logger.info("测试结果：{}", res);
    }
}
