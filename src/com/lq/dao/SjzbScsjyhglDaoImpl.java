package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjzbyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjzbScsjyhgl;

import utils.ParamValidator;

//×¢Èë
@Repository
public class SjzbScsjyhglDaoImpl implements SjzbScsjyhglDao{
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public List<SjzbScsjyhgl> getAllScsjYh(sjzbyhglSearchRequest sjzbyhglsearchrequest) {
		// TODO Auto-generated method stub
		
		StringBuilder hql = new StringBuilder().append(" from SjzbScsjyhgl").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(sjzbyhglsearchrequest.getYhidsearch())){
			hql.append(" and yhid = "+sjzbyhglsearchrequest.getYhidsearch());
		}
		if(!ParamValidator.isNullOrEmptyObject(sjzbyhglsearchrequest.getYhmsearch())){
			hql.append(" and yhm like '%"+sjzbyhglsearchrequest.getYhmsearch()+"%'");
		}
		int start=(sjzbyhglsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
		
	}

	@Override
	public void addSjzbScsjYhgl(SjzbScsjyhgl sjzbscsjyhgl) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(sjzbscsjyhgl);
	}

	@Override
	public SjzbScsjyhgl getSjzbYhgl(Integer id) {
		// TODO Auto-generated method stub
		String hql = " from SjzbScsjyhgl s where s.Yhid =?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (SjzbScsjyhgl) query.uniqueResult();
	}

	@Override
	public boolean updateSjzbYhgl(SjzbScsjyhgl sjzbscsjyhgl) {
		// TODO Auto-generated method stub
		String hql = "update SjzbScsjyhgl s set s.Yhm = ?,s.Mm = ?,s.Sj = ?,s.Yx = ?,s.dj = ?,s.Zcfs = ?,s.Jf = ?,s.yxspsl = ?,s.Pjsd = ?,s.Zlc = ?,s.Pjlc = ? where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, sjzbscsjyhgl.getYhm());
		query.setString(1, sjzbscsjyhgl.getMm());
		query.setString(2, sjzbscsjyhgl.getSj());
		query.setString(3, sjzbscsjyhgl.getYx());
		query.setInteger(4, sjzbscsjyhgl.getDj());
		query.setString(5, sjzbscsjyhgl.getZcfs());
		query.setInteger(6, sjzbscsjyhgl.getJf());
		query.setInteger(7, sjzbscsjyhgl.getYxspsl());
		query.setFloat(8, sjzbscsjyhgl.getPjsd());
		query.setFloat(9, sjzbscsjyhgl.getZlc());
		query.setFloat(10, sjzbscsjyhgl.getPjlc());
		query.setInteger(11, sjzbscsjyhgl.getYhid());
		return (query.executeUpdate() > 0);
	}

	@Override
	public boolean delSjzbYhgl(int id) {
		// TODO Auto-generated method stub
		String hql = "delete SjzbScsjyhgl s where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (query.executeUpdate() > 0);
	}

	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjzbScsjyhgl ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}
}
