package com.bhuvnesh.requestValidationAndExceptionHandling.Filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class TimingFilter implements Filter
{
    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException
    {
        //The code here is executed before the request reaches the Dispatcher servlet
        //Perform any pre-processing logic here (e.g. request logging)
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        System.out.println("Entering the Timing Filer | " +
                "Time: " + System.currentTimeMillis() + " | " +
                "Request URI " + request.getRequestURI() + " | " +
                "Request Method " + request.getMethod());

        //Continue the filter chain
        filterChain.doFilter(servletRequest, servletResponse);

        //The code here is executed after the response is generated
        //Perform any post-processing logic here (e.g. response logging)
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        System.out.println("Leaving the Timing Filer | " +
                "Time: " + System.currentTimeMillis() + " | " +
                "Response Status " + response.getStatus());
    }
}
