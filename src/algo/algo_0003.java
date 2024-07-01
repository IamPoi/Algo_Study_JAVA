package algo;

import java.util.Scanner;

public class algo_0003 {

	//최대공약수
	public int gcd(int a,int b){

		int c = 0;

		if(a < b) {
			c = a;
			a = b;
			b = c;
		}

		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;

		}

		return a;

	}
	//최소공배수
	public int lcm(int a,int b){

		return (a*b)/gcd(a,b);
	}

	public static void main(String[] args) {
		
		algo_0003 al = new algo_0003();
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(al.gcd(a, b));
		System.out.println(al.lcm(a, b));
		

	}

}
