import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, k, conta;
		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		if (N < 0) {
			N = -N;
		}//if
		conta=0;
		for (k = 2; k <= N-1; k++) {
			if (N % k == 0) {
				conta = conta + 1;
			}//if
		}//for
		if (conta == 0) {
			System.out.println(N +" es primo");
		}//if
		else if (conta != 0) {
			System.out.println(N +" no es primo");
		}//else if
	}//main

}//class
