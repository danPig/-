package com.ninebrains.domain;

import java.io.Serializable;

public class DomesticDomain implements Serializable{
        
        private static final long serialVersionUID = 8981524282159309198L;
        private String stuffname;
        private String sex;
        private String age;
        private String tel;
        private String thelevel;
        private String descriptions;
        private String stuffid;
        public String getStuffname() {
                return stuffname;
        }
        public void setStuffname(String stuffname) {
                this.stuffname = stuffname;
        }
        public String getSex() {
                return sex;
        }
        public void setSex(String sex) {
                this.sex = sex;
        }
        public String getAge() {
                return age;
        }
        public void setAge(String age) {
                this.age = age;
        }
        public String getTel() {
                return tel;
        }
        public void setTel(String tel) {
                this.tel = tel;
        }
        public String getThelevel() {
                return thelevel;
        }
        public void setThelevel(String thelevel) {
                this.thelevel = thelevel;
        }
        public String getDescriptions() {
                return descriptions;
        }
        public void setDescriptions(String descriptions) {
                this.descriptions = descriptions;
        }
        public String getStuffid() {
                return stuffid;
        }
        public void setStuffid(String stuffid) {
                this.stuffid = stuffid;
        }
        
        
}
