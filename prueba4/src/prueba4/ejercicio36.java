/*36.-Generar una matriz de 4 filas y 5 columnas con n�meros aleatorios entre 1 y 100, e
imprimirla.*/

package prueba4;

public class ejercicio36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int matriz [][]=new int [4][5];
		for (i=0; i <4; i++){
			System.out.println();
			System.out.printf("fila numero %2d", (i+1));
			for (j=0; j<5; j++){
				matriz[i][j] = (int) Math.floor(Math.random()*99);
				//System.out.println("Tabla: " + (i+1)+ " Fila: " + (j+1) + " = " + matriz[i][j]);
				System.out.printf("%5d", matriz[i][j]);
			}
		}
	}
	
	

}
