import java.util.Scanner;



/*Se generan 20 n�meros aleatorios de tipo entero entre -10 y 10 almacen�ndolos en un vector.
Hay que calcular y mostrar la media y, adem�s, mostrar cu�ntos n�meros hay:
-Superiores a la media
-Inferiores a la media
-Iguales a la media*/

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num [] = new int [20];
		int i;
		double media=0;
		for (i=0; i<20;i++) {
			System.out.println("Escribe un numero entre -10 y 10");
			num[i]=sc.nextInt();
			while (num[i] < -10 || num[i] >10) {
				System.out.println("Escribe bien el n�mero, entre -10 y 10!!!");
				num[i]=sc.nextInt();
			}//while
		}//for
		for(i=0; i<num.length;i++){
			media=media+num[i];
		}//for
		media = media / num.length;
		System.out.println();
		System.out.println(("La media de los n�meros introducidos es ") + media);
		for(i=0; i<num.length;i++){
			if(num[i]>media) {	
				System.out.println(("La n�meros superiores a la media ") + num[i]);
			}//if
		}//for
		for(i=0; i<num.length;i++){
			if(num[i]<media) {	
				System.out.println(("La n�meros inferiores a la media ") + num[i]);
			}//if
		}//for
		for(i=0; i<num.length;i++){
			if(num[i]==media) {	
				System.out.println(("La n�meros inferiores a la media ") + num[i]);
			}//if
		}//for
	}//main

}//class
