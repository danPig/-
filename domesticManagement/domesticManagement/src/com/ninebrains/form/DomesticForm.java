package com.ninebrains.form;

import org.apache.struts.action.ActionForm;

import com.ninebrains.domain.DomesticDomain;

public class DomesticForm  extends ActionForm{

        private static final long serialVersionUID = -6015539402748755842L;
        private DomesticDomain domesticDomain=new DomesticDomain();
        private String operate;
        private String username;
        private String password;
        private String id;
        public DomesticDomain getDomesticDomain() {
                return domesticDomain;
        }
        public void setDomesticDomain(DomesticDomain domesticDomain) {
                this.domesticDomain = domesticDomain;
        }
        public String getOperate() {
                return operate;
        }
        public void setOperate(String operate) {
                this.operate = operate;
        }
        public String getUsername() {
                return username;
        }
        public void setUsername(String username) {
                this.username = username;
        }
        public String getPassword() {
                return password;
        }
        public void setPassword(String password) {
                this.password = password;
        }
        public String getId() {
                return id;
        }
        public void setId(String id) {
                this.id = id;
        }
        
        
}
