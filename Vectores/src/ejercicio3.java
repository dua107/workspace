/*Leer un vector de 20 enteros. Encontrar el mayor y el menor de ellos y los lugares donde se
encuentran.*/

import java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num [] = new int [20];
		int i, posicionmayor=0, posicionmenor=0;
		int mayor=0;
		int menor=0;
		int numeromayor=0;
		int numeromenor=0;
		for (i=0; i<20;i++) {
			System.out.println("Escribe 20 números");
			num[i]=sc.nextInt();
		}//for
		for (i=0; i<10; i++){
		    if (num[i]> mayor){
		    mayor=num[i];
		    }//if
		    if (num[i]< menor){
		    menor=num[i];
		    }//if
		}//for
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El numero menor es " + menor);
	
	numeromayor=num[0];
	for( i=1; i<num.length; i++){
		if (num[i]>numeromayor){
			   numeromayor = num[i];
			   posicionmayor = i;
			} //if		
	}//for
	numeromenor=num[0];
	for( i=1; i<num.length; i++){
		if (num[i]<numeromenor){
			   numeromenor = num[i];
			   posicionmenor = i;
			} //if
	}//for
	System.out.println("La posición del número " + mayor + "es la posición " + (posicionmayor + 1));
	System.out.println("La posición del número " + menor + "es la posición " + (posicionmenor + 1));
	}//main
}//class
