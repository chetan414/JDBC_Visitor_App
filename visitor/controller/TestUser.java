package com.ty.visitor.controller;

import com.ty.visitor.dao.UserDao;
import com.ty.visitor.dto.User;

public class TestUser {
	public static void main(String[] args) {
		User user = new User();
//		user.setId(1);
//		user.setName("chetan");
//		user.setEmail("chetu554@gmail.com");
//		user.setPassword("chetan554");
//		user.setPhone(953545955);
//		user.setRole("developer");
		UserDao dao = new UserDao();
//		
//		int user1 = dao.saveUser(user);
//		System.out.println(user1);
		User user1=dao.validateUser("chetu554@gmail.com", "chetan554");
		System.out.println(user1);
	}
}

