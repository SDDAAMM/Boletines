package Bucles;
import java.util.Scanner;
public class Bucle9 {
	/*Planteamiento:
	 * 1. Pedirle al usuario la base de mi potencia
	 * 2. Pedirle el exponente.
	 * 3. Calcular la base elevado al exponente
	 * 4. Imprimir la solución.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int base=0, exponente=0, multiplicador=1;
		System.out.print("Introduzca la base: ");
		base=keyboard.nextInt();
		System.out.print("Introduzca el exponente: ");
		exponente=keyboard.nextInt();
		for (int i=1;i<=exponente;i++) {
			multiplicador=multiplicador*base;
		}
		System.out.println("Su resultado es: "+multiplicador);
		keyboard.close();
	}

}
