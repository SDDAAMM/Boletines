package Bucles;
import java.util.Scanner;
public class Bucle7 {
	/*Planteamiento:
	 * Pedirle un números al usuario.
	 * los que sean pares sumarlos.
	 * los que sean impares sumarlos.
	 * que introduzca 0 para terminar
	 * mostrarle la suma de los números pares e impares que ha hecho.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1, pares=0, impares=0;
		Scanner keyboard=new Scanner(System.in);
	    System.out.printf( "Introduzca un número entero (0=Fin): ");
	    numero1= keyboard.nextInt();
	    while ( numero1 != 0 ){
	        if ( numero1 % 2 == 0 ) {
	            pares += numero1;
	         }else {
	            impares += numero1;
	         }
	        System.out.printf( "Introduzca un número entero (0=Fin): ");
	        numero1= keyboard.nextInt();
	    }
	    System.out.print( "La suma de los pares es: "+pares );
	    System.out.print( "La suma de los impares es: "+impares);
	    keyboard.close();
	}

}
