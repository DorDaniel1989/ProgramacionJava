package plaiaundi;

import javax.swing.JOptionPane;
public class quitarDigito {
	
	public static void main(String[]args) {
		
		int numero , digito, resto, pot, numeroNuevo;
		
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero entero"));
		}while(numero<0);
		
		
		do{
			digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un digito"));
		}while((digito<0) || (digito>9));
	 
		pot =1;
		numeroNuevo = 0;
		do {
			resto = numero % 10;
			 if(resto != digito) {
				 numeroNuevo = numeroNuevo +resto * pot;
				 pot =pot * 10;
				 numero=numero / 10;
			 }
			 else 
				 numero =numero / 10 ;
			
		}while(numero !=0);
		 
		JOptionPane.showMessageDialog(null, ("El numero resultante es " + numeroNuevo));
	    
	}

}

