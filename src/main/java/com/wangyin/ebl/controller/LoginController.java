package com.wangyin.ebl.controller;

import javax.servlet.http.HttpSession;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wangyin.ebl.domain.LoginEntity;

@Controller("userController")
public class LoginController {
	
	private final static String USERNAME = "ebl";
	private final static String PASSWORD = "ebl";
	
	@RequestMapping(value = "/user/doLogin.do",method={RequestMethod.POST})
	
	@ResponseBody
	public String  doLogin(@RequestParam String username,@RequestParam String password,HttpSession httpSession){
		LoginEntity le = new LoginEntity();
		if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password) ){
			le.setSuccess(false);
			le.setMessage("用户名密码不能为空!");
			return JSON.toJSONString(le, SerializerFeature.BrowserCompatible);
		}
		if(USERNAME.equals(username.trim()) && PASSWORD.equals(password.trim())){
			le.setSuccess(true);
			le.setMessage("登录成功");
			httpSession.setAttribute("username", username);
		}else{
			le.setSuccess(false);
			le.setMessage("用户名或密码错误!");
		}
		return JSON.toJSONString(le, SerializerFeature.BrowserCompatible);
	}
	
	@RequestMapping(value = "/user/doLogout.do")
	public String doLogout(HttpSession httpSession){
		httpSession.setAttribute("username", null);
		return "redirect:/common/index.do";
	}
	
	@RequestMapping(value = "/user/login.do")
	public String login(HttpSession httpSession){
		if(httpSession.getAttribute("username") != null){
			return "redirect:/common/index.do";
		}else{
			return "login";
		}
	}
}
