public class prueba {

	
	public static void main(String[] args) {
		
	    // Texto
	    String sTexto = "hacemos mas y mas palabra o palabras y palabra";
	    // Texto que vamos a buscar
	    String sTextoBuscado = "palabra";
	    // Contador de ocurrencias 
	    int contador = 0;

	    while (sTexto.indexOf(sTextoBuscado) > -1) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
	      contador++; 
	    }

	    System.out.println (sTextoBuscado.indexOf(sTexto));

	}

}