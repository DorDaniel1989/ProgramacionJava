package plaiaundi;

import javax.swing.*;

public class sumarOctales {	
	public static void main (String[] args){
		// Declaración de variables
		int sum1, sum2, intSum1, intSum2;
		int resul, digito, dig2, peso, sumDig;
		int llevada;
		boolean correcto;
		
		// Introducción del primer sumando
		do{
			correcto = true;
			sum1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introducir primer sumando"));
			if (sum1 < 0)
				correcto = false;
			intSum1 = sum1;
			// Comprobando que todos los digitos del número están
			// bien en base octal
			while((correcto) && (sum1 != 0)){
				digito = sum1 % 10;
				if (digito > 7)
					correcto = false;
				sum1 = sum1 / 10;
			}
			if (!correcto)
			   JOptionPane.showMessageDialog(null, "Error en la entrada");
		}while (!correcto);
		
		// Introducción del segundo sumando
		do{
			correcto = true;
			sum2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Introducir segundo sumando"));
			if (sum2 < 0)
				correcto = false;
			intSum2 = sum2;
			// Comprobando que todos los digitos del número están
			// bien en base octal
			while((correcto) && (sum2 != 0)){
				digito = sum2 % 10;
				if (digito > 7)
					correcto = false;
				sum2 = sum2 / 10;
			}
			if (!correcto)
			   JOptionPane.showMessageDialog(null, "Error en la entrada");
		}while (!correcto);
		
		//Procedemos a sumar ambos números
		resul = 0;
		llevada = 0;
		sum1 = intSum1;
		sum2 = intSum2;
		peso = 1;
		while ((sum1 !=0) && (sum2 != 0)){
			digito = sum1 % 10;
			dig2 = sum2 % 10;
			sumDig = digito + dig2 + llevada;
			llevada = sumDig / 8;
			resul = resul + (sumDig % 8) * peso;
			peso = peso * 10;
			sum1 = sum1 / 10;
			sum2 = sum2 / 10;
		}
		
		
	    //Vamos a comprobar que hemos procesado todos los 
		//digitos de ambos sumandos
		while (sum1 != 0){
			//El primer sumando aun tiene digitos por procesar
			digito = sum1 % 10 + llevada;
			llevada = digito / 8;
			resul = resul + (digito % 8) * peso;
			peso = peso * 10;
			sum1 = sum1 / 10;
		}
		
		while (sum2 != 0){
			//El segundo sumando aun tiene digitos por procesar
			digito = sum2 % 10 + llevada;
			llevada = digito / 8;
			resul = resul + (digito % 8) * peso;
			peso = peso * 10;
			sum2 = sum2 / 10;
		}

		// Comprobamos si hay llevada para añadirla al final.
		    resul = resul + llevada * peso;

		// Mostramos el resultado de la operación
		JOptionPane.showMessageDialog(null, intSum1 + " + " + intSum2 + " = " + resul);
	}
}