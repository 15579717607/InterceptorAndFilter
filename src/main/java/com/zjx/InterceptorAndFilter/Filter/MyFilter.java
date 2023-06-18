package com.zjx.InterceptorAndFilter.Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author ZJX
 * @date 2023/6/17
 */
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // 过滤器初始化操作
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // 执行过滤操作，可以对请求进行修改
        chain.doFilter(request, response); // 继续执行过滤器链
    }

    @Override
    public void destroy() {
        // 过滤器销毁操作
    }
}
