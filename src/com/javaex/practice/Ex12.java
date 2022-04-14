package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요: ");
		double radius = sc.nextInt();
		final double PI = 3.14; //파이값은 3.14로 상수로 지정할 경우!
		double circle = radius*radius*PI;
		
		System.out.println("원의 넓이는 "+circle);
		
		
		sc.close();
		
		
	}

}
