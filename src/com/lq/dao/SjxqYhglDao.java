package com.lq.dao;

import java.util.List;

import com.lq.Request.sjxqyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjxqYhgl;

public interface SjxqYhglDao {
	public List<SjxqYhgl> getAllSjxqYh(sjxqyhglSearchRequest sjxqyhglsearchrequest);

	public void addSjxqYhgl(SjxqYhgl sjxqyhgl1);

	public SjxqYhgl getSjxqYhgl(int id);

	public boolean updateSjxqYhgl(SjxqYhgl sjxqyhgl);

	public boolean delSjxqYhgl(int id);

	public int getTotalpage();
}
