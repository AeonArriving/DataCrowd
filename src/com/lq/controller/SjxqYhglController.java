package com.lq.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.sjxqyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjxqYhgl;
import com.lq.service.SjjgYhglService;
import com.lq.service.SjxqYhglService;

@Controller
@RequestMapping("/sjxqyhgl")
public class SjxqYhglController {
	@Autowired
	private SjxqYhglService sjxqyhglservice;
	@RequestMapping("/yhgl")
	public String index(sjxqyhglSearchRequest sjxqyhglsearchrequest,HttpServletRequest request) {
		int total=sjxqyhglservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		request.setAttribute("sjxqyhList", sjxqyhglservice.getAllSjxqYh(sjxqyhglsearchrequest));
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjxqyhglsearchrequest.getPage());
		return "/sjxq_yhgl/sjxq_yhgl";
	}
	
	@RequestMapping("/toAddSjxqYhgl")
	public String toAddSjjgYhgl() {
		return "/sjxq_yhgl/addSjxqYhgl";
	}
	
	@RequestMapping("/addSjxqYhgl")
	public String addSjxqYhgl(SjxqYhgl sjxqyhgl, HttpServletRequest request) {
		try {
			sjxqyhglservice.addSjxqYhgl(sjxqyhgl);
			return "redirect:/sjxqyhgl/yhgl";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/getSjxqYhgl")
	public String getSjxqYhgl(int id, HttpServletRequest request) {

		request.setAttribute("SjxqYhgl", sjxqyhglservice.getSjxqYhgl(id));

		return "/sjxq_yhgl/editSjxqYhgl";
	}
	
	@RequestMapping("/updateSjxqYhgl")
	public String updateSjxqYhgl(SjxqYhgl sjxqyhgl, HttpServletRequest request) {

		if (sjxqyhglservice.updateSjxqYhgl(sjxqyhgl)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/sjxqyhgl/yhgl";
		} else {
			return "/error";
		}
	}
	
	@RequestMapping("/delSjxqYhgl")
	public String delSjxqYhgl(int id, HttpServletResponse response) {

		/*String result = "{\"result\":\"error\"}";

		if (sjxqyhglservice.delSjxqYhgl(id)) {
			result = "{\"result\":\"success\"}";
		}

		response.setContentType("application/json");

		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		if(sjxqyhglservice.delSjxqYhgl(id)) {
			return "redirect:/sjxqyhgl/yhgl";
		}else {
			return "/error";
		}
	}
}
