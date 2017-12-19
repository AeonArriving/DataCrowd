package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjzbscsjxxSearchRequest;
import com.lq.dao.SjzbScsjxxDao;
import com.lq.entity.SjzbScsjxx;
@Service
public class SjzbScsjxxServiceImpl implements SjzbScsjxxService{

	@Autowired
	private SjzbScsjxxDao sjzbscsjxxdao;
	@Override
	public List<SjzbScsjxx> getAllScsjxx(sjzbscsjxxSearchRequest sjzbscsjxxsearchrequest) {
		// TODO Auto-generated method stub
		return sjzbscsjxxdao.getAllSjzbScsjxx(sjzbscsjxxsearchrequest);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjzbscsjxxdao.getTotalpage();
	}

}
