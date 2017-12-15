package org.moier.web.interceptors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Description:
 * @Author: huanghs
 * @Date: Created in 下午9:12 2017/12/14
 */
public class DemoInterceptor extends HandlerInterceptorAdapter {


    private static Logger LOGGER = LoggerFactory.getLogger(DemoInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        request.setAttribute("startTime",System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long start = (long)request.getAttribute("startTime");
        StringBuilder sb = new StringBuilder("\r\n-----------------------------------------\r\n");
        sb.append(request.getRequestURI()).append("\r\n");
        sb.append("该请求花费时间为：").append(System.currentTimeMillis() - start).append(" ms\r\n");
        sb.append("-----------------------------------------");
        LOGGER.info(sb.toString());
    }
}
