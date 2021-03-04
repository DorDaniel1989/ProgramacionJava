package plaiaundi;

import javax.swing.*;
public class partidarioOno {

	public static void main(String[]args) {
		
		int array [];
		array = new int [10];
		int i, j;
		boolean partidario = true ;
			
		for( i=0; i<10 ; i++) {
		  array[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca un numero"));
			if (array[i]<0) {
				i=0;
			    JOptionPane.showMessageDialog(null,"Introduzca un valor mayor a 10");
			}
		
		}
		 
		do {
			
		for(i=0;  i < 10 ; i+=2) {
			for( j=1; j < 10 ; j+=2) {
				
				if(array[i] < array[j])
					partidario = false;
				}
				
		}
		
		
		}while((partidario == true) && (i < array.length));
		
		
		if(partidario == true) {
			System.out.println("El vector es partidario ");	}
		
			
		else if(partidario == false){
		
		    System.out.println("El vector no es partidario "); 
			
		}
			
		    
		
					
		
		
		
		
	
	
}}

	
		
