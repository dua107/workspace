import java.util.Scanner;

/*Generar dos vectores de dimensi�n 10 (dar valores aleatorios entre 1 y 5 a cada elemento) y
comprobar para cada uno de los elementos del primer vector cu�ntas veces est� en el segundo,
es decir para
 vector1= {3,7,2}
 vector2= {3,3,5}
 el resultado debe ser:
 elemento 1 : 2 veces
 elemento 2 : 0 veces
 elemento 3 : 0 veces*/

public class ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num [] = new int [10];
		int num2 [] = new int [10];
		int i,j;
		for (i=0; i<10; i++){
			System.out.println("Escribe diez numeros entre 1 y 5");
			num[i]=sc.nextInt();
		}//for
			for (j=0; j<10; j++){
			System.out.println("Escribe otros diez numeros entre 1 y 5");
			num2[j]=sc.nextInt();
		
		}//for
					
		}//main
	}//class