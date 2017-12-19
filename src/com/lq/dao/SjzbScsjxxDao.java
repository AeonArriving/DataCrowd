package com.lq.dao;

import java.util.List;

import com.lq.Request.sjzbscsjxxSearchRequest;
import com.lq.entity.SjzbScsjxx;

public interface SjzbScsjxxDao {

	public List<SjzbScsjxx> getAllSjzbScsjxx(sjzbscsjxxSearchRequest sjzbscsjxxsearchrequest);

	public int getTotalpage();




}
