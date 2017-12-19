package com.lq.service;

import java.util.List;

import com.lq.Request.sjzbdhglSearchRequest;
import com.lq.entity.SjzbDhgl;

public interface SjzbDhglService {

	public List<SjzbDhgl> getAllSjzbDh(sjzbdhglSearchRequest sjzbdhglsearchrequest);

	public int getTotalpage();

}
