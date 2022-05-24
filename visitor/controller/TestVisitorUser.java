package com.ty.visitor.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ty.visitor.dao.VisitorDao;
import com.ty.visitor.dto.Visitor;

public class TestVisitorUser {

	public static void main(String[] args) {
		VisitorDao dao = new VisitorDao();
		Visitor visitor = new Visitor();
		List<Visitor> l = new ArrayList<>();
		
		visitor.setAge(26);
		visitor.setDob("1996-06-29");
		visitor.setEmail("prash@gmail.com");
		visitor.setGender("m");
		visitor.setId(2);
		visitor.setName("nuthan");
		visitor.setPhone("123456789");//LocalDate.now()
		visitor.setVisitdatetime("2022-03-14");//LocalDateTime.now()
		dao.saveVisitor(visitor);
		
//		Visitor v = dao.getVisitorById(3);
//		System.out.println(v);
//		
//		l= dao.getVisitorByDate("2022-03-14");
//		System.out.println(l);
		
//		l = dao.getVisitorByAgeRange(20, 25);
//		System.out.println(l);
	}
}

