package trabajos_entregar;

import javax.swing.*;
public class Escaladores {

	public static void main (String[]args) {
		
		int numEscaladores,contGrupos=1, cabeza;
		char continuar; 
	     
		
		do {
		
		//metemos el numero de escaladores siempre que no sea mayor de 100
		do {
			numEscaladores= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la cantidad de escaladores del grupo :"));
					
		}while(numEscaladores>100);
		
		//Declaramos y establecemos la dimension de nuestro array
		
		int velocidad[] ;
		velocidad = new int[numEscaladores];
		
		
		//Ingresamos las velocidades siempre que no sean mayores de 50
		for (int i=0; i<numEscaladores; i++) {
			velocidad[i]= Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce una velocidad comprendida entre el 0 y el 50"));
			 if(velocidad[i]>50) {
				 JOptionPane.showMessageDialog(null, "Numero Erroneo ");
				 velocidad[i]=0;
			 }
		}	
		//Establecemos la primera cabeza del grupo como la primera velocidad introducida, 
		//y creamos un array para almacenar la cantidad de escaladores de cada grupo
		
		cabeza = velocidad[0];
		//Buscamos la cantidad de grupos que se forman
		 for(int i = 0; i < numEscaladores; i++) {
			  if(cabeza > velocidad[i]) {
                  contGrupos++;
                  cabeza = velocidad[i]; 
            	 } 
           }   
               //System.out.println(contGrupos);
         //Almacenamos la cantidad de escaladores de cada grupo en un array aparte
		 
		 int cantEnGrupos[];
		 cantEnGrupos= new int [contGrupos];
		 int contEscaladores=0; // Variable que almacenara la cantidad de personas de cada grupo
		 int j, k=0;
		 
		 
		 cabeza= velocidad[0]; //Volvemos a establecer la cabeza al comienzo del array
		 for ( j=0; j <numEscaladores ; j++) {
			   
			   if(cabeza > velocidad[j]) {
			    	 cabeza = velocidad[j];
			 	   while((contEscaladores !=0) && (k < contGrupos)) {
					  cantEnGrupos[k] = contEscaladores;
					  contEscaladores = 0;
					  k++;
				     }
			     }
				 contEscaladores++;
			 }   
		 cantEnGrupos[k] = contEscaladores++; //sumamos el ultimo grupo fuera del bucle ya que nunca encontrara ningun escalador mas lento		 
				
		 //COMPROBACIONES
		 // System.out.println("numero en posicion 1:"+ cantEnGrupos[0]);
		 // System.out.println("numero en posicion 2:"+ cantEnGrupos[1]);
		 // System.out.println("numero en posicion 3:"+ cantEnGrupos[2]);
		 
		 //Ordenamos el array para estar seguros de que la posicion 0 sera el valor mas pequeño
		 //   y que el de la ultima posicion sea el valor mas alto.
		 int var_aux; // esta variable es necesaria para el momento de cambio de posiciones
		 
		 for (int x=0 ;x < cantEnGrupos.length-1 ; x++) {  //este for es para repetir el ciclo anidado hasta que este ordenado del todo
				
				for (j= 0 ; j < cantEnGrupos.length-1; j++) { 
					
					if( cantEnGrupos[j] > cantEnGrupos[j+1] ) {
						var_aux = cantEnGrupos[j];
						cantEnGrupos[j] = cantEnGrupos[j+1];
						cantEnGrupos[j+1] = var_aux;
					}
				}	
			}	
		 String resul= "", resultado = "(";
		 resul = "Numero de grupos = " + contGrupos;
         resul = resul + "\nTamaño de grupo mas pequeño = " + cantEnGrupos[0];
         resul = resul + "\nTamaño de grupo mayor = " + cantEnGrupos[cantEnGrupos.length-1];
         JOptionPane.showMessageDialog(null, resul);
		 
		// System.out.println("Numero de Grupos: "+contGrupos);
		// System.out.println("Grupo de menor tamaño: "+cantEnGrupos[0]);
	    // System.out.println("Grupo mayor tamaño: "+ cantEnGrupos[cantEnGrupos.length-1]);
	     
	     
	     cabeza=velocidad[0];
	     resultado= resultado +velocidad[0]+" - ";
	     for ( j=1; j <numEscaladores ; j++) {
			    
			   if(cabeza > velocidad[j]) {
				   
				   resultado= resultado + ")\n(";
				   cabeza=velocidad[j];	   
	              }
			   resultado=resultado + velocidad[j]+" - " ;
			   	  
			}   
	          resultado=resultado + ')';
	         JOptionPane.showMessageDialog(null,resultado);	   
	      do{
        	       continuar = JOptionPane.showInputDialog(null, "Desea calcular otro grupo? S/N").toUpperCase().charAt(0);
                   }while(continuar != 'S' && continuar != 'N');
		 
		}while(continuar != 'N');
	           
    
	}}               
	
		       
		  
   	 
			
		 
		