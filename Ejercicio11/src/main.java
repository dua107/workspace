import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, k;
		Scanner teclado = new Scanner(System.in);
		System.out.println("num");
		num = teclado.nextInt();
		while (num <= 0 ) {
			System.out.println("¿numero positivo?");
			num = teclado.nextInt();
		}//while
		long factorial=1L;
		for( k=num;k>0;k--) {
			factorial=factorial*k;
		}
 
		System.out.println("El factorial de " +num + " es " +factorial);
	}

}
