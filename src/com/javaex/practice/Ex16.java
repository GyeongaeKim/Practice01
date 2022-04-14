package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("상품가격: ");
		double product = sc.nextDouble();
		System.out.print("받은돈: ");
		double  getmoney = sc.nextDouble();
		
		double addtax = product*0.1;
		double left = getmoney-product;
		
		System.out.println("==========================");
		System.out.println("받은돈: "+getmoney);
		System.out.println("상품가격: "+product);
		System.out.println("부가세: "+addtax);
		System.out.println("잔액: "+left);
		
		
		
		
		sc.close();
	
	
	}

}
