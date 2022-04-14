package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("화씨: ");
		double f = sc.nextDouble();
		
		double c = (5.0/9.0)*(f-32.0);
		
		System.out.println("화씨 "+f+" 의 섭씨온도는"+c+" 입니다.");
		
		
		
		
		sc.close();
		
		
	}

}
