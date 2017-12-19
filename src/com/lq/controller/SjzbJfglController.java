package com.lq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.entity.SjzbJfgl;
import com.lq.service.SjzbJfglService;

@Controller
@RequestMapping("/sjzbjfgl")
public class SjzbJfglController {
	@Autowired
	private SjzbJfglService sjzbjfglservice;
	@RequestMapping("/jfgl")
	public String index(HttpServletRequest request) {
		request.setAttribute("sjzbjfglList", sjzbjfglservice.getAllSjzbJfgl());
		return "/sjzb_jfgl/sjzb_jfgl";
	}
	
	@RequestMapping("/toAddSjzbJfgl")
	public String toAddSjzbJfgl() {
		return "/sjzb_jfgl/addSjzbJfgl";
	}
	
	@RequestMapping("/addSjzbJfgl")
	public String addSjzbJfgl(SjzbJfgl sjzbjfgl, HttpServletRequest request) {
		try {
			sjzbjfglservice.addSjzbjfgl(sjzbjfgl);
			return "redirect:/sjzbjfgl/jfgl";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/getSjzbJfgl")
	public String getSjzbJfgl(Integer jfdj, HttpServletRequest request) {

		request.setAttribute("SjzbJfgl", sjzbjfglservice.getSjzbJfgl(jfdj));

		return "/sjzb_jfgl/editSjzbJfgl";
	}
	
	@RequestMapping("/updateSjzbJfgl")
	public String updateSjzbJfgl(SjzbJfgl sjzbjfgl, HttpServletRequest request) {

		if (sjzbjfglservice.updateSjzbJfgl(sjzbjfgl)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/sjzbjfgl/jfgl";
		} else {
			return "/error";
		}
	}
}
