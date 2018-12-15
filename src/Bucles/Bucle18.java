package Bucles;
import java.util.Scanner;

public class Bucle18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,i,j;
		  Scanner keyboard=new Scanner(System.in);
		  System.out.printf("Tamaño de la mitad superior: ");
		  n=keyboard.nextInt(); 
		  System.out.printf("\n\n");
		  for(i=1;i<=n;i++){ 
		    System.out.printf("\t\t");
		    for(j=1;j<=n-i;j++)
		        System.out.printf(" ");
		    for(j=1;j<=2*i-1;j++) {
		      System.out.printf("*");     
		      System.out.printf("\n");
		  }
		  for(i=n-1;i>=1;i--) 
		    System.out.printf("\t\t");
		    for(j=1;j<=n-i;j++)
		      System.out.printf(" ");
		    for(j=1;j<=2*i-1;j++)
		      System.out.printf("*"); 
		  System.out.printf("\n");
		  }
		  keyboard.close();
	}
}
