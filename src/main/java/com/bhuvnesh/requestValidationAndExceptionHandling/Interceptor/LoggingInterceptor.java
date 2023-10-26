package com.bhuvnesh.requestValidationAndExceptionHandling.Interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoggingInterceptor implements HandlerInterceptor
{
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception
    {
        System.out.println("Entering the Logging Interceptor | " +
                           "Time: " + System.currentTimeMillis());

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception
    {
        System.out.println("Leaving the Logging Interceptor | " +
                           "Time: " + System.currentTimeMillis());
    }
}
