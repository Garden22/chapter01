package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {

		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		if(leftArray.length == rightArray.length) {
			//같으면 세부검사
			System.out.println("세부검사");
			
			for (int i = 0; i < leftArray.length; i++) {
				if (leftArray[i] != rightArray[i]) {
					// 다르면
					System.out.println(i + " 번째 값이 다릅니다.");
				}
			}
			
		} else {
			//다르니까 끝냄
			System.out.println("두 배열의 크기가 다릅니다.");
		}
	}
}
