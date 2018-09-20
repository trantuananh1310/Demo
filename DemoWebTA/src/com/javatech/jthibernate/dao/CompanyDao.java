package com.javatech.jthibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javatech.jthibernate.entity.Company;

@Component 
@Transactional
public class CompanyDao {
	
	@Autowired //tự động sinh ra
	private SessionFactory sessionFactory; //ssfactory là cái dc tự động sinh ra
	
//	Session session;
	
	
	public List<Company> list()
	{
		String hql="FROM Company";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Company> list(int first, int max)
	{
		String hql="FROM Company";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Company getById(int id)
	{
		return (Company)sessionFactory.getCurrentSession().get(Company.class, id);
	}
	public void add(Company emp)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	public void update(int id, String email, String name)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		Company emp=getById(id);
		sessionFactory.getCurrentSession().update(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	public void delete(int id)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		Company emp=getById(id);
		sessionFactory.getCurrentSession().delete(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}

}
