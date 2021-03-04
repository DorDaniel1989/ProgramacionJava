package plaiaundi;

import javax.swing.*;
public class palindromos {
  public static void main(String[]args) {
	  
	  
 String palabra="", palabraIntro;
 String palabraInvertida="";
 int contador;
 
 

 palabra = JOptionPane.showInputDialog(null, "Introduzca una palabra");
 palabraIntro = palabra;
 palabra = palabra.toUpperCase();
 
 palabraIntro = palabra;
 palabra=palabra.toUpperCase();
 contador = palabra.length();
 
 //COMPRUEBO EL CONTADOR SI COGE EL VALOR DE LA PALABRA
 //JOptionPane.showMessageDialog (null, contador  );
 while(contador != 0) {
	 
	 palabraInvertida= palabraInvertida + palabra.charAt(contador -1);
	 contador--;
 }
//COMPARO LA PALABRA INVERTIDA CON LA INTRODUCIDA
 if (palabraInvertida.equals(palabra))
	  JOptionPane.showMessageDialog(null, "La palabra "+palabraIntro+ " es palindroma" );
 else {
 JOptionPane.showMessageDialog(null, "La palabra "+palabraIntro+ " no es palindroma" );}
 

	
  
  }
}
