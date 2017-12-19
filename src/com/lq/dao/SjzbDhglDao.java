package com.lq.dao;

import java.util.List;

import com.lq.Request.sjzbdhglSearchRequest;
import com.lq.entity.SjzbDhgl;

public interface SjzbDhglDao {

	List<SjzbDhgl> getAllSjzbDh(sjzbdhglSearchRequest sjzbdhglsearchrequest);

	int getTotalpage();

}
