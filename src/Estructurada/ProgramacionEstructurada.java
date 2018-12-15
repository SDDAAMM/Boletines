package Estructurada;
import java.util.Scanner; 
public class ProgramacionEstructurada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in) ;
		int number ;
		System.out.print("Introduce un número : ");
		number=keyboard.nextInt();
		keyboard.close();
		if(number>0) {
		 System.out.println("El número es positivo");
		}
        else {
    	   if (number==0) {  
    		   System.out.println("El número es cero");
     }
    	   else { if (number<0) {
    		   System.out.println("El número es negativo");
    	   }

	}
        }
}
}