package plaiaundi;

import javax.swing.*;
public class formarNumero {

	public static void main(String[]args) {
		
	int digito, numero=0,potInpar=1;
	String seguir;
	char letra;
	
	do {
		 digito=Integer.parseInt(JOptionPane.showInputDialog(null," Introduzca un digito... "));
		 
		 if(digito % 2 == 0) {
			 numero = numero * 10 + digito;
			 potInpar= potInpar * 10;
		    }
		    else {
		    	numero = digito * potInpar + numero; 
		    	potInpar= potInpar * 10;
		    }
		
		 
			System.out.println(numero);
	      seguir= JOptionPane.showInputDialog(null," Desea continuar introduciendo numeros? teclee Si/No ");
		  letra= seguir.charAt(0);
	      
		
	}while((letra !='n') && (letra!= 'N'));
		 
	JOptionPane.showMessageDialog(null, " El numero formado es el : "+ numero);
	
	}
}

