package com.ninebrains.filter.wrapper;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class CharacterEncodingWrapper extends HttpServletRequestWrapper{
        private HttpServletRequest request;
        public CharacterEncodingWrapper(HttpServletRequest request) {
                super(request);
                this.request=request;
        }
        
        
        @Override
        public String getParameter(String name) {
                try {
                       String value=this.request.getParameter(name);
                       if(value==null){
                               return null;
                       }
                       if(!this.request.getMethod().equalsIgnoreCase("get")){
                               return value;
                       }else{
                               value=new String(value.getBytes("ISO8859-1"),this.request.getCharacterEncoding());
                               return value;
                       }
                } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                       }
      
              
        }
}
