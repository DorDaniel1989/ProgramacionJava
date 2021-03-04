package plaiaundi;

import javax.swing.JOptionPane;
public class leerSuma {

	
	public static void main(String[]arg) {
		
		int contador=0;
		int suma=0;
		int num;
		
		do {
			
		num=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero"))	;
		suma = suma+num;
		contador++;
			
		}while(contador<10);
		
		System.out.println(suma);
	}
	
}
