package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// A 배열 선언
		int [] arrA = new int[3];
		
		// 값 대입
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//B 배열선언
		int[] arrB;
		
		//A주소 B에 대입
		arrB = arrA;
		
		//B값을 변경해본다
		arrB[1] = 100;
		
		//배열A 출력
		System.out.println("arrA[]");
		for(int i = 0; i < arrA.length; i++) {
			System.out.println("i= " + arrA[i]);
		}
		
		//배열B 출력
		System.out.println("arrB[]");
		for(int i = 0; i < arrB.length; i++) {
			System.out.println("i= " + arrB[i]);
		}
		
	}

}
