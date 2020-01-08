package com.myhib.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.myhib.model.Author;


public class AuthorDao {

	public void saveAuthor(Author author)
	{

		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		session.save(author);
		tx.commit();

		System.out.println("author saved");

	}



	public Author getAuthor(int authorId)
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();
		Author author=session.get(Author.class, authorId);
		tx.commit();

		System.out.println("author saved");

		return author;
	}

	// hql
	public Author getAuthorByName(String authorName)
	{
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
		Session session= factory.openSession();
		Transaction tx= session.beginTransaction();

		Query query= session.createQuery("from Author a  where a.name=:idk");
		query.setParameter("idk", authorName);
		Author author=(Author)query.getSingleResult();

		tx.commit();

		System.out.println("author saved");

		return author;
	}



}