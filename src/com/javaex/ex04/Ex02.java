package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int dan;
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		dan = sc.nextInt();
		
		while (i <= 9) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
			i++;
				
		}

		sc.close();
		
	}

}
