package Excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio1YFunciones {

	/*Planteamiento:
	 * 1. Ask for 3 parameters: 2 no decimal numbers and 1 character type.
	 * 2. Multiplicate, sums, substract and divide the 2 numbers depending in the character type the user gives.
	 * 3. Print the result. 
	 */
	public static int operacion(int n1, int n2, String operation) {
		Scanner keyboard=new Scanner(System.in);
		int result=0;		
		try {
		System.out.print("Set the first number: ");
		n1= keyboard.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Thats not a number");
		}finally {
			keyboard.nextLine(); //buffer clean
		}
		try {
			System.out.print("Set the second number: ");
			n2= keyboard.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("Thats not a number");
			}finally {
				keyboard.nextLine(); //buffer clean
			}
			System.out.print("Set the operation (a Sum, b Substraction, c Multipliclation, d Division): ");
			operation= keyboard.nextLine();
			if (operation.equals("a")) {
				System.out.printf("%d + %d = %d%n", n1, n2, (n1+n2));
				result= n1+n2;
			}else if (operation.equals("b")) {
				System.out.printf("%d - %d = %d%n", n1, n2, (n1-n2));
				result= n1-n2;
			}else if (operation.equals("c")) {
				System.out.printf("%d x %d = %d%n", n1, n2, (n1*n2));
				result = n1*n2;
			}else if (operation.equals("d")) {
				System.out.printf("%d / %d = %d%n", n1, n2, (n1/n2));
				result= n1/n2;
			}else  {
				System.out.println("Thats not a set operation, try with a, b, c or d.");
				System.out.println("-----RESET----");
			}
		keyboard.nextLine(); //buffer clean
		keyboard.close();			
		return result;
	}
	public static double operacion(double d1, double d2, String operation) {
		Scanner keyboard=new Scanner(System.in);
		double result=0;
		try {
		System.out.print("Set the first number: ");
		d1= keyboard.nextDouble();
		}catch (InputMismatchException e) {
			System.out.println("Thats not an entire number");
		}finally {
			keyboard.nextLine(); //buffer clean
		}
		try {
			System.out.print("Set the second number: ");
			d2= keyboard.nextDouble();
			}catch (InputMismatchException e) {
				System.out.println("Thats not an entire number");
			}finally {
				keyboard.nextLine(); //buffer clean
			}
			System.out.print("Set the operation (a Sum, b Substraction, c Multipliclation, d Division): ");
			operation= keyboard.nextLine();
			if (operation.equals("a")) {
				System.out.printf(d1+" + "+d2+" = ");
				result= d1+d2;
				System.out.println(result);
			}else if (operation.equals("b")) {
				System.out.printf(d1+" - "+d2+" = ");
				result= d1-d2;
				System.out.println(result);
			}else if (operation.equals("c")) {
				System.out.printf(d1+" * "+d2+" = ");
				result = d1*d2;
				System.out.println(result);
			}else if (operation.equals("d")) {
				System.out.printf(d1+" / "+d2+" = ");
				result= d1/d2;
				System.out.println(result);
			}else  {
				System.out.println("Thats not a set operation, try with a, b, c or d.");
				System.out.println("-----RESET----");
			}
		keyboard.nextLine(); //buffer clean
		keyboard.close();			
		return result;
	}
	/*Planteamineto:
	 * 1.Pedirle el número al usuario
	 * 2.Comprobar que si ha metido un número
	 * 3.Decir si ha metido un número primo o no primo.
	 */
	public static int PrimoNoPrimo(int num1) {
		int i,a;
		Scanner keyboard=new Scanner(System.in);
		a=0; //Esta variable la vamos a usar para contar los divisores del número introducido, la inicializamos a 0
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
		if(a==2){//Si al final del bucle, a vale 2, el número es primo, porque tiene solamente 2 divisores.
		System.out.println("El número es primo");
		}else {
		System.out.println("El número no es primo"); 
		}
		keyboard.close();
		return num1;
	}
	/*Planteamiento:
	 * 1. Pedirle un número al usuario.
	 * 2. Se divide el numero desde 1 hasta el anterior
	 * 3. Si es un divisor de resto 0 se añade el número.
	 * 4. Cuando se llega al número introducido, se miran todos los divisores y si la suma de ellos da ese número
	 * 	  El número es perfecto.
	 */
	public static int Perfecto(int a) {
		int i, suma=0, number;
        Scanner keyboard= new Scanner(System.in);
        System.out.print("Introduce un número: ");
        number = keyboard.nextInt();
        for (i = 1; i < number; i++) {   
            if (number % i == 0) {
                suma = suma + i;    
            }
        }
        if (suma == number) { 
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
        keyboard.close();
        a=i;
        return a;
	}
}

