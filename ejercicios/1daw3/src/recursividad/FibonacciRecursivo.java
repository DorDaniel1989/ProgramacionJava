package recursividad;


import javax.swing.*;

public class FibonacciRecursivo {

	public static void main(String[] args) {
		
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce cuántos 'n' términos de la sucesión de Fibonacci que quieres que se impriman:"));
		
		JOptionPane.showMessageDialog(null, SeguidaFibonacci(n));
		
	}
	
	public static int SeguidaFibonacci(int n){
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return SeguidaFibonacci(n - 1) + SeguidaFibonacci(n - 2);
		}
	}
}
