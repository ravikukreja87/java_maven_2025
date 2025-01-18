package exceptions;

public class ArrayExceptions {

	public static void main(String[] args) {

		int[] score = { 10, 20, 30, 40 };

		try {

			for (int i = 0; i < 5; i++) {
				System.out.println(score[i]);
				// score[4] --> ?
				// score[0]=10
				// score[1]=20
				// score[2]=30
				// score[3]=40
			}
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Trying to access element which does not exists in array");
		} catch (Exception e) {
			System.out.println("General Exception");
			System.out.println(e.getMessage());
		} finally {
			//This is executed after try/catch block everytime irrespective of whether there is exception or not
			System.out.println("Finally Block");
			//Clean up of try/catch block
		}
		System.out.println("Outside Try Catch");
	}
}