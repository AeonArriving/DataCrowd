package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjzbyhglSearchRequest;
import com.lq.dao.SjzbScsjyhglDao;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjzbScsjyhgl;

@Service
public class SjzbScsjYhglServiceImpl implements SjzbScsjYhglService {

	@Autowired
	private SjzbScsjyhglDao sjzbscsjyhgldao;
	@Override
	public List<SjzbScsjyhgl> getAllScsjYh(sjzbyhglSearchRequest sjzbyhglsearchrequest) {
		// TODO Auto-generated method stub
		return sjzbscsjyhgldao.getAllScsjYh(sjzbyhglsearchrequest);
	}
	@Override
	public void addSjzbScsjyhgl(SjzbScsjyhgl sjzbscsjyhgl) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		SjzbScsjyhgl sjzbscsjyhgl1=new SjzbScsjyhgl();
		sjzbscsjyhgl1.setDj(sjzbscsjyhgl.getDj());;
		sjzbscsjyhgl1.setJf(sjzbscsjyhgl.getJf());;
		sjzbscsjyhgl1.setMm(sjzbscsjyhgl.getMm());;
		sjzbscsjyhgl1.setPjlc(sjzbscsjyhgl.getPjlc());;
		sjzbscsjyhgl1.setPjsd(sjzbscsjyhgl.getPjsd());;
		sjzbscsjyhgl1.setSj(sjzbscsjyhgl.getSj());;
		sjzbscsjyhgl1.setYhm(sjzbscsjyhgl.getYhm());;
		sjzbscsjyhgl1.setYx(sjzbscsjyhgl.getYx());;
		sjzbscsjyhgl1.setYxspsl(sjzbscsjyhgl.getYxspsl());
		sjzbscsjyhgl1.setZcfs(sjzbscsjyhgl.getZcfs());
		sjzbscsjyhgl1.setZlc(sjzbscsjyhgl.getZlc());
		sjzbscsjyhgldao.addSjzbScsjYhgl(sjzbscsjyhgl1);
	}
	@Override
	public SjzbScsjyhgl getSjzbYhgl(Integer id) {
		// TODO Auto-generated method stub
		return (SjzbScsjyhgl) sjzbscsjyhgldao.getSjzbYhgl(id);
	}
	@Override
	public boolean updateSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl) {
		// TODO Auto-generated method stub
		return sjzbscsjyhgldao.updateSjzbYhgl(sjzbscsjyhgl);
	}
	@Override
	public boolean delSjzbYhgl(int id) {
		// TODO Auto-generated method stub
		return sjzbscsjyhgldao.delSjzbYhgl(id);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjzbscsjyhgldao.getTotalpage();
	}

}
