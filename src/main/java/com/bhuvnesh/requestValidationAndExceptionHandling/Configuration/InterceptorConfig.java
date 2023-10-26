package com.bhuvnesh.requestValidationAndExceptionHandling.Configuration;

import com.bhuvnesh.requestValidationAndExceptionHandling.Interceptor.LoggingInterceptor;
import com.bhuvnesh.requestValidationAndExceptionHandling.Interceptor.TimingInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new TimingInterceptor()).order(1);
        registry.addInterceptor(new LoggingInterceptor()).order(2);
    }
}
