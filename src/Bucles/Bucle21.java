package Bucles;


public class Bucle21 {
	/*Planteamiento:
	 * 1. Dibujar el número de casillas blancas y negras que tiene la fila y pasar a la siguiente
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int columna=8, fila=8;
		String pintarBlanco=FONDO_BLANCO+" "+RESET, pintarNegro=FONDO_NEGRO+" "+RESET;
		do {
			for(int i=columna/2; i!=0; i--) {
				System.out.print(pintarBlanco+pintarNegro);
			}
			fila--;
			System.out.printf("%n");
			for (int i=columna/2; i!=0; i--) {
				System.out.print(pintarNegro+pintarBlanco);
			}
			fila--;
			System.out.printf("%n");
		}while(fila!=0);

	}
	public static final String RESET = "\u001B[0m";
	public static final String FONDO_NEGRO = "\u001B[40m";
	public static final String FONDO_BLANCO = "\u001B[47m";
	
	
}
