package com.myhib.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

import com.myhib.model.Employee;


public class EmployeeDao {
	public void saveEmployee(Employee emp)
	{

		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(emp);
		tx.commit();

		System.out.println("Employee saved");

	}
	public List<Employee> getEmployeebyAge()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("age", 20));

		List<Employee> results = cr.list();

		tx.commit();

		return results;
	}
	public List<Employee> getEmployeebyCity()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("city","B%"));

		List<Employee> results = cr.list();

		tx.commit();

		return results;
	}
	public List<Employee> getEmployeebyAgeCity()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		Criterion age = Restrictions.gt("age", 20);
		Criterion city = Restrictions.ilike("city","banglore");
		LogicalExpression andExp = Restrictions.and(age, city);
		cr.add(andExp);

		List<Employee> results = cr.list();

		tx.commit();

		return results;
	}
	public List<Employee> getEmployeebyAgeDep()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		Criterion age = Restrictions.gt("age", 20);
		Criterion city = Restrictions.ilike("dept","sales");
		LogicalExpression orExp = Restrictions.or(age, city);
		cr.add( orExp );
		List<Employee> results = cr.list();

		tx.commit();

		return results;
	}
	public List<Employee> getEmployeebyDep()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		Criterion dep1 = Restrictions.gt("dep", "sales");
		Criterion dep2 = Restrictions.ilike("dep","HR");
		LogicalExpression orExp = Restrictions.or(dep1, dep2);
		cr.add( orExp );

		List<Employee> results = cr.list();

		tx.commit();

		return results;
	}
}
