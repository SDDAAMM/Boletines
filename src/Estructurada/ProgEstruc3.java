package Estructurada;
import java.util.Scanner;
public class ProgEstruc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner keyboard=new Scanner (System.in);
      int number1 , number2 , number3 ;
      System.out.print("Put your first number Doctor:");
      number1=keyboard.nextInt();
      System.out.print("Put here now the second number :");
      number2=keyboard.nextInt();
      System.out.print("Here now Doctor, the 3rd one:");
      number3=keyboard.nextInt();
      keyboard.close();
      if(number1==number2 && number2==number3)
  	  System.out.println("The numbers are the same, easy Doctor");
  	  else if(number1!=number2 && number2==number3)
  	  System.out.println("2 numbers are the same Doctor, nice try");
  	  else if(number1==number2 && number2!=number3)
  	  System.out.println("2 numbers are the samu you Doctor, nice try");
  	  else if(number1!=number2 && number1==number3)
  	  System.out.println("2 numbers are the samu you Doctor, nice try");
  	  else if(number1!=number2 && number2!=number3)
  	  System.out.println("No same numbers, shame Doctor");
  }
}
