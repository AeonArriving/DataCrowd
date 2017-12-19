package com.lq.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.sjjgyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.service.SjjgYhglService;

@Controller
@RequestMapping("/sjjgyhgl")
public class SjjgYhglController {
	@Autowired
	private SjjgYhglService sjjgyhglservice;
	@RequestMapping("/yhgl")
	public String index(sjjgyhglSearchRequest sjjgyhglsearchrequest,HttpServletRequest request) {
		int total=sjjgyhglservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		List<SjjgYhgl> list= sjjgyhglservice.getAllSjjgYh(sjjgyhglsearchrequest);
		request.setAttribute("sjjgyhList", sjjgyhglservice.getAllSjjgYh(sjjgyhglsearchrequest));
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjjgyhglsearchrequest.getPage());
		return "/sjjg_yhgl/sjjg_yhgl";
	}
	
	@RequestMapping("/toAddSjjgYhgl")
	public String toAddSjjgYhgl() {
		return "/sjjg_yhgl/addSjjgYhgl";
	}
	
	@RequestMapping("/addSjjgYhgl")
	public String addSjjgYhgl(SjjgYhgl sjjgyhgl, HttpServletRequest request) {
		try {
			sjjgyhglservice.addSjjgYhgl(sjjgyhgl);
			return "redirect:/sjjgyhgl/yhgl";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/getSjjgYhgl")
	public String getSjjgYhgl(int id, HttpServletRequest request) {

		request.setAttribute("SjjgYhgl", sjjgyhglservice.getSjjgYhgl(id));

		return "/sjjg_yhgl/editSjjgYhgl";
	}
	
	@RequestMapping("/updateSjjgYhgl")
	public String updateSjjgYhgl(SjjgYhgl sjjgyhgl, HttpServletRequest request) {

		if (sjjgyhglservice.updateSjjgYhgl(sjjgyhgl)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/sjjgyhgl/yhgl";
		} else {
			return "/error";
		}
	}
	
	@RequestMapping("/delSjjgYhgl")
	public String delSjjgYhgl(int id, HttpServletResponse response) {

		/*String result = "{\"result\":\"error\"}";

		if (sjjgyhglservice.delSjjgYhgl(id)) {
			result = "{\"result\":\"success\"}";
		}

		response.setContentType("application/json");

		try {
			PrintWriter out = response.getWriter();
			out.write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		if (sjjgyhglservice.delSjjgYhgl(id)) {
			return "redirect:/sjjgyhgl/yhgl";
		}else {
			return "/error";
		}
	}
}
