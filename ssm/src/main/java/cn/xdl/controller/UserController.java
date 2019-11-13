package cn.xdl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xdl.bean.User;
import cn.xdl.service.UserService;
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/toLogin")
	public String login() {
		return "/login";
	}
	
	@RequestMapping("/login")
	public String index(String username,String password,HttpServletRequest request) {
		User user = userService.find(username, password);
		if(user != null) {			
			request.setAttribute("username",username);
			return "/index";
			
		}
		return "/login";
	}
}
