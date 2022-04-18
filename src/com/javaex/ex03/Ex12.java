package com.javaex.ex03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		String days = "";
		
		switch(month) {
			case 1:
				days = "31";
				break;
			case 2:
				days = "28";
				break;
			case 3:
				days = "31";
				break;		
			case 4:
				days = "30";
				break;			
			case 5:
				days = "31";
				break;
			case 6:
				days = "30";
				break;
			case 7:
				days = "31";
				break;
			case 8:
				days = "31";
				break;	
			case 9:
				days = "30";
				break;
			case 10:
				days = "31";
				break;
			case 11:
				days = "30";
				break;
			case 12:
				days = "31";
				break;	
				
		}
		
		System.out.println(days + "일 입니다.");
		
		sc.close();
	
	}

}
