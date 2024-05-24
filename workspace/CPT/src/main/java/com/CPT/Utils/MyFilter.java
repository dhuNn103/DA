package com.CPT.Utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyFilter extends HttpFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public MyFilter() {
		super();
	}

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(false);
 
        if (session != null && "admin".equals(session.getAttribute("role"))) {
            chain.doFilter(request, response); 
        } else {
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/index.jsp");
        }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
