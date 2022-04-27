package com.javaex.ex01;

public class Person{
	
	//필드
	private String name;
	private String hp;
	
	
	
	//생성자
	public Person() {}
	public Person(String name, String hp) {
		this.name = name;
		this.hp = hp;
	}

	
	//GS
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	
	
	//일반
	public void showInfo() {
		System.out.println("#이름:"+name+", #핸드폰:"+hp);
	}
	
	
}
