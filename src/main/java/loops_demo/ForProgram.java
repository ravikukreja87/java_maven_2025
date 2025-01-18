package loops_demo;

public class ForProgram {
	
	/*
	 * Start at 30
	 * Keep on decreasing by 10
	 * and print untill -20
	 * 
	 * 
	*/
	public static void main(String[] args) {
		
		
		int start = 30;
		int end = -20;
		int step = 10;
		
		for(int i = start ; i >= end ; i = i - step) {
			System.out.println("Number : " + i);
		}
		
		
	}

}
