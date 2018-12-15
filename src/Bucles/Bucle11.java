package Bucles;
import java.util.Scanner;
public class Bucle11 {
	/*Planteamiento:
	 * 1. Pedimos al usuario un número
	 * 2. Encontramos el número que exceda el número introducido sumando todos los anteriores.
	 * 3. Mostramos por pantalla el número.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int suma=1,resultado=1,numero=0, i;
		System.out.print("Introduzca un número: ");
		numero = keyboard.nextInt();
		keyboard.close();
		for (i=1;resultado<numero;i++) {
			resultado=i+i;
		}
		i--;
		System.out.println("El número es: "+i);
		
	}

}
