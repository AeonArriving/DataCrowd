package com.lq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.sjzbdhglSearchRequest;
import com.lq.service.SjzbDhglService;

@Controller
@RequestMapping("/sjzbdhgl")
public class SjzbDhglController {
	@Autowired
	private SjzbDhglService sjzbdhglservice;
	
	@RequestMapping("/dhgl")
	public String index(sjzbdhglSearchRequest sjzbdhglsearchrequest,HttpServletRequest request) {
		int total=sjzbdhglservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		request.setAttribute("sjzbdhList", sjzbdhglservice.getAllSjzbDh(sjzbdhglsearchrequest));
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjzbdhglsearchrequest.getPage());
		return "/sjzb_dhgl/sjzb_dhgl";
	}
	
	
}
