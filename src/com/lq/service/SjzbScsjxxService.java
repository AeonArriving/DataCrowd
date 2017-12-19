package com.lq.service;

import java.util.List;

import com.lq.Request.sjzbscsjxxSearchRequest;
import com.lq.entity.SjzbScsjxx;

public interface SjzbScsjxxService {

	public List<SjzbScsjxx> getAllScsjxx(sjzbscsjxxSearchRequest sjzbscsjxxsearchrequest);

	public int getTotalpage();

}
