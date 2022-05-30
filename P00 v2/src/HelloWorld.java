/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Quah Ming Yao
 * Student ID: 21023135
 * Class: W64N
 * Date/Time created: Monday 30-05-2022 09:35
 */

/**
 * @author MY_NB
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	public static int findMax(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if ( max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
