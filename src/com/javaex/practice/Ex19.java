package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] agrgs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇년?: ");
		int y = sc.nextInt();
		long sec = y*365*24*60*60L;
		long lkm = 300000*sec;
		
		
		
		System.out.print("빛이 "+y+"년 동안 가는 거리는 "+lkm+" km 입니다.");
		
		
		sc.close();
		
	}

}
