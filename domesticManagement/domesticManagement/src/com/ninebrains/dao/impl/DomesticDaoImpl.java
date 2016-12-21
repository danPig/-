package com.ninebrains.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ninebrains.dao.IDomesticDao;
import com.ninebrains.domain.DomesticDomain;
import com.ninebrains.utils.MybatisUtil;

public class DomesticDaoImpl implements IDomesticDao{
        SqlSession session=MybatisUtil.getSession();
        String sql="";
        int result=0;
        @Override
        public int addStuff(DomesticDomain domain) {
                sql="com.ninebrains.sqlmap.domestic.addStuff";
                result=session.insert(sql, domain);
                session.commit();
                return result;
        }

        @Override
        public int deleteStuff(DomesticDomain domain) {
                sql="com.ninebrains.sqlmap.domestic.deleteStuff";
                result=session.delete(sql, domain);
                session.commit();
                return result;
        }

        @Override
        public int updateStuff(DomesticDomain domain) {
                sql="com.ninebrains.sqlmap.domestic.updateStuff";
                result=session.update(sql, domain);
                session.commit();
                return 0;
        }

        @Override
        public List<DomesticDomain> selectStuff(DomesticDomain domain) {
                sql="com.ninebrains.sqlmap.domestic.getStuff";
                List<DomesticDomain> list=session.selectList(sql, domain);
                return list;
        }

        @Override
        public List<DomesticDomain> selectAll() {
                sql="com.ninebrains.sqlmap.domestic.getAll";
                List<DomesticDomain> list=session.selectList(sql);
                return list;
        }

        @Override
        public DomesticDomain selectEdit(DomesticDomain domain) {
                sql="com.ninebrains.sqlmap.domestic.selectEdit";
                DomesticDomain domesticDomain=session.selectOne(sql, domain);
                return domesticDomain;
        }

}
