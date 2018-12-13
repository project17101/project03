package com.demo.until;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

public class AjaxFilter extends OncePerRequestFilter{

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin")); 
        response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept, If-Modified-Since");  
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");  
        response.setHeader("Access-Control-Max-Age", "3600");  
        response.addHeader("Access-Control-Allow-Credentials", "true");  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("application/json");  
<<<<<<< HEAD
        //此行代码确保请求可以继续执行至Controller  
=======
        //���д���ȷ��������Լ���ִ����Controller  
>>>>>>> 8eebb2c929736ce730ed80233dfc292613a17e5f
        filterChain.doFilter(request, response);

		
	}

}
