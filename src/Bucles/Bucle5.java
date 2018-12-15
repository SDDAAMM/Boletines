package Bucles;
import java.util.Scanner;
import java.util.Random;
public class Bucle5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Ask the user 2 numbers
		 *2.Set 15 random numbers between the rank of the 2 numbers
		 *the user gives.
		 *3.Print the results 
		 */
		Random rank=new Random();
		Scanner keyboard=new Scanner(System.in);
        int i ,num1, num2,  wide=rank.nextInt();
        System.out.println("Set number 1: ");
        num1 =keyboard.nextInt();//First number asked to the user
        System.out.println("Set number 2: ");
        num2 =keyboard.nextInt();//Second number asked to the user
        keyboard.close();//Closing the keyboard, no more useful
        System.out.println("your wide number");
        for (i=1; i<=15;i++) { //Loop for generate a random number and print it
        	wide=rank.nextInt((num1)+num2);
        	System.out.println(wide);
        }
	}

}
