import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, suma, conta;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		suma=0;
		conta=0;
		while (N != 0) {
			conta=conta+1;
					if (N % 5 == 0) {
					suma = suma + N;	
					}//if
					System.out.println("N");
					N = teclado.nextInt();
		}//while
		if (conta != 0) {
			System.out.println("La suma de los multiplos de 5 es " +suma);
			System.out.println("El total de numeros introducidos es " +conta);
		}//if
		else if (conta == 0) {
			System.out.println("No hay datos ");
		}//else
	}//main

}//class
