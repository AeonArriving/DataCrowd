package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjzbspglSearchRequest;
import com.lq.dao.SjzbSpglDao;
import com.lq.entity.SjzbScsjyhgl;
import com.lq.entity.SjzbSpgl;
@Service
public class SjzbSpglServiceImpl implements SjzbSpglService{

	@Autowired
	private SjzbSpglDao sjzbspgldao;
	@Override
	public List<SjzbSpgl> getAllSjzbSp(sjzbspglSearchRequest sjzbspglsearchrequest) {
		// TODO Auto-generated method stub
		return sjzbspgldao.getAllSjzbSp(sjzbspglsearchrequest);
	}
	@Override
	public void addSjzbSpgl(SjzbSpgl sjzbspgl) {
		// TODO Auto-generated method stub
		SjzbSpgl sjzbspgl1=new SjzbSpgl();
		sjzbspgl1.setXjsj(sjzbspgl.getXjsj());
		sjzbspgl1.setBz(sjzbspgl.getBz());
		sjzbspgl1.setCl(sjzbspgl.getCl());
		sjzbspgl1.setDhjf(sjzbspgl.getDhjf());
		sjzbspgl1.setQszl(sjzbspgl.getQszl());
		sjzbspgl1.setSfyx(sjzbspgl.getSfyx());
		sjzbspgl1.setSjsj(sjzbspgl.getSjsj());
		sjzbspgl1.setSpm(sjzbspgl.getSpm());
		sjzbspgl1.setSptx(sjzbspgl.getSptx());
		sjzbspgldao.addSjzbSpgl(sjzbspgl1);
	}
	@Override
	public SjzbSpgl getSjzbSpgl(int spid) {
		// TODO Auto-generated method stub
		return (SjzbSpgl) sjzbspgldao.getSjzbSpgl(spid);
	}
	@Override
	public boolean updateSjzbSpgl(SjzbSpgl sjzbspgl) {
		// TODO Auto-generated method stub
		return sjzbspgldao.updateSjzbSpgl(sjzbspgl);
	}
	@Override
	public boolean delSjzbSpgl(int spid) {
		// TODO Auto-generated method stub
		return sjzbspgldao.delSjzbYhgl(spid);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjzbspgldao.getTotalpage();
	}

}