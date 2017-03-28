package com.wangyin.ebl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("indexController")
public class IndexController extends BaseController{

	@RequestMapping("/common/index.do")
	public String index(HttpSession httpSession){
			return "index";
	}
}
