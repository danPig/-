package com.ninebrains.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {
        public static SqlSessionFactory getSessionFactory(){
                String resorce="mybatis-config.xml";
                InputStream in=MybatisUtil.class.getClassLoader().getResourceAsStream(resorce);
                SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(in);
                return sessionFactory;
        }
        
        public static SqlSession getSession(){
                SqlSessionFactory sessionFactory=getSessionFactory();
                SqlSession session=sessionFactory.openSession();
                return session;
                
        }
}
