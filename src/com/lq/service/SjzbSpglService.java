package com.lq.service;

import java.util.List;

import com.lq.Request.sjzbspglSearchRequest;
import com.lq.entity.SjzbSpgl;

public interface SjzbSpglService {

	public List<SjzbSpgl> getAllSjzbSp(sjzbspglSearchRequest sjzbspglsearchrequest);

	public void addSjzbSpgl(SjzbSpgl sjzbspgl);

	public SjzbSpgl getSjzbSpgl(int spid);

	public boolean updateSjzbSpgl(SjzbSpgl sjzbspgl);

	public boolean delSjzbSpgl(int spid);

	public int getTotalpage();

}
