package Excepciones;
public class Ejercicio5 {
	/*Plantamiento:
	 * 1. Empezando desde 1, comprobar número a número todos hasta el 10.000.
	 * 2. Para cada número comprobar cada divisor y sumarlos para obtener todos los numeros perfectos.
	 * 3. Poner en pantalla todos los números enteros entre 1 y 10.000.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i, suma=0, j;
	      System.out.println("Números perfectos entre 1 y 10000: ");
	      for(i=1;i<=10000;i++){   
	          for(j=1;j<i;j++){  
	               if(i%j==0){
	               suma=suma+j;     
	               }
	          }
	          if(i==suma){           
	        	  System.out.println(i);
	          }
	     }
	}
}
