package com.lq.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjzbscsjxxSearchRequest;
import com.lq.entity.SjzbScsjxx;

import utils.ParamValidator;
@Repository
public class SjzbScsjxxDaoImpl implements SjzbScsjxxDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<SjzbScsjxx> getAllSjzbScsjxx(sjzbscsjxxSearchRequest sjzbscsjxxsearchrequest) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter; 
		 formatter = new SimpleDateFormat ("yyyy-MM-dd"); 
		StringBuilder hql = new StringBuilder().append("from SjzbScsjxx s").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(sjzbscsjxxsearchrequest.getWjmsearch())){
			hql.append(" and s.wjm like "+"'%"+sjzbscsjxxsearchrequest.getWjmsearch()+"%'");
		}
		if(!ParamValidator.isNullOrEmptyObject(sjzbscsjxxsearchrequest.getScyhsearch())){
			hql.append(" and s.scyh like "+"'%"+sjzbscsjxxsearchrequest.getScyhsearch()+"%'");
		}
		if(!ParamValidator.isNullOrEmptyObject(sjzbscsjxxsearchrequest.getScsjsearch())){
			hql.append(" and s.scsj = "+"'"+formatter.format(sjzbscsjxxsearchrequest.getScsjsearch())+"'");
		}
		int start=(sjzbscsjxxsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
	}

	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjzbScsjxx ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}
	

}
