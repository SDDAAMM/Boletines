package Bucles;
import java.util.Scanner;
import java.util.Random;
public class Bucle13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroI=0, numMaquina, intentos=4;
		boolean winner=true;
		Random random=new Random();
		Scanner keyboard=new Scanner(System.in);
		numMaquina=random.nextInt(101)+1;
		do {
			do {
				System.out.print("Introduce un número entre 1 y 100: ");
				numeroI=keyboard.nextInt();
			}while(numeroI<1 ||numeroI>100);
			if(numeroI<numMaquina) {
				System.out.println("Has introducido un número menor al que he pensado, has perdido 1 vida");
				intentos--;
			}else if(numeroI>numMaquina) {
				System.out.println("Has introducido un número mayor que el que he pensado, has perdido 1 vida");
				intentos--;
			}else if(numeroI==numMaquina){
				System.out.println("Genial, has ganado");
				winner=false;
			}
		}while(winner && intentos!=0);
		keyboard.close();
		System.out.println("Vuelve a reiniciar para volver a intentarlo");
		
	}

}
