package com.lq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.dao.SjzbScsjsxxxDao;

import com.lq.entity.SjzbScsjsxxx;
@Service
public class SjzbScsjsxxxServiceImpl implements SjzbScsjsxxxService{

	@Autowired
	private SjzbScsjsxxxDao sjzbscsjsxxxdao;
	@Override
	public SjzbScsjsxxx getSjzbScsjsxxx(String dywjm) {
		// TODO Auto-generated method stub
		return (SjzbScsjsxxx) sjzbscsjsxxxdao.getSjzbScsjsxxx(dywjm);
	}

}
