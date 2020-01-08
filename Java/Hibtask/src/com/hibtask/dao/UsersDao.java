package com.hibtask.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibtask.model.Users;


public class UsersDao {

	public void saveUsers(Users users) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(users);
		tx.commit();

		System.out.println("User saved");
	}


	public Users getUser(int userid)
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Users users =session.get(Users.class, userid);
		tx.commit();


		return users;
	}

	// hql
	public Users getUsersById(int Userid)
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();

		Query query= session.createQuery("from Users u  where u.Userid=:idk");
		query.setParameter("idk", Userid);
		Users users=(Users)query.getSingleResult();

		tx.commit();


		return users;
	}

	public List<Users> getAllUsers()
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();

		Query query= session.createQuery("from Users u");
		List<Users> users= query.list();

		tx.commit();


		return users;
	}


}