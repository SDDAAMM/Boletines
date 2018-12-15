package Bucles;
import java.util.Scanner;
public class Bucle10 {
	/*Panteamiento:
	 * 1. Pedir el número k sera el último del factorial.
	 * 2. Multiplicarlo por todos los numeros anteriores a el.
	 * 3. Mostrar el resultado en pantalla. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int numero=0, factorial;
		System.out.print("Introduzca un número: ");
		numero=keyboard.nextInt();
		factorial=numero;
		for (int b=1;b<factorial;b++) {
			numero=numero*b;
		}
		System.out.println("El factorial es= "+numero );
		keyboard.close();
	}
}
