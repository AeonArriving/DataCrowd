package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjxqyhglSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.SjxqYhgl;

import utils.ParamValidator;

@Repository
public class SjxqYhglDaoImpl implements SjxqYhglDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public List<SjxqYhgl> getAllSjxqYh(sjxqyhglSearchRequest sjxqyhglsearchrequest) {
		// TODO Auto-generated method stub
		
		StringBuilder hql = new StringBuilder().append("from SjxqYhgl s").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(sjxqyhglsearchrequest.getYhidsearch())){
			hql.append(" and s.Yhid = "+sjxqyhglsearchrequest.getYhidsearch());
		}
		if(!ParamValidator.isNullOrEmptyObject(sjxqyhglsearchrequest.getYhmsearch())){
			hql.append(" and s.Yhm like '%"+sjxqyhglsearchrequest.getYhmsearch()+"%'");
		}
		int start=(sjxqyhglsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
	}
	@Override
	public void addSjxqYhgl(SjxqYhgl sjxqyhgl1) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(sjxqyhgl1);
	}
	@Override
	public SjxqYhgl getSjxqYhgl(int id) {
		// TODO Auto-generated method stub
		String hql = "from SjxqYhgl s where s.Yhid=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (SjxqYhgl) query.uniqueResult();
	}
	@Override
	public boolean updateSjxqYhgl(SjxqYhgl sjxqyhgl) {
		// TODO Auto-generated method stub
		String hql = "update SjxqYhgl s set s.Yhm = ?,s.Mm = ?,s.sj = ?,s.gs = ?,s.Dz = ?,s.Lxdh = ?,s.Yx=?,s.Yhms = ?,s.Qx = ?,s.Zt = ?,s.Bz = ? where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, sjxqyhgl.getYhm());
		query.setString(1, sjxqyhgl.getMm());
		query.setString(2, sjxqyhgl.getSj());
		query.setString(3, sjxqyhgl.getGs());
		query.setString(4, sjxqyhgl.getDz());
		query.setString(5, sjxqyhgl.getLxdh());
		query.setString(6, sjxqyhgl.getYx());
		query.setString(7, sjxqyhgl.getYhms());
		query.setString(8, sjxqyhgl.getQx());
		query.setString(9, sjxqyhgl.getZt());
		query.setString(10, sjxqyhgl.getBz());
		query.setInteger(11, sjxqyhgl.getYhid());
		return (query.executeUpdate() > 0);
	}
	@Override
	public boolean delSjxqYhgl(int id) {
		// TODO Auto-generated method stub
		String hql = "delete SjxqYhgl s where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (query.executeUpdate() > 0);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjxqYhgl ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}

}
