package com.lq.service;

import java.util.List;

import com.lq.Request.sjxqyhglSearchRequest;
import com.lq.entity.SjxqYhgl;

public interface SjxqYhglService {
	public List<SjxqYhgl> getAllSjxqYh(sjxqyhglSearchRequest sjxqyhglsearchrequest);

	public void addSjxqYhgl(SjxqYhgl sjxqyhgl);

	public Object getSjxqYhgl(int id);

	public boolean updateSjxqYhgl(SjxqYhgl sjxqyhgl);

	public boolean delSjxqYhgl(int id);

	public int getTotalpage();
}
