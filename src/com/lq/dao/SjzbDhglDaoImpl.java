package com.lq.dao;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjzbdhglSearchRequest;
import com.lq.entity.SjzbDhgl;

import utils.ParamValidator;
@Repository
public class SjzbDhglDaoImpl implements SjzbDhglDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public List<SjzbDhgl> getAllSjzbDh(sjzbdhglSearchRequest sjzbdhglsearchrequest) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter; 
		 formatter = new SimpleDateFormat ("yyyy-MM-dd"); 
		StringBuilder hql =new StringBuilder().append("from SjzbDhgl s").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(sjzbdhglsearchrequest.getDhhsearch())){
			hql.append(" and s.dhh = "+sjzbdhglsearchrequest.getDhhsearch());
		}
		if(!ParamValidator.isNullOrEmptyObject(sjzbdhglsearchrequest.getDhyhsearch())){
			hql.append(" and s.dhyh like '%"+sjzbdhglsearchrequest.getDhyhsearch()+"%'");
		}
		if(!ParamValidator.isNullOrEmptyObject(sjzbdhglsearchrequest.getDhsjsearch())){
			hql.append(" and s.dhsj = '"+formatter.format(sjzbdhglsearchrequest.getDhsjsearch())+"'");
		}
		int start=(sjzbdhglsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjzbDhgl ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}

}
