package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.sjzbspglSearchRequest;
import com.lq.entity.SjzbJfgl;
import com.lq.entity.SjzbSpgl;

import utils.ParamValidator;
@Repository
public class SjzbSpglDaoImpl implements SjzbSpglDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public List<SjzbSpgl> getAllSjzbSp(sjzbspglSearchRequest sjzbspglsearchrequest) {
		// TODO Auto-generated method stub
		
		StringBuilder hql=new StringBuilder().append("from SjzbSpgl s").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(sjzbspglsearchrequest.getSpmsearch())){
			hql.append(" and s.spm like "+"'%"+sjzbspglsearchrequest.getSpmsearch()+"%'");
		}
		int start=(sjzbspglsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
	}
	@Override
	public void addSjzbSpgl(SjzbSpgl sjzbspgl1) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(sjzbspgl1);
	}
	@Override
	public SjzbSpgl getSjzbSpgl(int spid) {
		// TODO Auto-generated method stub
		String hql = "from SjzbSpgl s where s.spid=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, spid);

		return (SjzbSpgl) query.uniqueResult();
	}
	@Override
	public boolean updateSjzbSpgl(SjzbSpgl sjzbspgl) {
		// TODO Auto-generated method stub
		String hql = "update SjzbSpgl s set s.spm = ?,s.sptx = ?,s.dhjf = ?,s.sjsj = ?,s.xjsj = ?,s.sfyx = ?,s.qszl = ?,s.cl = ?,s.bz = ? where s.spid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0,sjzbspgl.getSpm());
		if(sjzbspgl.getSptx()!="")
			query.setString(1, sjzbspgl.getSptx());
		query.setInteger(2, sjzbspgl.getDhjf());
		query.setDate(3,sjzbspgl.getSjsj());
		query.setDate(4, sjzbspgl.getXjsj());
		query.setString(5, sjzbspgl.getSfyx());
		query.setInteger(6,sjzbspgl.getQszl());
		query.setInteger(7, sjzbspgl.getCl());
		query.setString(8, sjzbspgl.getBz());
		query.setInteger(9, sjzbspgl.getSpid());
		return (query.executeUpdate() > 0);
	}
	@Override
	public boolean delSjzbYhgl(int spid) {
		// TODO Auto-generated method stub
		String hql = "delete SjzbSpgl s where s.spid = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, spid);

		return (query.executeUpdate() > 0);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from SjzbSpgl ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}

}
