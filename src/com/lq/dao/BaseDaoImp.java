package com.lq.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

public class BaseDaoImp<T> implements BaseDao<T> {
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	private Class pClass;
	
	public BaseDaoImp() {
		Class clazz = this.getClass();
		Type type = clazz.getGenericSuperclass();
		ParameterizedType ptype = (ParameterizedType) type;
		Type[] types = ptype.getActualTypeArguments();
		Class tclass = (Class) types[0];
		this.pClass = tclass;
	}

	@Override
	public boolean add(T t) {
		sessionFactory.getCurrentSession().save(t);
		return true;
	}

	@Override
	public boolean delete(T t) {
		sessionFactory.getCurrentSession().delete(t);
		return true;
	}

	@Override
	public boolean update(T t) {
		sessionFactory.getCurrentSession().update(t);
		return true;
	}
	@SuppressWarnings("unchecked")
	@Override
	public T findOne(int id) {
		// TODO Auto-generated method stub
		return (T) sessionFactory.getCurrentSession().get(pClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stu
		Query query = sessionFactory.getCurrentSession().createQuery("from "+pClass.getSimpleName());
		return (List<T>) query.list();
	}

}
