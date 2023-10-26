package com.bhuvnesh.requestValidationAndExceptionHandling.Configuration;

import com.bhuvnesh.requestValidationAndExceptionHandling.Filter.LoggingFilter;
import com.bhuvnesh.requestValidationAndExceptionHandling.Filter.TimingFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig
{
    @Bean
    public FilterRegistrationBean<LoggingFilter> registerLoggingFilter()
    {
        FilterRegistrationBean<LoggingFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new LoggingFilter());
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<TimingFilter> registerTimingFilter()
    {
        FilterRegistrationBean<TimingFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new TimingFilter());
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }
}
