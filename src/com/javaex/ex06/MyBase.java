package com.javaex.ex06;

public class MyBase extends Base{

	//필드
	
	
	
	//생성자
	
	
	
	//GS
	
	
	
	
	//일반
	public void service(String day) {
		if(day.equals("낮")) {
			System.out.println("낮에는 열심히 수업듣자");
		} else if(day.equals("오후")){
			System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
		} else {
			System.out.println("밤에는 숙면");
		}
	}
	
}
