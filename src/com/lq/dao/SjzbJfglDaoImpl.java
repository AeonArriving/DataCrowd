package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.entity.SjxqYhgl;
import com.lq.entity.SjzbJfgl;
@Repository
public class SjzbJfglDaoImpl implements SjzbJfglDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public List<SjzbJfgl> getAllSjzbJfgl() {
		// TODO Auto-generated method stub
		String hql = "from SjzbJfgl";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		System.out.println(query.list());
		return query.list();
	}
	@Override
	public void addSjzbjfgl(SjzbJfgl sjzbJfgl1) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(sjzbJfgl1);
	}
	@Override
	public SjzbJfgl getSjzbJfgl(Integer jfdj) {
		// TODO Auto-generated method stub
		String hql = "from SjzbJfgl s where s.jfdj=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, jfdj);

		return (SjzbJfgl) query.uniqueResult();
	}
	@Override
	public boolean updateSjzbJfgl(SjzbJfgl sjzbjfgl) {
		// TODO Auto-generated method stub
		String hql = "update SjzbJfgl s set s.djlc = ?,s.dwjf = ? where s.jfdj = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0,sjzbjfgl.getDjlc());
		query.setInteger(1, sjzbjfgl.getDwjf());
		query.setInteger(2, sjzbjfgl.getJfdj());
		return (query.executeUpdate() > 0);
	}

}
