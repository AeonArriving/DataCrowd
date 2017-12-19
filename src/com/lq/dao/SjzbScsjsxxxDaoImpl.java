package com.lq.dao;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.entity.SjzbScsjsxxx;

//×¢Èë
@Repository
public class SjzbScsjsxxxDaoImpl implements SjzbScsjsxxxDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public SjzbScsjsxxx getSjzbScsjsxxx(String dywjm) {
		// TODO Auto-generated method stub
		String hql = "from SjzbScsjsxxx s where s.dywjm=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, dywjm);

		return (SjzbScsjsxxx) query.uniqueResult();
	}

}
