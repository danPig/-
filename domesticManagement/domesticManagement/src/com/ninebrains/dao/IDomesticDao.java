package com.ninebrains.dao;

import java.util.List;

import com.ninebrains.domain.DomesticDomain;

public interface IDomesticDao {
        public int addStuff(DomesticDomain domain);
        
        public int deleteStuff(DomesticDomain domain);
        
        public int updateStuff(DomesticDomain domain);
        
        public List<DomesticDomain> selectStuff(DomesticDomain domain);
        
        public List<DomesticDomain> selectAll();
        
        public DomesticDomain selectEdit(DomesticDomain domain);
}
