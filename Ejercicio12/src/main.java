import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, k, sumadedivisores;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("num");
		num = teclado.nextInt();
		while (num <= 0 ) {
			System.out.println("¿numero positivo?");
			num = teclado.nextInt();
		}//while
		
		sumadedivisores = 0;
		
		for (k = 1; k < num; k++) {
			if ( num % k == 0) {
				sumadedivisores = sumadedivisores + k;
			}//if
		}//for
		if (sumadedivisores == num) {
			System.out.println(+num + " es perfecto " );
		}//if
		else {
			System.out.println(+num + " no es perfecto " );
		}//else
	}//main

}//class
