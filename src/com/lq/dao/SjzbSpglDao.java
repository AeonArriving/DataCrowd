package com.lq.dao;

import java.util.List;

import com.lq.Request.sjzbspglSearchRequest;
import com.lq.entity.SjzbSpgl;

public interface SjzbSpglDao {

	public List<SjzbSpgl> getAllSjzbSp(sjzbspglSearchRequest sjzbspglsearchrequest);

	public void addSjzbSpgl(SjzbSpgl sjzbspgl1);

	public SjzbSpgl getSjzbSpgl(int spid);

	public boolean updateSjzbSpgl(SjzbSpgl sjzbspgl);

	public boolean delSjzbYhgl(int spid);

	public int getTotalpage();

}
