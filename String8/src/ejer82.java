import java.util.Scanner;

public class ejer82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase;
		int i;
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
			frasec += (char)(frase.charAt(i)+desplazamiento);
		}//for
		System.out.println(frase);
		System.out.println(frasec);
		System.out.println();

		System.out.println("Para descifrar introduce el numero de codigo");
		desplazamiento = sc.nextInt();
		for ( i=0; i<frasec.length(); i++) {

			descifrado += (char) ((frasec.charAt(i))-desplazamiento);;  
		}//for
		System.out.println(frasec);
		System.out.println(descifrado);
		sc.close();
	}//main
}//class
