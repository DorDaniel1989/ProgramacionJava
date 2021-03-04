package plaiaundi;


import javax.swing.JOptionPane;

public class invertirNumero {

	public static void main(String[]args) {
		
		int numero, resto, invertido ;
		
		invertido = 0;
		
		do {
			
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero positivo "));
					
		}while(numero < 0) ;
		
		
		
		 while(numero !=0) {
			  resto = numero % 10;
			  invertido = invertido * 10 + resto;
			  numero =numero / 10;
			  
			 
		 }
		
		
		
	
		JOptionPane.showMessageDialog(null , ("El numero invertido es  " + invertido));
	}
	
	
}
