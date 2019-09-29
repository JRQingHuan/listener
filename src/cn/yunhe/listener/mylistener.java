package cn.yunhe.listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class mylistener implements HttpSessionListener {
	int number = 0;
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		ServletContext application = se.getSession().getServletContext();
		Object obj = application.getAttribute("number");
		if(obj != null) {
			number = 1;
		}else {
			number = (Integer)obj + 1;
			application.setAttribute("number", number);
		}
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		
	}

}
