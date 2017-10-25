import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		while (frase.length() > 80) {
			System.out.println("Escribe una frase de menos de 80 letras");
			frase = sc.nextLine();
		}//while
		System.out.println("¿Quieres la frase en mayusculas? Escribe 1, si escribes otra cosa capuchilse hara en miniscula");
		a = sc.nextInt();
		if (a == 1) {
			System.out.println(frase.toUpperCase());
		}
		else {
		System.out.println(frase.toLowerCase());
		}
		
	}//main

}//class