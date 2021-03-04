package plaiaundi;

import javax.swing.*;
public class sumarBinarios {

	public static void main(String[]arg){
		
		int vector1[];
		vector1= new int [10]; 
		int vector2[];
		vector2= new int [10]; 	
		int vector3[];
		vector3= new int [11]; 
		
		for( int i=0 ; i<10; i++) {
	      vector1[i]= Integer.parseInt(JOptionPane.showInputDialog(null, "Primer vector binario, introduzca un 1 o un 0 "));
	       if ((vector1[i]!=0)&&(vector1[i] !=1)) {
	    	i=0;
	    JOptionPane.showMessageDialog(null," Numero Erroneo, introduzca el valor 1 o 0");
	           }
	     }
		for( int j=0 ; j<10; j++) {
		      vector2[j]= Integer.parseInt(JOptionPane.showInputDialog(null, "Segundo vector binario, Introduzca un 1 o un 0 "));
		       if ((vector2[j]!=0)&&(vector2[j] !=1)) {
		    	j=0;
		    JOptionPane.showMessageDialog(null," Numero Erroneo, introduzca el valor 1 o  0");
		           }
		     }
		    
		
		 int llevada =0;
		 int i = 9;
		 int j = 9;
		 int k = 10;
		 
		 while (( i !=0 ) && (j !=0 )) {
			 
			 vector3[k] = vector1[i] + vector2[j] + llevada;
			 
			    if(vector3[k] > 1) {
			       vector3[k] = 0;
			       llevada= 1;
			    }
			    else              
			    	llevada=0;
			    
			    i--;
			    j--;
			    k--;
			    System.out.println(vector3[k]);
			    
			   
		 }       
		 
		 while(k != 0) {
			 vector3[k]= vector1[i] + vector2[j] + llevada;
			  if(vector3[k] == 2) {
			    	vector3[k] = 0;
			    	llevada= 1;
			  k--;
		     }
			  if(vector3[k] == 3) {
			    	vector3[k] = 1;
			    	llevada= 1;
			  k--;
		     }
			
			
			  vector3[k]= vector3[k] + llevada ;
			
			  
		 for(int x=0 ; x<vector3.length ; x++) {
			 
			 System.out.print("["+vector3[x] +"]");
			 
		    }
		 
	    
		
		
		
	}	
}
}