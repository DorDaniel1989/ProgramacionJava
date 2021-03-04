package trabajos_entregar;

import javax.swing.*;
public class Abuela {
	public static void main(String[]arg) {
		
		String nombre, comp = "";
		String nietos, seguir;
		char letra;
		int numeroN;
		
		do {
		
		boolean abuela=false ;
		
		//INTRODUCIMOS LOS VALORES DEL PROGRAMA
		
		nombre = JOptionPane.showInputDialog(null,"Introduce el nombre del nieto (le enseño la foto)");
		numeroN = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el numero de nietos que tienes "));
		nietos = JOptionPane.showInputDialog(null,"Dime el nombre del nieto de la foto ");
		nietos = nietos+" ";
		nombre = nombre +" ";
		
		//CHECK POINT
		JOptionPane.showMessageDialog(null, "El de la foto es  "+nombre+"\n tienes "+numeroN+" nietos y se llaman\n"+nietos );
		
		
		int  palabras=0;
		int i=0;
			
	     	do {
	 		
	     while ((nietos.charAt(i) != ' ') && (i <nietos.length())) {     
		   
			comp= comp + nietos.charAt(i);
		    i++;
		 }
	        comp=comp+" ";
	        
		 if (nietos.charAt(i) == ' ') 
			 palabras++;
		 i++;	
		
		 if ((comp.equals(nombre))&&( palabras == numeroN)) 
			abuela=true;
		
		  else
		    comp="";
		
		
		 
		}while(i<nietos.length());
					 
					 
		if (abuela==false)
		JOptionPane.showMessageDialog(null, "ERES UNA ABUELA FALSA!!");
		 else {
			 
		  JOptionPane.showMessageDialog(null, "ERES UNA VERDADERA ABUELA!");   		 
		 }	
		
		seguir=JOptionPane.showInputDialog(null," ¿Desea hacerle el test a otra abuela? Si/No ");
		letra=seguir.charAt(0);
		
		
	  }while ((letra !='N') && (letra !='n'));
		      
			     
		 
					
	}}		
		   	    
		    	
             