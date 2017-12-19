package com.lq.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.service.SjzbScsjsxxxService;

@Controller
@RequestMapping("/sjzbscsjsxxx")
public class SjzbScsjsxxxController {
	@Autowired
	private SjzbScsjsxxxService sjzbscsjsxxxservice;
	
	@RequestMapping("/getSjzbScsjsxxx")
	public String getSjzbScsjsxxx(String dywjm, HttpServletRequest request) {

		request.setAttribute("SjzbScsjsxxx", sjzbscsjsxxxservice.getSjzbScsjsxxx(dywjm));

		return "/sjzb_scsjsxxx/getsjzbscsjsxxx";
	}
}
