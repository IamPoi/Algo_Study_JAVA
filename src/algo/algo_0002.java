package algo;

import java.util.Scanner;

public class algo_0002 {
	
	public static void main(String[] args) {
		
//		int a = 1071;
//		int b = 1029;
		
//		while (b != 0) {
//			int temp = b;
//			b = a % b;
//			a = temp;
//		}
//		
//		System.out.println(a+" "+b);
		
//		��Ŭ���� ȣ����
//		�ִ� ����� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a���� �Է����ּ��� : ");
		int a = sc.nextInt();
		System.out.print("b���� �Է����ּ��� : ");
		int b = sc.nextInt();
		
		int c = 0;
		
		if(a < b) {
			c = a;
			a = b;
			b = c;
		}
		
		while(b != 0) {
			int temp = b;
			System.out.println("temp : "+temp+", b = "+b);
			System.out.println("b : "+b+", a = "+a+", a % b = "+a%b);
			b = a % b;
			a = temp;
			System.out.println("a = "+a+", b = "+b+", temp = "+temp);
			
		}
		
		System.out.println(a+" "+b);
		
		
		
		
		
		
		
	}

}
