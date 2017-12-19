package com.lq.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lq.Request.sjzbspglSearchRequest;
import com.lq.Response.SjzbSpglResponse;
import com.lq.Response.gztxResponse;
import com.lq.entity.SjxqYhgl;
import com.lq.entity.SjzbSpgl;
import com.lq.entity.gztx;
import com.lq.service.SjzbSpglService;

@Controller
@RequestMapping("/sjzbspgl")
public class SjzbSpglController {
	@Autowired
	private SjzbSpglService sjzbspglservice;
	
	@RequestMapping("/spgl")
	public String index(sjzbspglSearchRequest sjzbspglsearchrequest,HttpServletRequest request) {
		int total=sjzbspglservice.getTotalpage();
		int totalPage=0;
		if(total%10==0) {
			totalPage=total/10;
		}else {
			totalPage=total/10+1;
		}
		List<SjzbSpgl> list=sjzbspglservice.getAllSjzbSp(sjzbspglsearchrequest);
		request.setAttribute("sjzbspglList", list);
		request.setAttribute("total", total);
		request.setAttribute("totalPage",totalPage);
		request.setAttribute("nowPage",sjzbspglsearchrequest.getPage());
		return "/sjzb_spgl/sjzb_spgl";
	}
	
	@RequestMapping("/toAddSjzbSpgl")
	public String toAddSjzbSpgl() {
		return "/sjzb_spgl/addSjzbSpgl";
	}
	
	@RequestMapping("/addSjzbSpgl")
	public String addSjzbSpgl(@RequestParam("Image") MultipartFile Image,SjzbSpgl sjzbspgl, HttpServletRequest request) {
		String ImageName=null;
		if(Image.isEmpty()){  
            System.out.println("图片未上传");  
        }else{  
            String savePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + request.getContextPath()
            + "/assets/img/";
            String realPath = request.getSession().getServletContext().getRealPath("/assets/img/");
            System.out.println(realPath);
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String str = sdf.format(date);
            int max=999;
            int min=100;
            Random random = new Random();
            int s = random.nextInt(max)%(max-min+1) + min;
            String type=Image.getContentType().replaceAll("/", ".");
            String filename=str+s+type;
            //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
            //FileUtils.copyInputStreamToFile(Image.getInputStream(), new File(realPath,filename )); 
            try {
				Image.transferTo(new File(realPath,filename ));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            ImageName = savePath+filename;
           System.out.println(ImageName);
           sjzbspgl.setSptx(ImageName);
        }
		try {
			sjzbspglservice.addSjzbSpgl(sjzbspgl);
			return "redirect:/sjzbspgl/spgl";
		} catch (Exception e) {
			return "/error";
		}		
	}
	
	@RequestMapping("/editSjzbspgl")
	public String editSjzbspgl(Integer spid, HttpServletRequest request) {
		SjzbSpgl s=sjzbspglservice.getSjzbSpgl(spid);
		SjzbSpglResponse SjzbSpgl=new SjzbSpglResponse();
		String sjsjformatter = null,xjsjformatter= null;
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
			SjzbSpglResponse sjzbspgl=new SjzbSpglResponse();
			sjsjformatter = formatter.format(s.getSjsj());
			sjsjformatter=sjsjformatter.replace(" ", "T");
			xjsjformatter = formatter.format(s.getXjsj());
			xjsjformatter=xjsjformatter.replace(" ", "T");
			sjzbspgl.setBz(s.getBz());
			sjzbspgl.setCl(s.getCl());
			sjzbspgl.setDhjf(s.getDhjf());
			sjzbspgl.setQszl(s.getQszl());
			sjzbspgl.setSfyx(s.getSfyx());
			sjzbspgl.setSjsj(sjsjformatter);
			sjzbspgl.setSpid(s.getSpid());
			sjzbspgl.setSpm(s.getSpm());
			sjzbspgl.setSptx(s.getSptx());
			sjzbspgl.setXjsj(xjsjformatter);
		request.setAttribute("SjzbSpgl", sjzbspgl);
		
		return "/sjzb_spgl/editSjzbSpgl";
	}
	
	@RequestMapping("/updateSjzbSpgl")
	public String updateSjzbSpgl(@RequestParam("Image") MultipartFile Image,SjzbSpgl sjzbspgl, HttpServletRequest request) {

		String ImageName=null;
		if(Image.isEmpty()){  
            System.out.println("图片未上传");  
        }else{  
            String savePath = request.getScheme() + "://" + request.getServerName()
            + ":" + request.getServerPort() + request.getContextPath()
            + "/assets/img/";
            String realPath = request.getSession().getServletContext().getRealPath("/assets/img/");
            SjzbSpgl ss=sjzbspglservice.getSjzbSpgl(sjzbspgl.getSpid());
            String picture=ss.getSptx();
            String fileName=picture.replaceAll(savePath, "");
            System.out.println(fileName);
            File folder=new File(realPath);
            File[] files =folder.listFiles();
            for(File oldpicture:files) {
            	if(oldpicture.equals(new File(realPath+fileName))) {
            		oldpicture.delete();
            		break;
            	}
            }
            //boolean b=new File(realPath + fileName).delete();
            System.out.println(realPath);
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String str = sdf.format(date);
            int max=999;
            int min=100;
            Random random = new Random();
            int s = random.nextInt(max)%(max-min+1) + min;
            String type=Image.getContentType().replaceAll("/", ".");
            String filename=str+s+type;
            //这里不必处理IO流关闭的问题，因为FileUtils.copyInputStreamToFile()方法内部会自动把用到的IO流关掉，我是看它的源码才知道的  
            //FileUtils.copyInputStreamToFile(Image.getInputStream(), new File(realPath,filename )); 
            try {
				Image.transferTo(new File(realPath,filename ));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            sjzbspgl.setSptx(savePath+filename);
        }
		if (sjzbspglservice.updateSjzbSpgl(sjzbspgl)) {
			/*SjjgYhgl sjjgyhgl1 = sjjgyhglservice.getSjjgYhgl(sjjgyhgl.getYhid());
			request.setAttribute("sjjgyhgl", sjjgyhgl1);*/
			return "redirect:/sjzbspgl/spgl";
		} else {
			return "/error";
		}
	}
	
	@RequestMapping("/delSjzbSpgl")
	public String delSjzbSpgl(Integer spid, HttpServletResponse response,HttpServletRequest request) {
		String savePath = request.getScheme() + "://" + request.getServerName()
        + ":" + request.getServerPort() + request.getContextPath()
        + "/assets/img/";
		String realPath = request.getSession().getServletContext().getRealPath("/assets/img/");
		String result = "{\"result\":\"error\"}";
		SjzbSpgl ss=sjzbspglservice.getSjzbSpgl(spid);
		String fileName=ss.getSptx().replaceAll(savePath, "");
		System.out.println(fileName);
        File folder=new File(realPath);
        File[] files =folder.listFiles();
        for(File oldpicture:files) {
        	if(oldpicture.equals(new File(realPath+fileName))) {
        		oldpicture.delete();
        		break;
        	}
        }
		if (sjzbspglservice.delSjzbSpgl(spid)) {
			return "redirect:/sjzbspgl/spgl";
		}else {
			return "/error";
		}
	}
}
