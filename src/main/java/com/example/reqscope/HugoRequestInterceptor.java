package com.example.reqscope;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@AllArgsConstructor
public class HugoRequestInterceptor extends HandlerInterceptorAdapter {

    private static String HUGO_NAME_HEADER = "X-NAME";

    private final HugoRequestDataHolder hugoRequestDataHolder;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HugoData hugoData = new HugoData();
        hugoData.setName(request.getHeader(HUGO_NAME_HEADER));

        hugoRequestDataHolder.setHugoData(hugoData);
        return true;
    }
}
