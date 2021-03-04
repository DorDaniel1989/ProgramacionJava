package plaiaundi;

import javax.swing.JOptionPane;

public class decimalBinario {

	public static void main(String[]args) {
		
		int numDec, auxDec, numBin, digBin, pot ;
		
		
		pot = 1;
		do {
			numDec=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero entero"));
			}while (numDec <= 0);
		
		 auxDec = numDec;
		 numBin = 0;
		while (numDec !=0) {
			digBin = numDec % 2 ;
			numBin = numBin + digBin *pot;
			numDec= numDec / 2;
			pot = pot * 10;
			
		} 
		
		JOptionPane.showMessageDialog(null, ("El numero " +auxDec+ " en binario es:  " +numBin));
	}
	
}
