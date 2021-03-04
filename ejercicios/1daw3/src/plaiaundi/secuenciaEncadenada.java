package plaiaundi;

import javax.swing.JOptionPane;

public class secuenciaEncadenada {
public static void main(String[]args) {
	
 int num1,num2, num2Intro, contSec=0, primerD, ultimoD =0;
 
 String seguirr = " ";
 char letra;
	 num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero entero"));
do {  
	
	  primerD = num1 % 10;
	 num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca otro numero entero"));
	 num2Intro = num2;
	 
       while (num2!= 0) {
    	   ultimoD = num2 % 10;
    	   num2=num2/10;
    	//System.out.println( num2 );  
    	//System.out.println( ultimoD );  
       }
    	   if((primerD != ultimoD) && (primerD !=0)) {
    		   
    	       JOptionPane.showMessageDialog(null , "La cantidad de numeros en secuencia introducidos es: " +(contSec+1));
    	       seguirr =JOptionPane.showInputDialog(null, "¿Desea continuar? teclee S/N ");} 
    	  
    	   letra=seguirr.charAt(0);
    	   contSec++  ;   	  
    	   num1 = num2Intro;
    	  
    	   		 
		 
 }while((letra !='N') && (letra !='n'));
 
//JOptionPane.showMessageDialog(null,"La cantidad de numeros en secuencia introducidoa es  :" +contSec);
}}
	
	  
	