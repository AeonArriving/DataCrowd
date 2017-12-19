package com.lq.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjjgyhglSearchRequest;
import com.lq.dao.SjjgYhglDao;
import com.lq.entity.SjjgYhgl;

@Service
public class SjjgYhglServiceImpl implements SjjgYhglService{

	@Autowired
	private SjjgYhglDao sjjgyhgldao;
	@Override
	public List<SjjgYhgl> getAllSjjgYh(sjjgyhglSearchRequest sjjgyhglsearchrequest) {
		// TODO Auto-generated method stub
		return sjjgyhgldao.getAllSjjgYh(sjjgyhglsearchrequest);
	}
	@Override
	public void addSjjgYhgl(SjjgYhgl sjjgyhgl) {
		// TODO Auto-generated method stub
		SjjgYhgl sjjgyhgl1=new SjjgYhgl();
		sjjgyhgl1.setBz(sjjgyhgl.getBz());
		sjjgyhgl1.setCjrq(new Date());
		sjjgyhgl1.setDj(sjjgyhgl.getDj());
		sjjgyhgl1.setDz(sjjgyhgl.getDz());
		sjjgyhgl1.setGs(sjjgyhgl.getGs());
		sjjgyhgl1.setLxdh(sjjgyhgl.getLxdh());
		sjjgyhgl1.setMm(sjjgyhgl.getMm());
		sjjgyhgl1.setQx(sjjgyhgl.getQx());
		sjjgyhgl1.setSj(sjjgyhgl.getSj());
		sjjgyhgl1.setSxrq(new Date());
		sjjgyhgl1.setYhid(sjjgyhgl.getYhid());
		sjjgyhgl1.setYhm(sjjgyhgl.getYhm());
		sjjgyhgl1.setYhms(sjjgyhgl.getYhms());
		sjjgyhgl1.setYx(sjjgyhgl.getYx());
		sjjgyhgl1.setZt(sjjgyhgl.getZt());
		sjjgyhgldao.addSjjgYhgl(sjjgyhgl1);
	}
	@Override
	public SjjgYhgl getSjjgYhgl(int id) {
		// TODO Auto-generated method stub
		return (SjjgYhgl) sjjgyhgldao.getSjjgYhgl(id);
	}
	@Override
	public boolean updateSjjgYhgl(SjjgYhgl sjjgyhgl) {
		// TODO Auto-generated method stub
		return sjjgyhgldao.updateSjjgYhgl(sjjgyhgl);
	}
	@Override
	public boolean delSjjgYhgl(int id) {
		// TODO Auto-generated method stub
		return sjjgyhgldao.delSjjgYhgl(id);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjjgyhgldao.getTotalpage();
	}

}
