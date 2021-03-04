package recursividad;

import javax.swing.*;

public class NumApocaRecur {

	public static void main(String[] args) {
		
		int num = 0;
		
		boolean bFallo = false;
		
		do {
			try {
				bFallo = false;
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número:"));
			
			}catch(NumberFormatException e) {
			
				JOptionPane.showMessageDialog(null, "He fallado");
				bFallo = true;
			}
			
		}while(bFallo);
		
		
		
		if(numApo(num)) {
			JOptionPane.showMessageDialog(null, "El número " + num + " es apocalíptico");
		}else {
			JOptionPane.showMessageDialog(null, "El número " + num + " no es apocalíptico");
		}
		
	}
	
	
	public static boolean numApo(int num) {
		if(num < 100) {
			return false;
		}else {
			if(num%10 == 6 && num%1000 == 666) {
				return true;
			}else {
				return numApo(num/10);
			}
		}
	}
}
