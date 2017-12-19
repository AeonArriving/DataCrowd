package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.dao.SjzbScsjyhglDao;
import com.lq.dao.SjzbSjcczljDao;
import com.lq.entity.SjzbSjcczlj;

@Service
public class SjzbSjcczljServiceImpl implements SjzbSjcczljService{

	@Autowired
	private SjzbSjcczljDao sjzbsjcczljdao;
	@Override
	public SjzbSjcczlj getAllSjcczlj() {
		// TODO Auto-generated method stub
		return sjzbsjcczljdao.getAllSjcczlj();
	}
	@Override
	public boolean updateSjzbSjcczlj(SjzbSjcczlj sjzbsjcczlj) {
		// TODO Auto-generated method stub
		return sjzbsjcczljdao.updateSjzbYhgl(sjzbsjcczlj);
	}

}
