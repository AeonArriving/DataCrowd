package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjjgyhglSearchRequest;
import com.lq.entity.SjjgYhgl;

import utils.ParamValidator;

@Repository
public class SjjgYhglDaoImpl implements SjjgYhglDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public List<SjjgYhgl> getAllSjjgYh(sjjgyhglSearchRequest sjjgyhglsearchrequest) {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder().append("from SjjgYhgl s").append(" where 1=1");
				if(!ParamValidator.isNullOrEmptyObject(sjjgyhglsearchrequest.getYhidsearch())){
					hql.append(" and s.Yhid = "+sjjgyhglsearchrequest.getYhidsearch());
				}
				if(!ParamValidator.isNullOrEmptyObject(sjjgyhglsearchrequest.getYhmsearch())){
					hql.append(" and s.Yhm like '%"+sjjgyhglsearchrequest.getYhmsearch()+"%'");
				}
				int start=(sjjgyhglsearchrequest.getPage()-1)*10;
				Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
				query.setFirstResult(start);
				query.setMaxResults(10);
				System.out.println(query.list());
				return query.list();
	}
	@Override
	public void addSjjgYhgl(SjjgYhgl sjjgyhgl) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(sjjgyhgl);
	}
	@Override
	public SjjgYhgl getSjjgYhgl(int id) {
		// TODO Auto-generated method stub
		String hql = "from SjjgYhgl u where u.Yhid=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (SjjgYhgl) query.uniqueResult();
	}
	@Override
	public boolean updateSjjgYhgl(SjjgYhgl sjjgyhgl) {
		// TODO Auto-generated method stub
		String hql = "update SjjgYhgl s set s.Yhm = ?,s.Mm = ?,s.sj = ?,s.Yx = ?,s.dj = ?,s.gs = ?,s.Dz = ?,s.Lxdh = ?,s.Yhms = ?,s.Qx = ?,s.Zt = ?,s.Bz = ? where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, sjjgyhgl.getYhm());
		query.setString(1, sjjgyhgl.getMm());
		query.setString(2, sjjgyhgl.getSj());
		query.setString(3, sjjgyhgl.getYx());
		query.setInteger(4, sjjgyhgl.getDj());
		query.setString(5, sjjgyhgl.getGs());
		query.setString(6, sjjgyhgl.getDz());
		query.setString(7, sjjgyhgl.getLxdh());
		query.setString(8, sjjgyhgl.getYhms());
		query.setString(9, sjjgyhgl.getQx());
		query.setString(10, sjjgyhgl.getZt());
		query.setString(11, sjjgyhgl.getBz());
		query.setInteger(12, sjjgyhgl.getYhid());
		return (query.executeUpdate() > 0);
	}
	@Override
	public boolean delSjjgYhgl(int id) {
		// TODO Auto-generated method stub
		String hql = "delete SjjgYhgl s where s.Yhid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (query.executeUpdate() > 0);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjjgYhgl ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}

}
