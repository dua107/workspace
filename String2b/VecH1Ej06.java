/*Generar una matriz de 10x10, asignarles número reales aleatorios a cada elemento entre -5 y 5.
Calcular e imprimir la suma de cada una de sus filas y de cada una de sus columnas junto con la
matriz*/


public class VecH1Ej06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int FILAS = 10;
		final int COLUMNAS = 10;
		int matriz [][];
		matriz = new int[FILAS][COLUMNAS];
		int f, c, sumaFila, sumaColumna;
		for (f=0; f<FILAS; f++){
			for (c=0; c<COLUMNAS; c++){
				matriz[f][c]=(int)Math.floor(Math.random()*11 - 5);
			}//for
		}//for
		System.out.println("\t\t\t\t\t\t\tSuma de fila");
		for (f=0; f<FILAS; f++){ 
			sumaFila=0; 
			for(c=0; c<COLUMNAS;c++){ 
				sumaFila=sumaFila + matriz[f][c]; 
				System.out.printf("%5d",matriz[f][c]); 
			} 
			System.out.printf("%8d\n", sumaFila);
		} 
		
		// vamos con la suma de las columnas
		
		System.out.println();
		for (c=0; c<COLUMNAS; c++){ 
			sumaColumna=0; 
			for(f=0; f<FILAS;f++){ 
				sumaColumna=sumaColumna + matriz[f][c]; 
			} 
			System.out.printf("%5d", sumaColumna);
		} 		
		System.out.print("\t<-- Suma de las columnas");
		
		
		
		
		
		
		
		
		

	}//main

}//class
