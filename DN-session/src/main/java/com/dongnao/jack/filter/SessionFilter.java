package com.dongnao.jack.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dongnao.jack.util.SpringContextUtil;

public class SessionFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
        SessionFilterDelegate sessionFilterDelegate = (SessionFilterDelegate)SpringContextUtil.getApplicationContext()
                .getBean("sessionFilterDelegate");
        sessionFilterDelegate.doFilter(request, response, chain);
    }
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }
    
}
