package plaiaundi;


import java.util.Scanner;

public class contarPares {

	public static void main(String[] args) {
		
		int numero, digito, numEntrada;
		int contarPar = 0;
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce un numero ");
        numero = tec.nextInt();
        numEntrada= numero;
        
        while (numero != 0) {
        	digito = numero % 10;
        	if ((digito % 2)  == 0)
        		contarPar++;
        	numero = numero / 10;
        	
  }
       System.out.println("El numero "+numEntrada+" tiene "+contarPar+ " digitos pares" );
       	       
       tec.close();
	}     
	
}	
