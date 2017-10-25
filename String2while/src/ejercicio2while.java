import java.util.Scanner;

public class ejercicio2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		while (frase.length() > 80) {
			System.out.println("Escribe una frase de menos de 80 letras");
			frase = sc.nextLine();
		}
		int mayusculas = 0;
		int i=0;
		int minisculas = 0;

		while (i<frase.length()){
			if(frase.charAt(i) >= 65 && frase.charAt(i) <=90) {
				mayusculas++; 
			}
			if (frase.charAt(i) >= 97 && frase.charAt(i) <=122) {
				minisculas++;
			}
			i++;
		}
		
		System.out.println("Mayusculas " + mayusculas);
		System.out.println("Minisculas " + minisculas);
	}//main
}//class