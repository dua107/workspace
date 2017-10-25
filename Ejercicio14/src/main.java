import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, divisor, contadivisores, posibleprimo;
		Scanner teclado = new Scanner(System.in);
		System.out.println("num");
		num = teclado.nextInt();
		while (num <= 0 ) {
			System.out.println("¿numero positivo?");
			num = teclado.nextInt();
		}//while
		for (posibleprimo = 1; posibleprimo <= num; posibleprimo++) {
			contadivisores = 0;
			for (divisor = 2; divisor < posibleprimo ; divisor++) {
				if (posibleprimo % divisor == 0) {
					contadivisores = contadivisores + 1;
				}//if
				
			}//for
			if (contadivisores == 0) {
				System.out.println(+posibleprimo);
			}//if
		}//for
	}//main
}//class