package plaiaundi;

import javax.swing.*;
public class paresEnSecuencia {

	public static void main(String[]args) {
		
	int numero, dig, contPares=0;
	
	    numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero... "));
	   
	do {
		
		while( numero != 0 )  {
			dig= numero % 10;
			
			if(dig % 2 == 0 )
			   contPares++;
			numero = numero / 10;
			System.out.println(contPares);
		}	
		
		 numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca otro numero... "));
		
	}while(numero != 0);
	
		JOptionPane.showMessageDialog(null,contPares +" numeros que tienen al menos un digito par ");
  }
}
