package com.ninebrains.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ninebrains.filter.wrapper.CharacterEncodingWrapper;



public class CharacterEncodingFilter implements Filter{
        private String defaultCharset="UTF-8";
        private FilterConfig filterConfig=null;
        
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {
                this.filterConfig=filterConfig;
        }

        
        @Override
        public void doFilter(ServletRequest req, ServletResponse resp,
                        FilterChain chain) throws IOException, ServletException {
                HttpServletRequest request=(HttpServletRequest) req;
                HttpServletResponse response=(HttpServletResponse) resp;
                String charset=filterConfig.getInitParameter("charset");
                if(charset==null){
                        charset=defaultCharset;
                        
                }
                request.setCharacterEncoding(charset);
                response.setCharacterEncoding(charset);
                response.setContentType("text/html;charset="+charset);
                CharacterEncodingWrapper requestWrapper=new CharacterEncodingWrapper(request);
                chain.doFilter(requestWrapper, response);
                System.out.println("characterEncodingFilter has start");
        }

        
        @Override
        public void destroy() {
                
        }

}
