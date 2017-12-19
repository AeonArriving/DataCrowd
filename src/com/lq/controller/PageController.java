package com.lq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lq.entity.SjxqYhgl;
import com.lq.service.UserService;


//注入controller
@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String login(SjxqYhgl user) {
		SjxqYhgl temp=userService.findByName(user.getYhm());
		if (temp==null) {
			System.out.println("没有该用户");
			return "no user";
		}
		System.out.println("传过来的密码："+user.getMm()+"  数据库密码："+temp.getMm());
		if (!temp.getMm().equals(user.getMm())) {
			System.out.println("用户名或密码错误");
			return "password wrong";
		}
		return "success";
	}
	@RequestMapping("/register")
	@ResponseBody
	public String register(SjxqYhgl user) {
		if (user.getYhm()==null||user.getYhm().equals("")
				||user.getMm()==null||user.getMm().equals("")	
					) {
				System.out.println("用户名和密码不能为空");
				return "username or password can not be null";
			}
		SjxqYhgl temp=userService.findByName(user.getYhm());
		if (temp!=null) {
			System.out.println("用户已被注册");
			return "this username has bean registered";
		}
		System.out.println(user.getYhm());
		if (userService.add(user)) {
			System.out.println("注册成功");
			return "success";
		}else {
			System.out.println("注册失败");
			return "failed";
		}
	}
}
