/*38.-Cargar en una matriz las notas de los alumnos de un colegio en función del número de
cursos (filas) y del número de alumnos por curso (columnas).*/


//PENDIENTE!!!!
package prueba4;

import java.util.Scanner;

public class ejercicio38 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		short curso;
		int matriz [][] = new int [][];
		// TODO Auto-generated method stub
		do {
			System.out.println("Introduce el curso");
			sc.nextLine();
		} while ("x");
		
		
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