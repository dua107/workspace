import java.util.Scanner;

public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, max, min, suma, conta;
		Scanner teclado = new Scanner(System.in);
		System.out.println("num");
		num = teclado.nextInt();
		max = num;
		min = num;
		suma = 0;
		conta = 0;
		while (num != 0) {
			conta = conta + 1;
			suma = suma + num;
			if (num > max) {
				max = num;
			}//if
			else if ( num < min) {
				min = num;
			}//else
			System.out.println("num");
			num = teclado.nextInt();
		}//while
		System.out.println("La media es " +suma/conta);
		System.out.println("La maximo es " +max +" el minimo es " +min);
	}//main

}//class
