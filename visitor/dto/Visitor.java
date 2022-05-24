package com.ty.visitor.dto;

public class Visitor {
	
	private int id, age;
	private String name, email, dob, visitdatetime, phone, gender;

	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		System.out.println("ID: " + id);
		System.out.println("Age: " + age);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Visit Date Time: " + visitdatetime);
		System.out.println("Phone: " + phone);
		System.out.println("Gender: " + gender);
		return "";
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getVisitdatetime() {
		return visitdatetime;
	}

	public void setVisitdatetime(String visitdatetime) {
		this.visitdatetime = visitdatetime;
	}
}
