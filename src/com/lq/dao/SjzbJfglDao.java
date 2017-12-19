package com.lq.dao;

import java.util.List;

import com.lq.entity.SjzbJfgl;

public interface SjzbJfglDao {

	public List<SjzbJfgl> getAllSjzbJfgl();

	public void addSjzbjfgl(SjzbJfgl sjzbJfgl1);

	public SjzbJfgl getSjzbJfgl(Integer jfdj);

	public boolean updateSjzbJfgl(SjzbJfgl sjzbjfgl);

}
