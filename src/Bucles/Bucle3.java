package Bucles;
import java.util.Scanner;
public class Bucle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Planteamineot:
		 *1 Put the marks of the students
		 *2 Show how many marks of each type there are
		 */
		Scanner keyboard=new Scanner(System.in);
		int  deficientes=0,insuficientes=0, suficientes=0, bien=0, notable=0, sobresaliente=0 ; 
	    int marks, b  ;
		for (b=1;b<=10;b++) {
			do {
			System.out.println("Set mark "+(b)+" between 0 & 10: ");
			marks = keyboard.nextInt();
			}while(marks>10 || marks<0) ;
		if (marks>=0 && marks<=2) {
			deficientes++;
		}else if (marks>=3 && marks<=4) {
			insuficientes++;
		}else if (marks==5) {
			suficientes++;
		}else if (marks==6) {
			bien++;
		}else if (marks>=7 && marks<9) {
			notable++;
		}else if (marks>=9 && marks<=10) {
			sobresaliente++;
		}	
		}
		System.out.println("Marks Tables");
		System.out.println("Deficiente:" +deficientes);
		System.out.println("Insuficientes:" +insuficientes);
	    System.out.println("Suficientes:" +suficientes);
	    System.out.println("Bien:" +bien);
	    System.out.println("Notables:" +notable);
	    System.out.println("Sobresalientes:" +sobresaliente);
	    keyboard.close();
   		
	}

}
