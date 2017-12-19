package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.dao.SjzbJfglDao;
import com.lq.entity.SjxqYhgl;
import com.lq.entity.SjzbJfgl;
@Service
public class SjzbJfglServiceImpl implements SjzbJfglService{

	@Autowired
	private SjzbJfglDao sjzbjfgldao;
	@Override
	public List<SjzbJfgl> getAllSjzbJfgl() {
		// TODO Auto-generated method stub
		return sjzbjfgldao.getAllSjzbJfgl();
	}
	@Override
	public void addSjzbjfgl(SjzbJfgl sjzbjfgl) {
		// TODO Auto-generated method stub
		SjzbJfgl SjzbJfgl1=new SjzbJfgl();
		SjzbJfgl1.setDjlc(sjzbjfgl.getDjlc());
		SjzbJfgl1.setDwjf(sjzbjfgl.getDwjf());
		SjzbJfgl1.setJfdj(sjzbjfgl.getJfdj());
		sjzbjfgldao.addSjzbjfgl(SjzbJfgl1);
	}
	@Override
	public SjzbJfgl getSjzbJfgl(Integer jfdj) {
		// TODO Auto-generated method stub
		return (SjzbJfgl) sjzbjfgldao.getSjzbJfgl(jfdj);
	}
	@Override
	public boolean updateSjzbJfgl(SjzbJfgl sjzbjfgl) {
		// TODO Auto-generated method stub
		return sjzbjfgldao.updateSjzbJfgl(sjzbjfgl);
	}
	
}
