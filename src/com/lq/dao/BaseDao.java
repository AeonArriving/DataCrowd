package com.lq.dao;

import java.util.List;

public interface BaseDao<T> {
	boolean add(T t);
	boolean delete(T t);
	boolean update(T t);
	T findOne(int id);
	List<T> findAll();
}
