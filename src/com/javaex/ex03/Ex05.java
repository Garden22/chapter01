package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		int pay;
		
		if (time <= 8) {
			pay = time * 10000;
			
		} else {
			pay = (int) ((time - 8) * 10000 * 1.5 + 8 * 10000);
			
		}
		
		System.out.println("임금은 " + pay + "원 입니다.");
		
		sc.close();
		
	}

}

