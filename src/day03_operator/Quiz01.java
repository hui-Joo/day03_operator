package day03_operator;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// ���� �Է¹޾� ¦, Ȧ���� �����Ͽ� ����Ͻÿ�
		// ���� �Է¹޾� 3�� ����̸� ����Ͻÿ�
		// �� ���� �Է� �޾� ū ���� ����Ͻÿ�
		// �� �Է� : 10
		// 10 = ¦��
		// 10 = 3�� ����� �ƴϴ�
		// �� �� �Է�: 10 20
		// num1 : 10, num2 : 20
		// num2 �� num1���� ũ��
		
		int num1 = 10, num2 = 20;
		
		int su;
		
		System.out.println("���� �Է��ϼ���");
		su = input.nextInt();
		
		String s = (su%2 == 0)? "¦��" : "Ȧ��";
		System.out.println(s);
		
		
		
		System.out.println("�ٽ� ���� �Է��ϼ���");
		su = input.nextInt();
		
		String s1 = (su % 3 ==0)? "3�� ����̴�" : "3�� ����� �ƴϴ�";
		System.out.println(s1);
		
		System.out.println("�� �� ���ڸ� �Է��ϼ���");
		num1 = input.nextInt();
		num2 = input.nextInt();
		
		s = (num1 > num2)? "num1�� num2���� ũ��":
							"num2�� num1���� ũ��";
		System.out.println("num1 : " + num1 + ", num2 :" + num2);
		System.out.println(s);
		//su = (num1 < num2)? "num2�� num1���� ũ��";
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}


}
