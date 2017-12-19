package com.lq.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.lq.entity.SjxqYhgl;

@Component
public class UserDaoImpl extends BaseDaoImp<SjxqYhgl> implements UserDao {
	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	@Override
	public SjxqYhgl findByName(String name) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		String hql="from SjxqYhgl where Yhm = :Yhm";
		Query query=session.createQuery(hql);
		query.setParameter("Yhm", name);
		List<SjxqYhgl>list=query.list();
		if (list.size()==1) {
			return list.get(0);
		}
		return null;
	}

}
