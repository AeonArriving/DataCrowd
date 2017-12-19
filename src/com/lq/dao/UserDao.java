package com.lq.dao;

import com.lq.entity.SjxqYhgl;

public interface UserDao extends BaseDao<SjxqYhgl>{
	public SjxqYhgl findByName(String name);
}
