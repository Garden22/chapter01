package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		int num;
		for (int i = 1; i <= 6; i++) {
			num = (int)(Math.random()*45)+1;
			System.out.print(num + " ");
		}
	}
}
