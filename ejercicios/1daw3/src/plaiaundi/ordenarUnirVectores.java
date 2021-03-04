package plaiaundi;

import javax.swing.*;

public class ordenarUnirVectores {
	
	public static void main (String[]args) {
		
		int vector1 [];
		int vector2 [];
		int vector3 [];
		
		 
		vector1 = new int[7];
		vector2 = new int[7];
		vector3 = new int[14];
		
		
		int i, k, j= 0;
	
		 
		for( i=0 ; i < 7; i++) {
		vector1[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero para el la posicion" +i+" del  vector 2 :"));	
		 System.out.println( vector1[i]);
		} 
		
		for( k=0 ; k < 7; k++)	{	
		 vector2[k] = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce un numero para el la posicion" +k+ " del  vector 2 :"));	
		 System.out.println( vector2[k]);}
		
		 
		for (i=0 ; i<7 ; i++) {
		  vector3[j]=vector1[i];
			 j++;
			 //System.out.println(j);
			 }
		for (k=0 ; k<7 ; k++) {
			  vector3[j]=vector2[k];
				 j++;
			 //System.out.println(j);
			 }
		 
		 int var_aux;
		 
		for ( i=0 ;i < vector3.length-1 ; i++) {  
			
			for (j= 0 ; j < vector3.length-1; j++) { 
				
				if( vector3[j] > vector3[j+1] ) {
					var_aux = vector3[j];
					vector3[j] = vector3[j+1];
					vector3[j+1] = var_aux;
				}
			}			
			
		}	
			
				for ( j=0 ; i< vector3.length ; j++)
			System.out.print(vector3[j]+" - ");
			}

}	       
	
	
		
