package com.lq.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lq.Request.gztxSearchRequest;
import com.lq.dao.GztxDao;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.gztx;
@Service
public class gztxServiceImpl implements gztxService{

	@Autowired
	private GztxDao gztxdao;
	@Override
	public void addgztx(gztx gztx) {
		// TODO Auto-generated method stub
		gztx GZTX=new gztx();
		GZTX.setBt(gztx.getBt());
		GZTX.setFbrid(gztx.getFbrid());
		GZTX.setFbsj(new Date());
		GZTX.setJsrq(new Timestamp(0));
		GZTX.setKsrq(new Timestamp(0));
		GZTX.setNr(gztx.getNr());
		GZTX.setTxyhid(gztx.getTxyhid());
		GZTX.setTxyhlx(gztx.getTxyhlx());
		GZTX.setYxbz(gztx.getYxbz());
		gztxdao.addGztx(GZTX);
	}
	@Override
	public List<gztx> getAllgztx(gztxSearchRequest gztxsearchrequest) {
		// TODO Auto-generated method stub
		return gztxdao.getAllgztx(gztxsearchrequest);
	}
	@Override
	public gztx getGztx(int id) {
		// TODO Auto-generated method stub
		return (gztx) gztxdao.getGztx(id);
	}
	@Override
	public boolean updateGztx(gztx gZTX) {
		// TODO Auto-generated method stub
		return gztxdao.updateGztx(gZTX);
	}
	@Override
	public boolean delGztx(int id) {
		// TODO Auto-generated method stub
		return gztxdao.delGztx(id);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		return gztxdao.getTotalpage();
	}

}
