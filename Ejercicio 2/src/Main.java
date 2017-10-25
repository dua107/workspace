import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N, k, suma;

		Scanner teclado = new Scanner(System.in);
		System.out.println("N");
		N = teclado.nextInt();
		if (N < 0) { 
			N = -N;
		}//if
		suma = 0;
				for (k = 1; k <= N; k++){
					if (k % 2 == 0){
						suma = suma + k*k;
					}//if
				}//for
				
		System.out.println("El suma es:");
		System.out.println(suma);	

	}//main

}//class
