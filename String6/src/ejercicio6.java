import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		String frase2 = frase.toLowerCase();
		while (frase2.length() > 80) {
			System.out.println("Escribe una frase de menos de 80 letras");
			frase2 = sc.nextLine();
		}//while
		int consonantes=0, vocales=0, numericos=0, signos=0, i;
		for (i=0; i < frase2.length(); i++) {
			if ((frase2.charAt(i)=='a') ||  (frase2.charAt(i)=='e') || (frase2.charAt(i)=='i') || (frase2.charAt(i)=='o') || (frase2.charAt(i)=='u') || (frase2.charAt(i)=='�') || (frase2.charAt(i)=='�') || (frase2.charAt(i)=='�') || (frase2.charAt(i)=='�') || (frase2.charAt(i)=='�')) {
				vocales++;
			}//if
			if ((frase2.charAt(i) >=48 & frase2.charAt(i) <=57)) {
				numericos++;
			}//if
			if ((frase2.charAt(i) >=0 & frase2.charAt(i) <=47) || (frase2.charAt(i) >=58 & frase2.charAt(i) <=64) || (frase2.charAt(i) >=91 & frase2.charAt(i) <=96) || (frase2.charAt(i) >=123 & frase2.charAt(i) <=128) || (frase2.charAt(i) >=142 & frase2.charAt(i) <=163) || (frase2.charAt(i) >=166 & frase2.charAt(i) <=255)) {
				signos++;
			}//if
		}//for
		consonantes=frase.length()-vocales-numericos;
		System.out.println("vocales " + vocales);
		System.out.println("consonantes " + consonantes);
		System.out.println("numericos " + numericos);
	}//main


}//class
