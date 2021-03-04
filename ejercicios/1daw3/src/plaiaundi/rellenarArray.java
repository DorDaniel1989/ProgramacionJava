package plaiaundi;

import java.util.Scanner;
public class rellenarArray {
	
	public static void main(String[]arg) {
		
		int cantidad;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el tamaño del array ");
		cantidad=entrada.nextInt();
		
		int numeros []= new int[cantidad];
		
		for (int i=0; i<numeros.length;i++) {
			
			System.out.println("Introduzca el valor #"+ (i+1)+" del array");
			numeros[i]= entrada.nextInt();
			
		}
		
		for(int j=0; j<numeros.length; j++) {
			
			System.out.print("["+numeros[j]+"]");
		}
		
		entrada.close();
	}

}
