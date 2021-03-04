package plaiaundi;

import javax.swing.JOptionPane;

public class ultimaLetra {
  public static void main (String[]args) {
	  
	 //VARIABLES 
	String cadena, cadenaIntro, salida, cadenaResul;
	char letra;
	int indice, indice2, contarPalabras;
	
	//ENTRADA DE DATOS PONIENDOLO EN MAYUSULAS
	cadena=JOptionPane.showInputDialog(null,"Introduce una cadena de caracteres");
	letra = ((JOptionPane.showInputDialog(null , "Introduce un caracteres ")).toUpperCase()).charAt(0);
	cadenaIntro = cadena ;
	cadena = cadena.toUpperCase();
	indice=0 ;
	salida="" ;cadenaResul= "";
	//COMPROBACIONES
	//JOptionPane.showMessageDialog(null, "|"+cadena+"|");
	//JOptionPane.showMessageDialog(null, letra);
	//QUITAMOS PRIMER ESPACIO EN BLANCO SI LO HUBIERA
	while (cadena.charAt(indice)  ==  ' ')
		indice++;
	//PROCESO PARA FORMAR LA CADENA CON UN SOLO ESPACIO ENTRE PALABRAS
	do {
		while (( indice < cadena.length()) && (cadena.charAt(indice) != ' ')){
			 salida = salida +cadena.charAt(indice);
	         indice++;
	         }
		while (( indice < cadena.length()) && (cadena.charAt(indice) == ' '))
			  indice++;
		if (indice < cadena.length());
		   salida = salida + " ";
		
		
	}while (indice < cadena.length());
	//COMPROBACION Y TODO SALE COMO SE ESPERABA
	//JOptionPane.showMessageDialog(null, "|"+salida+"|");

    salida = salida+" ";
  
    //JOptionPane.showMessageDialog(null, salida);
    // HASTA AQUI FUNCIONA EL PROGRAMA
    indice2= 0;
    contarPalabras =0;
    
    while (indice2 <= cadena.length()) {
		if((salida.charAt(indice2) ==' ') && (salida.charAt(indice2 - 1) != ' ') && (salida.charAt(indice2 -1) == letra))
		       contarPalabras ++;
		       indice2 ++;
		       salida = salida + " ";
		
	
    }
    cadenaResul = cadenaResul + "En la frase:\n " +cadenaIntro;
    cadenaResul = cadenaResul + "\nHay " +contarPalabras+ " palabras que";
    cadenaResul = cadenaResul + "\n acaban por la letra:  " +letra;

 JOptionPane.showMessageDialog(null, cadenaResul);
  
  }  }