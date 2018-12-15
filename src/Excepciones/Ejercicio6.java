package Excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio6 {
	/*Planteamineto:
	 * 1. Pedirle un número al usuario y comprobar si ha introducido un número, lo mismo con el segundo.
	 * 2. Con los 2 números introducidos calcular el Máximo común divisor
	 * 3. Mostrar el resultado por pantalla.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int num1=0, num2=0, a, b, resto;
       try {
    	   System.out.print("Introduzca el primer número: ");
    	   num1 = keyboard.nextInt();
       }catch (InputMismatchException e) {
    	   System.out.println("No ha introducido un número");
       }
       try {
    	   System.out.println("Introduzca el segundo número");
           num2 = keyboard.nextInt();
       }catch (InputMismatchException e) {
    	   System.out.println("No ha introducido un número");
       }
        a = Math.max(num1, num2);
        b = Math.min(num1, num2);       
        do {
            resto = b;
            b = a%b;
            a = resto;
        } while (b!=0);
        System.out.println("El M.C.D entre "+num1+" y "+num2+" es: " + resto);
        keyboard.close();
	}

}
