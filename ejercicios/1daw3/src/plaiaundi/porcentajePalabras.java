package plaiaundi;

import javax.swing.JOptionPane;
public class porcentajePalabras {

	public static void main(String[]args) {
		
		String cadena , salida="";
		int indice=0, indice2=0, blancos=0, ultimaPosicion=0 , buscado =0, porcentaje =0, contarPalabras = 0;
	
		cadena = JOptionPane.showInputDialog(null, "Introduzca una frase");
		
		
		
		//QUITAMOS UN POSIBLE PRIMER ESPACIO EN BLANCO
		
		while (cadena.charAt(indice)  ==  ' ')
			indice++;
		
		do {
			while (( indice < cadena.length()) && (cadena.charAt(indice) != ' ')){
				 salida = salida +cadena.charAt(indice);
		         indice++;
		         }
			while (( indice < cadena.length()) && (cadena.charAt(indice) == ' '))
				  indice++;
			if (indice < cadena.length());
			   salida = salida + " ";
		       
		}while(indice<cadena.length());
	     
		//COMPRUEBO QUE LA CADENA ESTA COMO YO QUIERO   
		JOptionPane.showMessageDialog(null, "|"+salida+"|");
		//JOptionPane.showMessageDialog(null, salida.length());
		//AVERIGUO EL NUMERO DE BLANCOS DE LA SALIDA
		do {
		    
			if(salida.charAt(indice2) == ' ') { 
			   blancos++;
			   
			     if ((blancos >= 1) && (indice2 - (ultimaPosicion+1)) >=5) {
			    	 buscado++;
			    	 ultimaPosicion  =  (indice2);
			    	   }
			         }
			    indice2++;   
		 } while(indice2 < salida.length());
		//NUMERO DE BLANCOS CORRECTOS
		//JOptionPane.showMessageDialog(null,"numero de blancos: " +(blancos-1) +"\n Numero de palabras buscadas mayores de 5 : " + (buscado));
		
		indice2=0;
	     // BUSCAMOS EL NUMERO DE PALABRAS TOTALES
		  while (indice2 <= cadena.length()) {
				if((salida.charAt(indice2) ==' ') && (salida.charAt(indice2 - 1) != ' ') )
				       contarPalabras ++;
				 
				indice2 ++;
				       
				 }
		
		 //JOptionPane.showMessageDialog(null,"numero de palabras : "+contarPalabras);
		 //RESOLVEMOS EL PROBLEMA
		 porcentaje= (buscado*100)/contarPalabras;
		
		 JOptionPane.showMessageDialog(null,"El porcentaje del numero de palabras mayores de 5 es del: "+porcentaje+"%");
		
	
}}