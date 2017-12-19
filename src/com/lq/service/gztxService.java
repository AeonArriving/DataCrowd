package com.lq.service;

import java.util.List;

import com.lq.Request.gztxSearchRequest;
import com.lq.entity.gztx;

public interface gztxService {
	public void addgztx(gztx gztx);
	public List<gztx> getAllgztx(gztxSearchRequest gztxsearchrequest);
	public gztx getGztx(int id);
	public boolean updateGztx(gztx gZTX);
	public boolean delGztx(int id);
	public int getTotalpage();
}
