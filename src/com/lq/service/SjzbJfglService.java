package com.lq.service;

import java.util.List;

import com.lq.entity.SjzbJfgl;

public interface SjzbJfglService {

	public List<SjzbJfgl> getAllSjzbJfgl();

	public void addSjzbjfgl(SjzbJfgl sjzbjfgl);

	public SjzbJfgl getSjzbJfgl(Integer jfdj);

	public boolean updateSjzbJfgl(SjzbJfgl sjzbjfgl);

}
