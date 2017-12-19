package com.lq.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.lq.Request.gztxSearchRequest;
import com.lq.entity.SjjgYhgl;
import com.lq.entity.gztx;

import utils.ParamValidator;

@Repository
public class GztxDaoImpl implements GztxDao{

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;
	@Override
	public void addGztx(gztx GZTX) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(GZTX);
	}
	@Override
	public List<gztx> getAllgztx(gztxSearchRequest gztxsearchrequest) {
		 SimpleDateFormat formatter; 
		 formatter = new SimpleDateFormat ("yyyy-MM-dd"); 
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder().append("from gztx g").append(" where 1=1");
		if(!ParamValidator.isNullOrEmptyObject(gztxsearchrequest.getContextsearch())){
			hql.append(" and(g.bt LIKE '%"+gztxsearchrequest.getContextsearch()+"%' or g.nr LIKE '%"+gztxsearchrequest.getContextsearch()+"%')");
		}
		if(!ParamValidator.isNullOrEmptyObject(gztxsearchrequest.getIdsearch())){
			hql.append(" and g.txyhid="+gztxsearchrequest.getIdsearch());
		}
		if(!ParamValidator.isNullOrEmptyObject(gztxsearchrequest.getMonthsearch())){
			/*Date endDate=new Date(gztxsearchrequest.getMonthsearch().getTime() + 30 * 24 * 60 * 60 * 1000);
			hql.append(" and(g.ksrq>="+gztxsearchrequest.getMonthsearch()+" and g.ksrq<="+endDate+" or g.jsrq>="+gztxsearchrequest.getMonthsearch()+" and g.jsrq<="+endDate+")");*/
			String ctime = formatter.format(gztxsearchrequest.getMonthsearch());
			hql.append(" and(g.ksrq='"+ctime+"' or g.jsrq='"+ctime+"')");
		}
		if(!ParamValidator.isNullOrEmptyObject(gztxsearchrequest.getReleasesearch())){
			/*Date endDate=new Date(gztxsearchrequest.getReleasesearch().getTime() + 30 * 24 * 60 * 60 * 1000);
			hql.append(" and(g.fbsj>="+gztxsearchrequest.getReleasesearch()+" and g.fbsj<="+endDate+")");*/
			String ctime = formatter.format(gztxsearchrequest.getReleasesearch());
			hql.append(" and g.fbsj='"+ctime+"'");
		}
		int start=(gztxsearchrequest.getPage()-1)*10;
		Query query = sessionFactory.getCurrentSession().createQuery(hql.toString());
		query.setFirstResult(start);
		query.setMaxResults(10);
		System.out.println(query.list());
		return query.list();
	}
	@Override
	public gztx getGztx(int id) {
		// TODO Auto-generated method stub
		String hql = "from gztx g where g.id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (gztx) query.uniqueResult();
	}
	@Override
	public boolean updateGztx(gztx gZTX) {
		// TODO Auto-generated method stub
		String hql = "update gztx g set g.bt = ?,g.nr = ?,g.ksrq = ?,g.jsrq = ?,g.yxbz = ?,g.txyhlx = ?,g.txyhid = ?,g.fbrid = ?,g.fbsj = ? where g.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, gZTX.getBt());
		query.setString(1, gZTX.getNr());
		query.setDate(2, gZTX.getKsrq());
		query.setDate(3, gZTX.getJsrq());
		query.setString(4, gZTX.getYxbz());
		query.setString(5, gZTX.getTxyhlx());
		query.setInteger(6, gZTX.getTxyhid());
		query.setString(7, gZTX.getFbrid());
		query.setDate(8, new Date());
		query.setInteger(9, gZTX.getId());
		return (query.executeUpdate() > 0);
	}
	@Override
	public boolean delGztx(int id) {
		// TODO Auto-generated method stub
		String hql = "delete gztx g where g.id = ?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setInteger(0, id);

		return (query.executeUpdate() > 0);
	}
	@Override
	public int getTotalpage() {
		// TODO Auto-generated method stub
		String hql = "select count(*)  from gztx ";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 int count = ((Long) query.iterate().next()).intValue();
		 return count;
	}

}
