package com.javaex.ex03;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer;
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자:");
		int num = sc.nextInt();
		
		if (num > 0) {
			
			if (num % 2 == 0) {
				answer = "짝수";
				
			} else {
				answer = "홀수";
				
			}
			
		} else if (num < 0) {
			answer = "음수";
			
		} else {
			answer = "0";
			
		}
		
		System.out.println(answer + "입니다.");
		
		sc.close();
		
	}

}
