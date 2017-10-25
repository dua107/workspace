import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		while (N < 1 | N > 100) {
			System.out.println("Has introducido un valor erroneo, debe de ser entre 1 y 100");
			N = teclado.nextInt(); 
		}//while
		for (k = 1; k <= 10; k++) {
			System.out.println(N+"*"+k+"="+N * k);
		}//for
	}//main

}//class