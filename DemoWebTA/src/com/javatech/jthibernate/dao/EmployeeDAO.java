package com.javatech.jthibernate.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.javatech.jthibernate.entity.Employee;

@Component 
@Transactional
public class EmployeeDAO {
	
	@Autowired //tự động sinh ra
	private SessionFactory sessionFactory; //ssfactory là cái dc tự động sinh ra
	
//	Session session;
	
	
	public List<Employee> list()
	{
		String hql="FROM Employee";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	public List<Employee> list(int first, int max)
	{
		String hql="FROM Employee";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setFirstResult(first);
		query.setMaxResults(max);
		return query.list();
	}
	public Employee getById(int id)
	{
		return (Employee)sessionFactory.getCurrentSession().get(Employee.class, id);
	}
	public void add(Employee emp)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().saveOrUpdate(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	public void update(int id, String email, String name)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		Employee emp=getById(id);
		emp.setEmail(email);
		emp.setName(name);
		sessionFactory.getCurrentSession().update(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}
	public void delete(int id)
	{
//		sessionFactory.getCurrentSession().beginTransaction();
		Employee emp=getById(id);
		sessionFactory.getCurrentSession().delete(emp);
//		sessionFactory.getCurrentSession().getTransaction().commit();
	}

}
