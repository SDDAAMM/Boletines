package Bucles;
import java.util.Scanner;
public class Bucle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Ask the user 2 positive number 
		 * 2. Print the multiplication between both of them using sums
		 */

		int num1, num2, product = 0, i = 1;

		Scanner keyboard = new Scanner(System.in);

		do {
			System.out.println("Introduce 2 positives numbers:  ");
			num1 = keyboard.nextInt();
			num2 = keyboard.nextInt();
		} while (num1 < 0 || num2 < 0);
		
		keyboard.close();
		
		while (i <= num2) {
			product += num1;
			System.out.println(product);
			i++;
		}
		
		
		
	}


}


