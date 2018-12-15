package Bucles;
import java.util.Random;
public class Bucle4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*Planteamiento:
        * 1. Creamos el Dado
        * 2. Ponemos el número de lanzamientos a 20
        * 3. Hacemos que cada lanzamiento sea un número distinto.
        * 4. Ponemos por pantalla el resultado del lanzamiento
        */
		Random Tirar=new Random();
		int count=1, Lanzar=(Tirar.nextInt((6))+1) ;
		while(count<=20) {
			Lanzar=(Tirar.nextInt((6))+1);
			System.out.printf("\n Lanzar: %d",Lanzar,count);
			count++;
		}
	}

}
