package com.lq.service;

import com.lq.entity.SjxqYhgl;

public interface UserService {
	public SjxqYhgl findByName(String name) ;

	public boolean add(SjxqYhgl user);
}
