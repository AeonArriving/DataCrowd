package com.lq.dao;

import java.util.List;

import com.lq.Request.sjzbyhglSearchRequest;
import com.lq.entity.SjzbScsjyhgl;

public interface SjzbScsjyhglDao {
	public List<SjzbScsjyhgl> getAllScsjYh(sjzbyhglSearchRequest sjzbyhglsearchrequest);
	public void addSjzbScsjYhgl(SjzbScsjyhgl sjzbscsjyhgl);
	public SjzbScsjyhgl getSjzbYhgl(Integer id);
	public boolean updateSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl);
	public boolean delSjzbYhgl(int id);
	public int getTotalpage();
}
