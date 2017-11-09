

package prueba4;

import java.util.Scanner;



public class ejercicio34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int notas[]=new int [10];
		int i;
		double media=0;
		for (i=0; i<10;i++) {
			notas[i] =  (int) Math.floor(Math.random()*11);	}
		
		for(i=0; i<notas.length;i++){
			media=media+notas[i];
		}//for
		media = media / notas.length;
		System.out.println();
		System.out.println(("La media de las notas es ") + media);
	}

}
