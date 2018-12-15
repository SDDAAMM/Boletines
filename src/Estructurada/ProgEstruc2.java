package Estructurada;
import java.util.Scanner;
public class ProgEstruc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ejercicio 2
	     Scanner keyboard=new Scanner (System.in);
	     int number1 , number2 ;
	     System.out.print("Set the 1st number:");
	     number1=keyboard.nextInt();
	     System.out.print("Now set the 2nd one:");
	     number2=keyboard.nextInt();
	     keyboard.close();
	     System.out.println("↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕↕");
	     if(number1%number2==0){
	         System.out.println("Son múltiplos ♥");
	     }   
	     else{
	         System.out.println("No son múltiplos :Þ");
	 
	     }

	}

}
