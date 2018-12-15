package Estructurada;
import java.util.Scanner;
public class ProgEstrc4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner (System.in);
		int km, days ;
		System.out.print("Number of Kilometers → ");
		km=keyboard.nextInt();
		System.out.print("Numbers of days there → ");
		days=keyboard.nextInt();
		keyboard.close();
		if (km>1000 && days>7)
		System.out.println((km*0.35)*30/100 + "€");
		else
		System.out.println(km*0.35 + "€");
		
		
	}

}
