package com.lq.service;

import java.util.List;

import com.lq.Request.sjzbyhglSearchRequest;
import com.lq.entity.SjzbScsjyhgl;

public interface SjzbScsjYhglService {
	public List<SjzbScsjyhgl> getAllScsjYh(sjzbyhglSearchRequest sjzbyhglsearchrequest);

	public void addSjzbScsjyhgl(SjzbScsjyhgl sjjgyhgl);
	public SjzbScsjyhgl getSjzbYhgl(Integer id);
	public boolean updateSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl);
	public boolean delSjzbYhgl(int id);

	public int getTotalpage();
}
