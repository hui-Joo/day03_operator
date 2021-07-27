package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 수를 입력받아 짝, 홀수를 구분하여 출력하시오
		// 수를 입력받아 3의 배수이면 출력하시오
		// 두 수를 입력 받아 큰 수를 출력하시오
		// 수 입력 : 10
		// 10 = 짝수
		// 10 = 3의 배수가 아니다
		// 두 수 입력: 10 20
		// num1 : 10, num2 : 20
		// num2 가 num1보다 크다
		
		int num1 = 10, num2 = 20;
		
		int su;
		
		System.out.println("수를 입력하세요");
		su = input.nextInt();
		
		String s = (su%2 == 0)? "짝수" : "홀수";
		System.out.println(s);
		
		
		
		System.out.println("다시 수를 입력하세요");
		su = input.nextInt();
		
		String s1 = (su % 3 ==0)? "3의 배수이다" : "3의 배수가 아니다";
		System.out.println(s1);
		
		System.out.println("두 수 숫자를 입력하세요");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		s = (num1 > num2)? "num1이 num2보다 크다":
							"num2가 num1보다 크다";
		System.out.println("num1 : " + num1 + ", num2 :" + num2);
		System.out.println(s);
		//su = (num1 < num2)? "num2가 num1보다 크다";
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}


}
