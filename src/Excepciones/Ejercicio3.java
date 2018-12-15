package Excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio3 {
	/*Planteamiento:
	 * 1 Pedrile un número al usuario.
	 * 2. Comprobar que efectivamente ha metido un número, si no decirle que no lo ha hecho bien.
	 * 3. Comprobar que el número es primo o no.
	 * 4. Decirle si es número es primo o no por pantalla.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,a, num1=0;
		Scanner keyboard=new Scanner(System.in);
		a=0;
		try {
		System.out.printf("Introduce un numero: ");
		num1=keyboard.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("No has introducido un número");
		}
		for(i=1;i<=num1;i++)
		{
		    if(num1%i==0) // 
		    a++;
		}
		if(a==2){
		System.out.println("El número es primo");
		}else {
		System.out.println("El número no es primo"); 
		}
		keyboard.close();
	}	
}

