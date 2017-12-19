package com.lq.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lq.Request.gztxSearchRequest;
import com.lq.Response.gztxResponse;
import com.lq.entity.gztx;
import com.lq.service.gztxService;

@Controller
@RequestMapping("/gztx")
public class gztxController {
	@Autowired
	private gztxService gztxservice;
	
	@RequestMapping("/toAddgztx")
	public String toAddgztx() {
		return "gztx/addgztx";
	}
	
	@RequestMapping("/addgztx")
	public String addgztx(gztx gztx, HttpServletRequest request) {
		try {
			gztxservice.addgztx(gztx);
			return "redirect:/gztx/index";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/index")
	public String index(gztxSearchRequest gztxsearchrequest,HttpServletRequest request) {
		List<gztx> list=gztxservice.getAllgztx(gztxsearchrequest);
		int total=gztxservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		List<gztxResponse> gztxlist=new ArrayList<gztxResponse>();
		String fbsjformatter = null,ksrqformatter= null,jsrqformatter= null;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat ("yyyy-MM-dd");
		for(gztx g:list) {
			gztxResponse gztx=new gztxResponse();
			fbsjformatter = formatter.format(g.getFbsj());
			jsrqformatter = formatter.format(g.getJsrq());
			ksrqformatter = formatter.format(g.getKsrq());
			gztx.setBt(g.getBt());
			gztx.setFbrid(g.getFbrid());
			gztx.setFbsj(fbsjformatter);
			gztx.setId(g.getId());
			gztx.setJsrq(jsrqformatter);
			gztx.setKsrq(ksrqformatter);
			gztx.setNr(g.getNr());
			gztx.setTxyhid(g.getTxyhid());
			gztx.setTxyhlx(g.getTxyhlx());
			gztx.setYxbz(g.getYxbz());
			gztxlist.add(gztx);
		}
		request.setAttribute("gztxList", gztxlist);
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",gztxsearchrequest.getPage());
		return "/gztx/index";
	}
	
	@RequestMapping("/getGztx")
	public String getGztx(Integer id, HttpServletRequest request) {
		gztx GZTX=gztxservice.getGztx(id);
		gztxResponse GZTXREQ=new gztxResponse();
		String ksrqformatter= null,jsrqformatter= null;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat ("yyyy-MM-dd");
		gztxResponse gztxRq=new gztxResponse();
		jsrqformatter = formatter.format(GZTX.getJsrq());
		ksrqformatter = formatter.format(GZTX.getKsrq());
		gztxRq.setBt(GZTX.getBt());
		gztxRq.setFbrid(GZTX.getFbrid());
		gztxRq.setId(GZTX.getId());
		gztxRq.setJsrq(jsrqformatter);
		gztxRq.setKsrq(ksrqformatter);
		gztxRq.setNr(GZTX.getNr());
		gztxRq.setTxyhid(GZTX.getTxyhid());
		gztxRq.setTxyhlx(GZTX.getTxyhlx());
		gztxRq.setYxbz(GZTX.getYxbz());
		request.setAttribute("gztx", gztxRq);

		return "/gztx/editGztx";
	}
	
	@RequestMapping("/updateGztx")
	public String updateGztx(gztx GZTX, HttpServletRequest request) {

		if (gztxservice.updateGztx(GZTX)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/gztx/index";
		} else {
			return "/error";
		}
	}
	
	@RequestMapping("/delGztx")
	public String delGztx(int id, HttpServletResponse response) {

		//String result = "{\"result\":\"error\"}";

		if (gztxservice.delGztx(id)) {
			return "redirect:/gztx/index";
		}else {
			return "/error";
		}
	}
}
