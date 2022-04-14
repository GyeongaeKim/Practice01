package com.javaex.practice;

public class Ex09 {
	
	public static void main(String[] args) {
		
		
		double f=80.0;
		
		//결과값이 0이 나오는 이유는?
		System.out.println(5/9*(f-32.0));
		// 5/9*(80.0-32.0) -> 5/9*48.0
		// 5/9는 0 이 나옴
		// 0*48.0 은 0이다.
		
		
		System.out.println(5.0/9.0*(f-32.0));
		//모두 실수값으로 변경해주면??!!!
		
	}

}
