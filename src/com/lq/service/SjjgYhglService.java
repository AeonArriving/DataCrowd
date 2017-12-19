package com.lq.service;

import java.util.List;

import com.lq.Request.sjjgyhglSearchRequest;
import com.lq.entity.SjjgYhgl;

public interface SjjgYhglService {
	public List<SjjgYhgl> getAllSjjgYh(sjjgyhglSearchRequest sjjgyhglsearchrequest);
	public void addSjjgYhgl(SjjgYhgl sjjgyhgl);
	public SjjgYhgl getSjjgYhgl(int id);
	public boolean updateSjjgYhgl(SjjgYhgl sjjgyhgl);
	public boolean delSjjgYhgl(int id);
	public int getTotalpage();
	
}
