package plaiaundi;

import javax.swing.*;


public class numerosPrimos {

	public static void main(String[]args) {
		
		int numero;
		int divisor= 1;
		int primos= 0;
		int contador=0 ;
		//Scanner tec= new Scanner (System.in);
		
		numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero"));
		
		while (numero >= 0) {
	       	
		  while(divisor <= numero){
			 if((numero % divisor) == 0)            
			     contador++;
			  divisor++;
			  System.out.println(divisor);
		   }
		
		  
           if(contador == 2)
              primos++;
           divisor = 1;
           contador =0;
           numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero"));
          }   
		  
	     JOptionPane.showMessageDialog(null, "Has introducido " +primos+ " numeros primos");
		
	      
	}
	
	
}

	 

	