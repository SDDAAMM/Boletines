package Excepciones;
import static Excepciones.Ejercicio1YFunciones.*;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, c;
		double b;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("1. Operar sin decimales\n2. Operar con decimales:");
		a=keyboard.nextInt();
		
		if(a==1) {
			c= operacion(0,0,"a");
		}else if(a==2) {
			b=operacion(0.0,0.0,"a");
		}else {
			System.out.println("Vuelva a intentarlo");
		}
		keyboard.close();
	}

}
