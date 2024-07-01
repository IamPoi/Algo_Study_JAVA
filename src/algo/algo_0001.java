package algo;

import java.util.Arrays;

public class algo_0001 {
	
	public String solution(String[] par, String[] comple) {
		
		String answer = "";
		
//		Á¤·Ä
		Arrays.sort(par);
		Arrays.sort(comple);
		
		for(int i = 0; i < comple.length; i++ ) {
			
			if(!par[i].equals(comple[i])) {
				System.out.println("hi");
				answer = par[i];
				break;
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		
		String[] par = {"leo","kiki","eden"};
		String[] comple = {"eden","kiki"};
		
		algo_0001 algo = new algo_0001();
		
		System.out.println(algo.solution(par, comple));
		
		
		
	}

}
