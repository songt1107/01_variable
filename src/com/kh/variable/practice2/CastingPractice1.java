package com.kh.variable.practice2;

import java.util.Scanner;

public class CastingPractice1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char result2 = sc.next().charAt(0);
		
		System.out.printf("%s unicord : %d", result2, (int)result2);
		
	}
	
}
