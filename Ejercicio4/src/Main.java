import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		if (N < 0) {
			N = -N;
		}//if

		for (k = 1; k<=N; k++) {
			if (N % k == 0) {
				System.out.println(k+ " Es divisor de"+ N); 
			}//if
		}//for
	}//main

}//class