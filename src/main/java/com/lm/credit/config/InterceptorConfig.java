package com.lm.credit.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author ivan
 * @create 2019-08-26 4:00 PM
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {
    @Autowired
    private InitDataInterceptor initDataInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//.excludePathPatterns("")
        registry.addInterceptor(initDataInterceptor)
                .addPathPatterns("/v1/**")
        ;
        super.addInterceptors(registry);
    }
}
