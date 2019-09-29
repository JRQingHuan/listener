package cn.yunhe.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Filter001 implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding("utf-8");
//		String username = request.getParameter("usename");
//		List<String> list = new ArrayList<String>();
//		String a;
//		String ccc = null;
//		list.add("草");
//		if(list != null) {
//			for(int i=0;i< list.size();i++) {
//				a= list.get(i);
//				if(username.contains(a)) {
//					ccc = username.replaceAll(a, "ai");
//				}
//			}
//		}
		//request.setAttribute("username", ccc);
		chain.doFilter(request, response);
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
