import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		while (frase.length() > 80) {
			System.out.println("Escribe una frase de menos de 80 letras");
			frase = sc.nextLine();
		}//while
		for (k = 0; k < frase.length(); k+=2) {
			
				System.out.print(frase.charAt(k));
			} System.out.println();
		for ( k= 1; k < frase.length(); k+=2) {
			
			System.out.print(frase.charAt(k));
		}
	}

}
