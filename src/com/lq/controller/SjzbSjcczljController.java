package com.lq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.entity.SjxqYhgl;
import com.lq.entity.SjzbSjcczlj;
import com.lq.service.SjzbSjcczljService;

@Controller
@RequestMapping("/sjzbsjcczlj")
public class SjzbSjcczljController {
	@Autowired
	private SjzbSjcczljService sjzbsjcczljservice;
	@RequestMapping("/sjcczlj")
	public String index(HttpServletRequest request) {
		request.setAttribute("sjcczlj", sjzbsjcczljservice.getAllSjcczlj());
		return "/sjzb_sjcczlj/sjzb_sjcczlj";
	}
	
	@RequestMapping("/editSjcczlj")
	public String getSjxqYhgl(HttpServletRequest request) {

		request.setAttribute("sjcczlj", sjzbsjcczljservice.getAllSjcczlj());
		return "/sjzb_sjcczlj/editSjzbSjcczlj";
	}
	
	@RequestMapping("/updateSjzbSjcczlj")
	public String updateSjzbSjcczlj(SjzbSjcczlj sjzbsjcczlj, HttpServletRequest request) {

		if (sjzbsjcczljservice.updateSjzbSjcczlj(sjzbsjcczlj)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/sjzbsjcczlj/sjcczlj";
		} else {
			return "/error";
		}
	}
}
