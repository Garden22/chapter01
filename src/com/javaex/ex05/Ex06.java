package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// A 배열 선언
		int [] arrA = new int[3];
		
		// 값 대입
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//B 배열선언
		int[] arrB = new int[arrA.length];
		
		//B 배열에 A 복사
		for (int i=0; i < arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//A 배열 값 변경(A의 값만 변경)
		arrA[1] = 100; 
		
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
