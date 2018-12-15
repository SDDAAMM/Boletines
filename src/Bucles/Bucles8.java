package Bucles;
import java.util.Scanner;
public class Bucles8 {

		/*Planteamiento:
		 * 1. Pedir los 2 números a usar, el primero menor al segundo.
		 * 2. Mientras que el 2do número siga siendo mayor que el primero, multiplicar el primero x2 y dividir el segundo /2.
		 * 3. Imprimir en pantalla.
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=0;
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Introduzca 2 número, el primero menor al segundo: ");
		for (a=keyboard.nextInt(),b=keyboard.nextInt();a<b;a++,b--) {
			System.out.println(a+" < "+b);
			a=a*2-1;
			b=b/2+1;
		}
		System.out.println(a+" > "+b);
		keyboard.close();
	}

}
