package Bucles;
import java.util.Scanner;
public class Bucle6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. Se le pide al usuario que escoja una opción.
		 * 	1.1. Sumar: Suma 2 nºs introducidos por el usuario.
		 * 	1.2. Restar: Resta 2 nºs introducidos por el usuario.
		 *  1.3. Multiplicar: Multiplica 2 nºs introducidos por el usuario.
		 *  1.4. Dividir: Divide 2 nºs introducidos por el usuario.
		 *  1.5. Salir: Sale del programa.*/
		
		int option, num1 = 0, num2 = 0;
		Scanner keyboard = new Scanner(System.in);
		
//		1. Se le pide al usuario que escoja una opción.
		do {
			System.out.printf("Welcome to a simple calculator, These are the options:%n\t1. Addition%n\t2. Substraction%n\t3. Multiplication%n\t4. Division%n\t5. Quit%n> Choose your option: ");
			option = keyboard.nextInt();
			
			System.out.println();
			
//			Petición de los dos nºs al usuario si no es la opción nº5 y no se sale del rango de las opciones (1-5).
			if (option !=5 && (option>0 && option<6)) {
				System.out.print("Set first number: ");
				num1 = keyboard.nextInt();
				System.out.print("Set second number: ");
				num2 = keyboard.nextInt();
			}
			switch (option) {
			case 1: // 1.1. Sumar: Suma 2 nºs introducidos por el usuario.
				System.out.printf("%d + %d = %d%n", num1, num2, (num1+num2));
				break;
			case 2: // 1.2. Restar: Resta 2 nºs introducidos por el usuario.
				System.out.printf("%d - %d = %d%n", num1, num2, (num1-num2));			
				break;
			case 3: // 1.3. Multiplicar: Multiplica 2 nºs introducidos por el usuario.
				System.out.printf("%d x %d = %d%n", num1, num2, (num1*num2));
				break;
			case 4: // 1.4. Dividir: Divide 2 nºs introducidos por el usuario.
				System.out.printf("%d / %d = %d%n", num1, num2, (num1/num2));
				break;
 			case 5: // 1.5. Salir: Sale del programa.
				System.out.println("Thanks for using this calculator.");
				break;
			default: // Si no es la opción válida.
				System.out.println("Try again, something has gone wrong\n");
				break;
			}
			System.out.println();
		} while (option != 5);
		keyboard.close();
	}

}


