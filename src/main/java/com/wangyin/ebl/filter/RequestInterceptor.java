/**
 * @Title: RequestInterceptor.java
 * 
 * @Package com.wangyin.marketing.filter
 *
 * @date 2015-11-8 上午11:39:00
 * 
 * @version 1.0
 * 
 */
package com.wangyin.ebl.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 对查询及编辑页面做拦截 --如果是绕过index.do直接请求，则跳转到index.do
 * @author zhaoyuebing@
 * @description TODO
 * 
 */
public class RequestInterceptor implements HandlerInterceptor {

	/** (非 Javadoc)
	 *
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		String url = request.getRequestURL().toString();
		
		//避免和登录拦截器冲突，只有在登录之后才会做页面跳转
        if(url.contains("verify") || !url.contains("/common/query/") || request.getSession().getAttribute("username") == null){
        	return true;
        }

        String referer = request.getHeader("Referer");
        //如果referer == null 或者不是从index.do过来的，那么就跳转
        if(null == referer || !(referer.contains("common/index.do"))){
        	 if(request.getParameter("from")!=null && "parentTab".equals(request.getParameter("from"))){
        		 return true;
        	 }else{
        		 response.sendRedirect("/ebl-tools/common/index.do");
        	 }
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
