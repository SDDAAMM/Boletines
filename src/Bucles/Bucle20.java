package Bucles;
import java.util.Scanner;
public class Bucle20 {
	/*Planteamiento:
	 * 1. Pedir al user el numero de filas
	 * 2. Pintar ese numero de filas
	 * 3. Que pintar en cada fila:
	 * 3.1. Pintar espacios:Desde el numero de filas menos la fila en la que estoy
	 * 3.2. Pintar numeros: 
	 *  3.2.1. Pintar la primera 1/2 hacia la izquierda
	 *  3.2.2. Pintar la segunda 1/2 hacia la derecha
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numFilas, i, fila;
		//Pedir el numero de filas
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Set the number of files:");
		numFilas=keyboard.nextInt();
		keyboard.close();
		//2. Pintar ese numero de filas
		for (fila=1; fila<=numFilas;fila++) { //3. Que pintar en cada linea
			for (int numEspacio=1;numEspacio<=numFilas-fila;numEspacio++) {
				System.out.print(' ');
			}
			//3.2 Pintar desde el 1 hasta el numero de linas
	    for (i=1;i<=fila;i++) { //Pintar primera mitad a la izquierda
	    	System.out.print(i);
	    }
	    for (i=fila-1;i>=1;i--) {//Pintar segunda mitad a la derecha
	    	System.out.print(i);
	    }
	    System.out.println();//Salto de linea para indicar que la linea ha terminado
		}
	}

}
