package recursividad;


import javax.swing.*;

public class DivisionRestasSucesivasRecur {

	public static void main(String[] args) {
		
		int divisor, dividendo;
		
		dividendo = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número que servirá como dividendo:"));
		divisor = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número que servirá como divisor:"));
		
		JOptionPane.showMessageDialog(null, "El resultado de " + dividendo + "/" + divisor + " es: " + DivisionRestas(dividendo, divisor));
	}
	
	public static int DivisionRestas(int dividendo, int divisor) {
		if(divisor > dividendo){
			return 0;
		}else {
			return 1 + DivisionRestas(dividendo - divisor, divisor);
		}
	}
}
