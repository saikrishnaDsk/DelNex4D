package com.hibtask.service;

import java.util.Date;
import java.util.List;

import com.hibtask.dao.UsersDao;
import com.hibtask.model.Users;

public class UserService {

	public static void main(String[] args) {

		Users users = new Users();
		//		users.setUserid(5);

		UsersDao dao = new UsersDao();
		//		dao.saveUsers(users);
		System.out.println(dao.getUsersById(2));
		List<Users> lis = dao.getAllUsers();
		
		for(Users u:lis) {
			System.out.println(u);
		}
	}

}