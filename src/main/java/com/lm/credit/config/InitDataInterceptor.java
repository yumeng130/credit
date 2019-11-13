package com.lm.credit.config;

import com.lm.credit.util.IdWorkerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器,初始化seqNo
 */
@Slf4j
@Component
public class InitDataInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("seqNo", IdWorkerUtil.getNextId());
        return true;
    }

}
