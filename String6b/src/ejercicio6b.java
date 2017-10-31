import java.util.Scanner;

public class ejercicio6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		char letra;
		int k, contac, contav, numericos, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		while (frase.length() > 80) {
			System.out.println("Escribe una frase de menos de 80 letras");
			frase = sc.nextLine();
		}//while
		String frase2 = frase.toUpperCase();
		String frasec = "BCDFGHJKLMNPQRSTVWYZ";
		String frasev = "AEIOU";
		contac =0;
		contav =0;
		numericos = 0;
		i = 0;
		System.out.println(frase2);
		for (k = 0; k < frase2.length(); k++) {//miramos los caracteres de frase2
			letra = frase2.charAt(k);
			if (frasec.indexOf(letra)!=-1) {// a ver si es consonante
				contac++;
			}else if (frasev.indexOf(letra)!=-1) { // aver si es vocal
				contav++;
			}else if (letra >= '0' & letra <= '9') {
				numericos++;
			}//if
		}//for
		System.out.print("La frase tiene " + contac + " consonantes, " + contav + " vocales y " + numericos + " numeros");
	}//main


}//class
