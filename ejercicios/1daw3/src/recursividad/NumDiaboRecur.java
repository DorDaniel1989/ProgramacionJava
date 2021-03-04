package recursividad;

import javax.swing.*;

public class NumDiaboRecur {

	public static void main (String[] args) {
		int num = 0;
		boolean bFallo = false;
		
		do {
			try {
				
				bFallo = false;
				num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número:"));
				
			}catch(NumberFormatException e) {
				System.out.println("Por favor te dije que introdujeras un numero, hazme caso!");
				bFallo = true;
			}
		}while(bFallo);
	
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "El número " + num + " es diabólico");
		}else {
			if(numDiabolic(binario(num))%2 == 0) {
				JOptionPane.showMessageDialog(null, "El número " + num + " no es diabólico");
			}else {
				JOptionPane.showMessageDialog(null, "El número " + num + " es diabólico");
			}
		}
		
		
	}
	
	
	public static int binario(int num) {
		if(num == 0) {
			return 0;
		}else {
			return (num%2) + binario(num/2) * 10;
		}
	}
	
	public static int numDiabolic (int num) {
		if(num == 0) {
			return 0; 
		}else {
			if(num%10 == 0) {
				return 1 + numDiabolic(num/10);
			}else {
				return numDiabolic(num/10);
			}
		}
	}
}

