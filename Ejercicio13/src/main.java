import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num, k, contadivisores, posibleprimo;
		boolean encontrado = false;
		//boolean noencontrado = false;
		Scanner teclado = new Scanner(System.in);
		System.out.println("num");
		num = teclado.nextInt();
		while (num <= 0 ) {
			System.out.println("¿numero positivo?");
			num = teclado.nextInt();
		}//while
		posibleprimo = num;
		//noencontrado = false;
		
		encontrado = false;
		while (encontrado == false) {
			posibleprimo = posibleprimo + 1;
			contadivisores = 0;
			for (k = 2; k < posibleprimo; k++) {
				if (posibleprimo % k == 0) {
					contadivisores = contadivisores + 1;
				}//if
			}//for
			if (contadivisores == 0) {
				encontrado = true;
			}//if
		}//while
		if (encontrado == true) {
			System.out.println("El primo mas cercano a " +num +" por exceso es " +posibleprimo);
		}//if
		else /*if (noencontrado == false) */{
			System.out.println("No se ha encontrado ningún número primo por debajo de " +num);
		}//else
	}//main

}//class

