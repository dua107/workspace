/*Leer del teclado dos vectores de dimensi�n 10 y construir un tercer vector cuyos componentes
sean la suma de los dos anteriores. Luego se imprime el tercer vector. A continuaci�n se ordena
y se vuelve a imprimir.*/

import java.util.Arrays;
import java.util.Scanner;
public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num [] = new int [10];
		int num1 [] = new int [10];
		int suma [] = new int [10];
		int i;
		for (i=0; i<10;i++) {
			System.out.println("Escribe 10 n�meros");
			num[i]=sc.nextInt();
		}//for
		for (i=0; i<10;i++) {
			System.out.println("Escribe otra vez 10 n�meros");
			num1[i]=sc.nextInt();
		}//for
		 System.out.println();
		    for(i=0;i<num.length;i++){
		        suma[i]=num[i]+num1[i];
		         System.out.print(suma[i]+" ");
		     }//for
		 System.out.println();
		 System.out.println();
		Arrays.sort(suma);
		for (suma2:suma) {
			System.out.print(suma2 + " ");
		}		
			
	}//main

}//class
