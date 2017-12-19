package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjxqyhglSearchRequest;
import com.lq.dao.SjxqYhglDao;
import com.lq.entity.SjxqYhgl;

@Service
public class SjxqYhglServiceImpl implements SjxqYhglService{

	@Autowired
	private SjxqYhglDao sjxqyhgldao;
	@Override
	public List<SjxqYhgl> getAllSjxqYh(sjxqyhglSearchRequest sjxqyhglsearchrequest) {
		// TODO Auto-generated method stub
		return sjxqyhgldao.getAllSjxqYh(sjxqyhglsearchrequest);
	}
	@Override
	public void addSjxqYhgl(SjxqYhgl sjxqyhgl) {
		// TODO Auto-generated method stub
		SjxqYhgl sjxqyhgl1=new SjxqYhgl();
		sjxqyhgl1.setBz(sjxqyhgl.getBz());
		sjxqyhgl1.setDz(sjxqyhgl.getDz());
		sjxqyhgl1.setGs(sjxqyhgl.getGs());
		sjxqyhgl1.setLxdh(sjxqyhgl.getLxdh());
		sjxqyhgl1.setMm(sjxqyhgl.getMm());
		sjxqyhgl1.setQx(sjxqyhgl.getQx());
		sjxqyhgl1.setSj(sjxqyhgl.getSj());
		sjxqyhgl1.setYhid(sjxqyhgl.getYhid());
		sjxqyhgl1.setYhm(sjxqyhgl.getYhm());
		sjxqyhgl1.setYhms(sjxqyhgl.getYhms());
		sjxqyhgl1.setYx(sjxqyhgl.getYx());
		sjxqyhgl1.setZt(sjxqyhgl.getZt());
		sjxqyhgldao.addSjxqYhgl(sjxqyhgl1);
	}
	@Override
	public SjxqYhgl getSjxqYhgl(int id) {
		// TODO Auto-generated method stub
		return (SjxqYhgl) sjxqyhgldao.getSjxqYhgl(id);
	}
	@Override
	public boolean updateSjxqYhgl(SjxqYhgl sjxqyhgl) {
		// TODO Auto-generated method stub
		return sjxqyhgldao.updateSjxqYhgl(sjxqyhgl);
	}
	@Override
	public boolean delSjxqYhgl(int id) {
		// TODO Auto-generated method stub
		return sjxqyhgldao.delSjxqYhgl(id);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjxqyhgldao.getTotalpage();
	}

}
