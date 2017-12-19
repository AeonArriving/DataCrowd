package com.lq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.sjzbdhglSearchRequest;
import com.lq.dao.SjzbDhglDao;
import com.lq.entity.SjzbDhgl;
@Service
public class SjzbDhglServiceImpl implements SjzbDhglService{

	@Autowired
	private SjzbDhglDao sjzbdhgldao;
	@Override
	public List<SjzbDhgl> getAllSjzbDh(sjzbdhglSearchRequest sjzbdhglsearchrequest) {
		// TODO Auto-generated method stub
		return sjzbdhgldao.getAllSjzbDh(sjzbdhglsearchrequest);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return sjzbdhgldao.getTotalpage();
	}

}
