import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int i, j;
		String min = " abcdefghijklmnopqrstuvwxyz ";
		String may = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String frasec ="";
		String descifrado = "";
		int desplazamiento;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una frase");
		frase = sc.nextLine();
		System.out.println("Introduce el codigo numerico de 1 a 10");
		desplazamiento = sc.nextInt();
		while (desplazamiento  <1 || desplazamiento >10) {
			System.out.println("Introduce un codigo de 1 a 10");
			desplazamiento = sc.nextInt();
		}
		for ( i=0; i<frase.length(); i++) {
			for ( j=0; j<min.length();j++) {
				if (frase.charAt(i) == min.charAt(j)) {
					if(j + desplazamiento >= min.length()) {
						frasec +=((j + desplazamiento) % min.length());
					}//if
					else {
						frasec += min.charAt(j + desplazamiento);
					}//else
				}//if
				else if 
				(frase.charAt(i) == may.charAt(j)) {
					if(j + desplazamiento >= may.length()) {
						frasec +=((j + desplazamiento) % may.length());
					}//if
					else {
						frasec += may.charAt(j + desplazamiento);
					}//else
				}//if
			}//for
		}//for
		System.out.println(frase);
		System.out.println(frasec);
		System.out.println();
		System.out.println("Para descifrar introduce el numero de codigo");
		desplazamiento = sc.nextInt();
		for ( i=0; i<frasec.length(); i++) {

			for ( j=0; j<min.length();j++) {
				if (frasec.charAt(i) == min.charAt(j)) {
					if(j + desplazamiento >= min.length()) {
						descifrado +=((j - desplazamiento) % min.length());
					}//if
					else {
						descifrado += min.charAt(j - desplazamiento);
					}//else
				}//if
				else if 
				(frasec.charAt(i) == may.charAt(j)) {
					if(j + desplazamiento >= may.length()) {
						descifrado +=((j - desplazamiento) % may.length());
					}//if
					else {
						descifrado += may.charAt(j - desplazamiento);
					}//else
				}//if
			}//for
		}//for
		System.out.println(frasec);
		System.out.println(descifrado);
	}//main
}//class
