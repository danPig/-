package com.ninebrains.service;

import java.util.List;

import com.ninebrains.domain.DomesticDomain;


public interface IDomesticService {
        public int addStuff(DomesticDomain domesticDomain);
        
        public int deleteStuff(DomesticDomain domesticDomain);
        
        public int updateStuff(DomesticDomain domesticDomain);
        
        public List<DomesticDomain> selectStuff(DomesticDomain domesticDomain);
        
        public List<DomesticDomain> selectAll();
        
        public DomesticDomain selectEdit(DomesticDomain domesticDomain);
}
