package plaiaundi;

import javax.swing.*;
public class juntarPalabras {
  public static void main(String[]args) {
	  
	  String frase, fraseNueva="" ;
	  int indice =0;
	  
	  frase=JOptionPane.showInputDialog(null, "Introduzca una cadena de caracteres ");
	  
	  do {
		  
		  while((indice<frase.length()) && (frase.charAt(indice) != ' ' )){
			  fraseNueva= fraseNueva + frase.charAt(indice);
			  indice++;
			  
		  }
		  indice++;
		  
	  
	  
	    }while(indice<frase.length());
  JOptionPane.showMessageDialog(null, fraseNueva);
  } 
  
}
