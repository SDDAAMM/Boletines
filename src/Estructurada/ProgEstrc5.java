package Estructurada;
import java.util.Scanner;

public class ProgEstrc5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner (System.in);
		int turno=0, horas=0, hfestivo=0;
		System.out.print("Elija su turno:\n1. Dia\n2. Noche\n");
		turno=keyboard.nextInt();
		if (turno==1) {
			System.out.print("Ponga el número de horas trabajadas:");
			horas=keyboard.nextInt();
			System.out.print("Ponga cuantas horas ha trabajado en festivo:");
			hfestivo=keyboard.nextInt();
			System.out.println("Usted ha ganado: "+(horas*3+hfestivo*4.2)+("€"));
		}else if(turno==2) {
			System.out.print("Ponga el número de horas trabajadas:");
			horas=keyboard.nextInt();
			System.out.print("Ponga cuantas horas ha trabajado en festivo:");
			hfestivo=keyboard.nextInt();
			System.out.println("Usted ha ganado: "+(horas*4.8+hfestivo*6.6)+("€"));	
		}else {
			System.out.println("Vuelva a intentarlo");
		}
		keyboard.close();
	}
}
