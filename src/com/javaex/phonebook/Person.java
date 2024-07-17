package com.javaex.phonebook;

public class Person {
	
	public static int countUser = 1;

	private String name;
	private String hp;
	private String company;
	
	
	public Person() {
	}
	public Person(String name, String hp, String company) {
		super();
		this.name = name;
		this.hp = hp;
		this.company = company;
		this.countUser++;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public static int getCountUser() {
		return countUser;
	}
	/*
	public static void setCountUser(int countUser) {
		Person.countUser = countUser;
	}
	*/
	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", hp=" + hp + ", company=" + company + "]";
	}
	public void showInfo() {
		System.out.println(".  이름: " + name + " 전화: " + hp + " 회사: " + company);
		
	}
	
	
}
