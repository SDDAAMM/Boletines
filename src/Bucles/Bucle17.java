package Bucles;
import java.util.Scanner;
	/*Planteamiento:
	 * 1. Pedrile un número de filas al usuario.
	 * 2. Imprimir asteriscos de manera que formen una pirámide donde 
	 * 	  la base será el número de filas que se ha introducido
	 */
public class Bucle17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numfilas,j,k;
		Scanner keyboard=new Scanner (System.in); 
		System.out.printf("Introduce el número de filas: ");
		numfilas= keyboard.nextInt();
		System.out.printf("\n");
		for (k=1;k<=numfilas;k++){
		  for (j=1;j<=numfilas-k;j++) {
		    System.out.printf(" ");
		  }
		  for(j=1;j<=2*k-1;j++) {
		    if (j%2==0) {
		      System.out.printf(" ");
		    }else
		      System.out.printf("*");
		    System.out.printf("\n");
		  }
		}
		keyboard.close();
	}
}