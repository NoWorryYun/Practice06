package com.javaex.ex01;

public class Customer extends Person{
	
	//필드
	private int cNo;
	private int point;

	
	//생성자
	public Customer() {}
	public Customer(int cNo, int point) {
		this.cNo = cNo;
		this.point = point;
	}
	public Customer(String name, String hp, int cNo, int point) {
		super(name, hp);
		this.cNo = cNo;
		this.point = point;
	}
	
	
	
	//GS
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getcNo() {
		return cNo;
	}
	public int getPoint() {
		return point;
	}
	
	
	
	//일반
	public void showInfo() {
		System.out.println("#이름:"+super.getName()+", #핸드폰:"+super.getHp()+", #고객번호:"+cNo+", #포인트점수:"+point);
	}
	
	
	
}
