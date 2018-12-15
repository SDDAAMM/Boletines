package Bucles;
import java.util.Scanner;
public class Bucle1 {
      /* PLanteamiento:
       * 1.Ask the user a number between 1 and 10
       * 2.Do the operations with the number that the user gives
       * 3. Show the result
       */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard=new Scanner(System.in);
		int number;
		
		System.out.print("Set a number between 1 and 10:");
		number =keyboard.nextInt();
		keyboard.close();
		if (0<number && number<=10) {
		System.out.println("Multiplication table of " + number);
        for(int i = 1; i<=10; i++){
             System.out.println(number + " * " + i + " = " + number*i);
        }
	}else {System.out.println("Recharge the page and try to put a valid number");}

	}
}