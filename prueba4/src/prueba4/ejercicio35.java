package prueba4;

import java.util.Scanner;

public class ejercicio35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int notas[]=new int [10];
		int i;
		double media=0, suma=0;
		boolean elNumeroEsta = false;
		for (i=0; i<10;i++) {
			//System.out.println("Escribe una nota");
			//notas[i]=sc.nextInt();
			notas[i] =  (int) Math.floor(Math.random()*11);
		}
		
		for (i=0; i<10;i++) {
			System.out.printf("%4d",notas[i]);
		}
		
		for(i=0;i<notas.length;i++){
			suma=suma+notas[i];
		}	
		System.out.println();
		media=suma/notas.length;
		System.out.println();
		System.out.print("la media es :" +media);
		System.out.println();
		System.out.print("\nbuscar nota: ");
		int nota;
		nota=sc.nextInt();

		for(i=0;i<notas.length;i++){
			if (nota == notas[i]) {
				System.out.println("El numero esta en el indice "+i+", en la posicion "+(i+1));
				elNumeroEsta = true;
			}
		}

		if(elNumeroEsta ==false) {
			System.out.println("El numero no esta");
		}
	}

}
