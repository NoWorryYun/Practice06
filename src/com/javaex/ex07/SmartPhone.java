package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
	//필드
	
	
	
	
	//생성자
	
	
	
	
	//일반 메소드
    public void execute(String str){
        
    	if("앱".equals(str)) {
    		playApp();
    	} else {
    		super.execute(str);
    	}
        //코드작성
        
    }
 
    //메소드작성
    protected void playApp() {
    	System.out.println("앱실행");
    }
    //메소드작성
    
    
    
}
