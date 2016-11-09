package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vip.VipInfo;
import com.vip.VipManeger;

public class VipLoginFilter extends BaseFiler{
public static final String defVipLoginSrc="/vip/login.jsp";
public static final String DEF_HOME_PAGE="/vip/home.jsp";
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

	
		
		if(request.getServletPath().startsWith("/vip/private/"))
		{
			
			VipInfo info=VipManeger.instance.getVipInfo(request);
			if(!info.isLogin)
			{
			System.err.println(request.getServletPath());
			RequestDispatcher dispatcher = request.getRequestDispatcher(DEF_HOME_PAGE);
			dispatcher.forward(request, response);
		  
			 return ;
			}
			
		}
		filterChain.doFilter(request, response);
	}

}
