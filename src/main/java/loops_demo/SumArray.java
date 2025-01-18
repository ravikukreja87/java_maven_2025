package loops_demo;

public class SumArray {

	public static void main(String[] args) {

		int[] score = { 2, 9, 1, 2, 3, 4, 7, 8, 2, 33, 11, 44, 5, 66 };

		int i = 0;
		int total = 0;
		// score.length will identify how many elements are there in array score
		while (i < score.length) {
			total = total + score[i];
			i++;
		}
		System.out.println("Total : " + total);
	}

}
