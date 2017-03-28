/**
 * @Title: LoginInterceptor.java
 * 
 * @Package com.wangyin.marketing.filter
 *
 * @date 2015-11-7 下午7:04:08
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.filter;

import java.net.URLEncoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	/** (非 Javadoc)
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
            String url = request.getRequestURL().toString();
            String params = request.getParameter("from");
            if(!(null==params)){
            	url += ("?from=" +params);
            }
            @SuppressWarnings("deprecation")
			String urlEncode = URLEncoder.encode(url);
            if(url.contains("user") ||  url.startsWith("/api")){
            	return true;  
            }
            HttpSession session = request.getSession();  
            if(session.getAttribute("username") == null) {
                response.sendRedirect("/ebl-tools/user/login.do?target="+urlEncode);
            }
            return true;
	}
	/** (非 Javadoc)
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	/** (非 Javadoc)
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
