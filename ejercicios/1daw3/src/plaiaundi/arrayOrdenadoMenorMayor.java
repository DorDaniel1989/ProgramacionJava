package plaiaundi;

import javax.swing.*;
public class arrayOrdenadoMenorMayor {
	public static void main (String[]args) {
		
		
		int[]numeros;
		numeros= new int [10];
		
		int numComparacion;
		boolean ordenado= true;
		int i=0;
		numeros [i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero "));
		numComparacion = numeros[i];
		
		for (i=1 ; i < 10 ; i++) {
			
			numeros[i] =Integer.parseInt(JOptionPane.showInputDialog(null," Introduzca un numero"));
			 if (numeros[i] >= numComparacion)
				 numComparacion= numeros[i];
			 else
				 ordenado=false;
			}     
			if (ordenado == false)	
		System.out.println("El vector esta desordenado");
	else
	       System.out.println("El vector esta ordenado ");
	}

}
	   
	