package plaiaundi;

import java.util.Scanner;
public class seguirSiNo {
	
	public static void main (String[]args) {
		
		String cadena, seguir;
		char letra;
		Scanner teclado = new  Scanner (System.in);

     do {
    	 System.out.println("Introduce tu nombre");
    	 cadena = teclado.nextLine();
    	 System.out.println("Hola " + cadena);
    	 System.out.println("Seguir? (Si/No)");
         seguir = teclado.nextLine();
    	 letra= seguir.charAt(0);
    	 
    	 
    	  }while ((letra !='N') && (letra !='n'));	
	
	    teclado.close();
	
	}

}

