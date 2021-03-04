package claseFile;

import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class ejercicio4 {

	public static void main(String[]args) {

		ArrayList<String> nombres = new ArrayList<String>();
		
	   
		
		String Nombre="";
		int tamanoNombre=0;
		int tamanoNombreAnterior = 50;
		String dibujo = null;
		String nombreAnterior;
		int i =0;
		PrintWriter salida =null;
	
		
		try {
		  salida= new PrintWriter ("C:/PruebasFile/nombres.txt");
		
		do {
			//Pedimos el nombre al usuario
			
		     nombres.add(JOptionPane.showInputDialog("Introduzca un nombre"));
		    
		    //salimos antes del bucle al darle al enter para no imprimir guiones de mas 
		     
    	      if(nombres.contains("")) {
			  break;
		     }
    	      
		    Nombre=nombres.get(i);	
		    Nombre=Nombre.toUpperCase();
		    tamanoNombre=Nombre.length();
		    tamanoNombre=tamanoNombre*2; //Lo multiplicamos por dos para que coja todo el espacio, ya que hemos insertado las barras
		  
		    //La primera secuencia de guiones la imprimimos siempre
		    
		  if(nombres.size()==1) {
		     System.out.println( dibujarGuiones(tamanoNombre));
		     salida.println(dibujarGuiones(tamanoNombre));}
		  
		  //Obtengo el tama�o del nombre anterior si lo hubiera
		  
		  if(nombres.size()>1) {
		     nombreAnterior=nombres.get(i-1);
		     tamanoNombreAnterior=nombreAnterior.length();
		     tamanoNombreAnterior=tamanoNombreAnterior*2;
		  }
		  
		  if(Nombre.length() > tamanoNombreAnterior) {
			  System.out.println( dibujarGuiones(tamanoNombre));
		      salida.println(dibujarGuiones(tamanoNombre)); 
		  }
		  else {
			  if(nombres.size()>1 && (Nombre.length() <= tamanoNombreAnterior)) {
			     System.out.println( dibujarGuiones(tamanoNombreAnterior));  
		         salida.println(dibujarGuiones(tamanoNombreAnterior));}
		  }
		  
		    dibujo=formarLetrasConBarra(Nombre);
		    salida.println(dibujo);
		    System.out.println(dibujo);
		    i++;
		    
		}while (!(nombres.contains("")));	
	
		System.out.println(dibujarGuiones(tamanoNombre));
		 salida.println(dibujarGuiones(tamanoNombre));
		salida.flush();
		
		}catch(IOException e) {
			System.out.println("Ha ocurrido un error");
			System.out.println(e.getMessage());
		}
	
	}
	
	public static String formarLetrasConBarra(String nombre) {
		String dibujo=""; 
		
		for(int i=0;i<nombre.length();i++) {
		dibujo=dibujo +"|" + nombre.charAt(i);
		}
		dibujo=dibujo+"|";
		return dibujo;
	}
	
	public static String dibujarGuiones(int cantidad) {
		String guiones ="------------------------------------------------------------------";
		String dibujoGuiones="";
		dibujoGuiones=(guiones.substring(0,cantidad+1));
		return dibujoGuiones;
	}
	
}
