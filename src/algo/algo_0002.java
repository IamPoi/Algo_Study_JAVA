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
		
//		유클리드 호제법
//		최대 공약수 구하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값을 입력해주세요 : ");
		int a = sc.nextInt();
		System.out.print("b값을 입력해주세요 : ");
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
