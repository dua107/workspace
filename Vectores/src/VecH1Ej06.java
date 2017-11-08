/*Generar una matriz de 10x10, asignarles número reales aleatorios a cada elemento entre -5 y 5.
Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
matriz*/


public class VecH1Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int f = 10;
		final int c = 10;
		int matriz [][];
		matriz = new int[f][c];
		int i, j, k;
		for (i=0; i<f; i++){
			for (j=0; j<c; j++){
				matriz[i][j]=(int)Math.floor(Math.random()*6);
			}//for
		}//for	
		for (i=0; i<f; i++){ 
			k=0; 
			for(j=0; j<c;j++){ 
			k=k+matriz[i][j]; 
			System.out.println("la suma de la fila "+i+" es: "+k); 
			} 
			} 
		
	}//main

}//class
