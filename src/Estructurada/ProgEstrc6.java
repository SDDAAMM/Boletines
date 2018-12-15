package Estructurada;
import java.util.Scanner;
public class ProgEstrc6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner (System.in);
		int a=0, b=0, c=0;
		System.out.print("Inserte el primer número: ");
		a= keyboard.nextInt();
		System.out.print("Inserte el segundo número: ");
		b= keyboard.nextInt();
		System.out.print("Inserte el tercer número: ");
		c= keyboard.nextInt();
		if (a>b && b>c) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}else if(a<b && b<c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}else if (a>c && b>a) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}else if(a>c && c>b) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}else if(b>c && c>a) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}else if(c>a && a>b) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		keyboard.close();
		}
}
