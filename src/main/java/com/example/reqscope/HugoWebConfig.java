package com.example.reqscope;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class HugoWebConfig implements WebMvcConfigurer {

    private final HugoRequestInterceptor hugoRequestInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(hugoRequestInterceptor).addPathPatterns("/hugo");
    }
}
