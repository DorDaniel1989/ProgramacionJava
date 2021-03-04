package plaiaundi;

import javax.swing.JOptionPane;

public class partirNumero {

	public static void main(String[]args) {
int num, num1=0, num2=0, digito, dig;
int pot=1 ;
boolean encontrado=false;
//entrada de datos
num =Integer.parseInt(JOptionPane.showInputDialog (null, "Introduzca un numero entero "));
digito =Integer.parseInt(JOptionPane.showInputDialog (null, "Introduzca un digito "));

//mientras el numero sea distinto a 0 y encontrado sea falso, repetir
	
while ((num !=0) && (encontrado==false))	{
		     dig = num % 10; //COGEMOS EL PRIMER DIGITO EMPEZANDO POR LA UNIDAD
		     num1 = num1 + dig * pot; // 0 = 0 + dig *1
		     pot = pot * 10; // actualizamos la potencia a 10 para la siguiente vuelta
		     num = num / 10; // dividimos el numero entre diez para en la siguiente vuelta coger el segundo digito
		     if (dig == digito) // si el digito obtenido del numero introducido es el mismo al introducido por el usuario, lo hemos encontrado y salimos del bucle
			   encontrado = true;
		     }
//si a encontrado un resto igual al digito, sale del bucle, la potencia se inicializa a 1 de nuevo , para poder empezar a formar el segundo numero		

		pot = 1; 
		
//formamos el segundo numero  a partir de los restos del numero hasta que se agote, actualizando la potencia( * 10) y el numero en cada vuelta		
		
		while (num !=0) { 
		    dig = num % 10;
		    num2 = num2 + dig * pot;
		    pot = pot * 10;
		    num = num / 10;
		}
		
		
	
	
	
	

JOptionPane.showMessageDialog(null,"numeros:  "+num2+" - "+num1 );
}}
