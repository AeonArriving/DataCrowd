package com.lq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.sjzbyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjzbScsjyhgl;
import com.lq.service.SjzbScsjYhglService;


//×¢Èëcontroller
@Controller
@RequestMapping("/sjzbyhgl")
public class SjzbYhglController {
	@Autowired
	private SjzbScsjYhglService sjzbscsjyhglservice;
	@RequestMapping("/yhgl")
	public String index(sjzbyhglSearchRequest sjzbyhglsearchrequest,HttpServletRequest request) {
		int total=sjzbscsjyhglservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		request.setAttribute("sjzbscsjyhList", sjzbscsjyhglservice.getAllScsjYh(sjzbyhglsearchrequest));
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjzbyhglsearchrequest.getPage());
		return "/sjzb_yhgl/sjzb_yhgl";
	}
	
	@RequestMapping("/toAddSjzbYhgl")
	public String toAddSjzbYhgl() {
		return "/sjzb_yhgl/addSjzbYhgl";
	}
	
	@RequestMapping("/addSjzbYhgl")
	public String addSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl, HttpServletRequest request) {
		try {
			sjzbscsjyhglservice.addSjzbScsjyhgl(sjzbscsjyhgl);
			return "redirect:/sjzbyhgl/yhgl";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/getSjzbYhgl")
	public String getSjzbYhgl(Integer id, HttpServletRequest request) {

		request.setAttribute("SjzbYhgl", sjzbscsjyhglservice.getSjzbYhgl(id));

		return "sjzb_yhgl/editSjzbYhgl";
	}
	
	@RequestMapping("/updateSjzbYhgl")
	public String updateSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl, HttpServletRequest request) {

		if (sjzbscsjyhglservice.updateSjzbYhgl(sjzbscsjyhgl)) {
			/*SjzbScsjyhgl SjzbScsjyhgl1 = sjzbscsjyhglservice.getSjzbYhgl(sjzbscsjyhgl.getYhid());
			request.setAttribute("sjzbscsjyhList", SjzbScsjyhgl1);*/
			return "redirect:/sjzbyhgl/yhgl";
		} else {
			return "/error";
		}
	}
	
	@RequestMapping("/delSjzbYhgl")
	public String delSjzbYhgl(int id, HttpServletResponse response) {

		/*String result = "{\"result\":\"error\"}";

		if (sjzbscsjyhglservice.delSjzbYhgl(id)) {
			result = "{\"result\":\"success\"}";
		}

		response.setContentType("application/json");

		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		if(sjzbscsjyhglservice.delSjzbYhgl(id)) {
			return "redirect:/sjzbyhgl/yhgl";
		}else {
			return "/error";
		}
	}
}
