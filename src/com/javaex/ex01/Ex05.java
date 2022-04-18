package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//일반적인 방식 >> 통상적으로 변수는 소문자로
		double pi = 3.14;
		double result01 = pi * 5 * 5;
		System.out.println(result01);
		
		//pi값 변경되는 경우
		pi = 3.1415926;
		double result02 = pi * 5 * 5;
		System.out.println(result02);
		
		// 앞에 final 붙이면 더이상 변경이 안됨 >> 통상적으로 상수는 대문자로
		final double PI = 3.14;
		double result03 = PI * 5 * 5;
		System.out.println(result03);
		
		//*상수의 값을 변경하려고 할 때 >> 오류남
		// PI = 3.1415926;
	}

}
