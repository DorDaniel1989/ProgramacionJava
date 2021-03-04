package plaiaundi;

import javax.swing.*;
public class valorMaxMinParArray {
  
	public static void main (String[]args) {
		
		int contPares = 0;
		int numMax;
		int numMin;
		
		int[] numeros = new int [10];
		int i=0;
		
		numeros[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un numero entero "));
		numMax = numeros[0];
		numMin = numeros[0];
		
		for(i=1 ; i <numeros.length ; i++) {
			numeros[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "introduzca un numero entero "));
				if (numeros[i]%2 == 0 )
				contPares++ ;
			if (numeros[i] > numMax)
			    numMax = numeros[i];
			if (numeros[i] < numMax)
			    numMin = numeros[i];
		}
		
			   
		System.out.println("numeros Pares : " + contPares);
		System.out.println("numero mas grande : : " + numMax);
		System.out.println("numero mas pequeño : " + numMin);
		
	}
	
	
}
