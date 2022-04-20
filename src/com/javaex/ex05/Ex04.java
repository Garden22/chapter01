package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {

		//기본 배열 선언 방식
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		//바로 값 넣기
		int[] intArray2 = new int[] {3, 6, 9};
		
		for (int i = 0; i < intArray2.length; i++) {
			System.out.println(intArray2[i]);
		}
		
		
		//더 줄여버리기
		int [] intArray3 = {3, 6, 9};
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray3[i]);
		}
		
		//다른 type 넣는 배열
		double[] dArray = new double[3];
		dArray[0] = 1;
		dArray[1] = 3.3;
		dArray[2] = 7.7;
		
		for (int i = 0; i < dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		
		char[] cArray = {'a', 'b', 'c'};
		
		for (int i = 0; i < cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
		boolean[] bArray = new boolean[4];
		bArray[0] = true;
		bArray[1] = false;
		bArray[2] = 3 > 5;
		
		for (int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i]);
		}
	
	}

}
