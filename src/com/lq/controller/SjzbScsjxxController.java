package com.lq.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.sjzbscsjxxSearchRequest;
import com.lq.service.SjzbScsjxxService;

@Controller
@RequestMapping("/sjzbscsjxx")
public class SjzbScsjxxController {
	@Autowired
	private SjzbScsjxxService sjzbscsjxxservice;
	
	@RequestMapping("/scsjxx")
	public String index(sjzbscsjxxSearchRequest sjzbscsjxxsearchrequest,HttpServletRequest request) {
		int total=sjzbscsjxxservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		request.setAttribute("ScsjxxList", sjzbscsjxxservice.getAllScsjxx(sjzbscsjxxsearchrequest));
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjzbscsjxxsearchrequest.getPage());
		return "/sjzb_scsjxx/sjzb_scsjxx";
	}
}
