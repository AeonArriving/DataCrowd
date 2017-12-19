package com.lq.dao;


import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.entity.SjzbSjcczlj;

@Repository
public class SjzbSjcczljDaoImpl implements SjzbSjcczljDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public SjzbSjcczlj getAllSjcczlj() {
		// TODO Auto-generated method stub
		String hql = "from SjzbSjcczlj";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		System.out.println(query.list());
		return (SjzbSjcczlj) query.list().get(0);
	}
	@Override
	public boolean updateSjzbYhgl(SjzbSjcczlj sjzbsjcczlj) {
		// TODO Auto-generated method stub
		String hql = "update SjzbSjcczlj s set s.cczlj = ?,s.cjsjsjjg = ? where s.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, sjzbsjcczlj.getCczlj());
		query.setInteger(1, sjzbsjcczlj.getCjsjsjjg());
		query.setInteger(2, sjzbsjcczlj.getId());
		return (query.executeUpdate() > 0);
	}

}
