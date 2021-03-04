package metodos_funciones;

import javax.swing.*;

public class CuadradoNumSumaImpar {

	public static void main (String[] args) {
		int num, numCuadrado;
		
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número:"));
		
		numCuadrado = cuadradoSumImpar(num);
		
		JOptionPane.showMessageDialog(null, "El cuadrado de " + num + " es: " + numCuadrado);
	}
	
	public static int cuadradoSumImpar(int num) {
		if(num == 0) {
			return 0;
		}else {
			return (2*num - 1) + cuadradoSumImpar(num - 1);
		}
	}
}
