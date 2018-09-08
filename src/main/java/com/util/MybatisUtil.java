package com.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @program: MybatisWork
 * @Date: 2018/9/2/002 10:12
 * @Author: Mr.Qiu
 * @Description:
 */
public class MybatisUtil {

    private static SqlSessionFactory sqlSessionFactory;
    private static ThreadLocal<SqlSession> sessionThreadLocal = new ThreadLocal<SqlSession>();

    private static final String RESOURCES = "mybatis-config.xml";

    static {
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(RESOURCES);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        SqlSession session = sessionThreadLocal.get();
        if (session == null) {
            session = sqlSessionFactory.openSession();
        }
        return session;
    }

    public static void getClose() {
        SqlSession sqlSession = sessionThreadLocal.get();
        if (sqlSession != null) {
            sqlSession.close();
        }
        sessionThreadLocal.set(null);
    }

}
