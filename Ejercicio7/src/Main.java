import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, sumapar, sumaimpar, conta;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		
		sumapar=0;
		sumaimpar=0;
		conta=0;
		
		while (N != 0) {
			conta = conta + 1;
			if (conta % 2 == 0) {
				sumapar = sumapar + N;
			}//if
			else if (conta % 2 != 0) {
				sumaimpar = sumaimpar + N;
			}//else
			System.out.println("N");
			N = teclado.nextInt();
		}//while
		System.out.println("La suma de la posicion par " +sumapar);
		System.out.println("El total de la posicion impar " +sumaimpar);
	}//main

}//class
