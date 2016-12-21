package com.ninebrains.service.impl;

import java.util.List;

import com.ninebrains.dao.IDomesticDao;
import com.ninebrains.dao.impl.DomesticDaoImpl;
import com.ninebrains.domain.DomesticDomain;
import com.ninebrains.service.IDomesticService;

public class DomesticServiceImpl  implements IDomesticService{
        private IDomesticDao dao=new DomesticDaoImpl();
        int result=0;
        @Override
        public int addStuff(DomesticDomain domesticDomain) {
               result=this.dao.addStuff(domesticDomain);
                return result;
        }

        @Override
        public int deleteStuff(DomesticDomain domesticDomain) {
                result=this.dao.deleteStuff(domesticDomain);
                return result;
        }

        @Override
        public int updateStuff(DomesticDomain domesticDomain) {
                result=this.dao.updateStuff(domesticDomain);
                return result;
        }

        @Override
        public List<DomesticDomain> selectStuff(DomesticDomain domesticDomain) {
                List<DomesticDomain> list=this.dao.selectStuff(domesticDomain);
                return list;
        }

        @Override
        public List<DomesticDomain> selectAll() {
                List<DomesticDomain> list=this.dao.selectAll();
                return list;
        }

        @Override
        public DomesticDomain selectEdit(DomesticDomain domesticDomain) {
                DomesticDomain domain=this.dao.selectEdit(domesticDomain);
                return domain;
        }

}
