package com.example.reqscope;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@RequiredArgsConstructor
public class HugoWebConfig extends WebMvcConfigurerAdapter {

    private final HugoRequestInterceptor hugoRequestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(hugoRequestInterceptor).addPathPatterns("/hugo");
    }
}
