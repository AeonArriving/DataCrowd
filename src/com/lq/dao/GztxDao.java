package com.lq.dao;

import java.util.List;

import com.lq.Request.gztxSearchRequest;
import com.lq.entity.gztx;

public interface GztxDao {
	public void addGztx(gztx GZTX);

	public List<gztx> getAllgztx(gztxSearchRequest gztxsearchrequest);

	public gztx getGztx(int id);

	public boolean updateGztx(gztx gZTX);

	public boolean delGztx(int id);

	public int getTotalpage();
}
