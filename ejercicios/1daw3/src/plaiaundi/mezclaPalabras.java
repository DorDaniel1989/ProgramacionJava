package plaiaundi;

import javax.swing.*;
public class mezclaPalabras {

	public static void main(String[]args) {
		
		String frase1= "",frase2="", cadenaMezclada="";
		int indice=0, indice2=0;
		
		frase1=JOptionPane.showInputDialog(null ,"Introduzca una frase ");
		frase2=JOptionPane.showInputDialog(null ,"Introduzca otra frase ");
		
		do {
			
			
			while(( indice<frase1.length()) && ( frase1.charAt(indice) !=' ')) {
				cadenaMezclada= cadenaMezclada + frase1.charAt(indice);
				indice++;
				}
			while(( indice < frase1.length()) && (frase1.charAt(indice) == ' '))
				indice++;
			  //if (indice<frase1.length()) 
                   cadenaMezclada = cadenaMezclada + " ";
			       
			  
			while((indice2<frase2.length())&& (frase2.charAt(indice2) != ' ')) {
				cadenaMezclada = cadenaMezclada +  frase2.charAt(indice2);
				indice2++;
			    }
			while(( indice2 < frase2.length()) && (frase2.charAt(indice2) == ' '))
				indice2++;
			//if (indice2<frase2.length()) 
				 cadenaMezclada = cadenaMezclada + " ";
			     
			
			
			 }while(( indice<frase1.length()) && (indice2<frase2.length()));
		
		while(indice<frase1.length()) {
			cadenaMezclada =cadenaMezclada + frase1.charAt(indice);
			indice++;
		}
		while(indice2<frase2.length()) {
			cadenaMezclada =cadenaMezclada + frase2.charAt(indice);
			indice2++;
		}
			
		JOptionPane.showMessageDialog (null, cadenaMezclada);
		
	}
}
