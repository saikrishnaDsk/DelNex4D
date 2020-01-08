package com.myhib.service;


import java.util.Date;
import com.myhib.model.Address;
import com.myhib.dao.AuthorDao;
import com.myhib.model.Author;


public class AuthorService {

	public static void main(String[] args) {
		//session factory, annotations, 


		Author author=new Author(1,"some name",10,new Date(),new Address("Mg ROAD", "KARNATAKA","BANGALORE"),new Address("Gachibowli", "Telangana","Hyderabad"));


		AuthorDao dao=new AuthorDao();
		dao.saveAuthor(author);
		

	}

}