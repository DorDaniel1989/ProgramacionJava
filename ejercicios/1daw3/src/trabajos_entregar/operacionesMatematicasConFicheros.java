package trabajos_entregar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;


public class OperacionesMatematicasConFicheros {

	@SuppressWarnings("resource")
	public static void main(String[]args) throws IOException {
		
		
		//Preparando los objetos de lectura y escritura
	    PrintWriter salida =null;
	    FileReader fr=null;
		salida= new PrintWriter ("C:/PruebasFile/boletines.txt");
	    String ruta ="C:/PruebasFile/operaciones.txt";
		fr =new FileReader(ruta);
		@SuppressWarnings("resource")
		BufferedReader entrada =new BufferedReader(fr);
		
		String cadena =entrada.readLine();
		   System.out.println(cadena);
		cadena=quitarEspacios(cadena);
			System.out.println(cadena);
		
	  
		

	    
	    
		  int PrimeraAparicion=cadena.indexOf('(');                              
	      int UltimaAparicion=cadena.lastIndexOf(')');
	  
	 /*     
	    System.out.println(PrimeraAparicion);
	    System.out.println(UltimaAparicion);
	    */
	    
	    String cadenaR=cadena.substring(1, UltimaAparicion);
	    
	    System.out.println(cadenaR);
	    
	    int resul=realizarOperacion(cadenaR);
	  //  System.out.println(resul);
	    
	    cadenaR=cadena.substring(UltimaAparicion+1, cadena.length());
	    
	    System.out.println(resul+ " "+cadenaR);
	    
	    resul=identificarAccion(cadenaR,  resul);

	//    System.out.println(resul);
	    cadenaR=cadenaR.substring(2, cadenaR.length());
	    System.out.println(resul+" "+cadenaR);
	    
	    resul=identificarAccion(cadenaR, resul);
	    System.out.println(resul);
	    
	    
	}

	
	
//limpieza	
public static String quitarEspacios(String cadena) {
	String nuevaCadena;
	
	nuevaCadena=cadena.replaceAll(" ", "");
	nuevaCadena=nuevaCadena.replaceAll("=", "");
	
	return nuevaCadena;
	
}
//operaciones a realizar
public static int sumar(int num1, int num2) {
	
	int resultado=num1+num2;
	return resultado;
}
public static int restar(int num1, int num2) {
	
	int resultado=num1-num2;
	return resultado;
}
public static int multiplicar(int num1, int num2) {
	
	int resultado=num1*num2;
	return resultado;
}
public static int dividir(int num1, int num2) {
	
	int resultado=num1/num2;
	return resultado;
}
//identificar operaciones

public static boolean validarParentesis(String cadena) {
	boolean valido=false;
	int parentesisApertura=0;
	int parentesisCierre=0;
	String [] combinaciones= {"(",")",")+",")-",")*",")/","+(","-(","*(","/("}; 
	for(int i=0;i<cadena.length();i++) {
		
		
	}
	
	
	      for(int i=0;i<cadena.length();i++) {
	    	  if(cadena.charAt(i)=='(' ) {
	    		  parentesisApertura++;
	    	  }
	    	  if( cadena.charAt(i)==')'){
	    		parentesisCierre++;
	    	  }
	       }
	
	      if(parentesisApertura==parentesisCierre)
	    	  valido=true;
	      else
	    	  valido=false;
	
	return valido;
}


public static int identificarAccion(String cadena, int resultado) {
int i=0;
String numero="";
int num;

	if(cadena.charAt(i)=='*') {
		i++;
		numero=numero+cadena.charAt(i);
		num=Integer.parseInt(numero);
		resultado=multiplicar(resultado,num);
		return resultado;
			
	}
	if(cadena.charAt(i)=='/') {
		i++;
		numero=numero+cadena.charAt(i);
		num=Integer.parseInt(numero);
		resultado=dividir(resultado,num);
		return resultado;
			
	}
	if(cadena.charAt(i)=='-') {
		i++;
		numero=numero+cadena.charAt(i);
		num=Integer.parseInt(numero);
		resultado=restar(resultado,num);
		return resultado;
			
	}
	if(cadena.charAt(i)=='+') {
		i++;
		numero=numero+cadena.charAt(i);
		num=Integer.parseInt(numero);
		resultado=sumar(resultado,num);
		return resultado;
			
	}
	
	
	
	return resultado;
	
	
	
}
public static int realizarOperacion(String cadena) {
		int resultado=0;
		int i=0;
		String num1S="";
	    String num2S="";
	    int num1=0;
	    int num2=0;
		while(i<cadena.length()){
		   
			if (cadena.charAt(i)=='+') {
		    	num1=Integer.parseInt(num1S);
		    	i++;
		        	while(i<cadena.length()){
		        		num2S=num2S+cadena.charAt(i);
		        		i++;
		        	}
		        	
		        num2=Integer.parseInt(num2S);	
		    	resultado=sumar(num1,num2);
		        return resultado;	
		    }
		    	
		    
		    
		    
		    
		    if (cadena.charAt(i)=='-') {
		    	num1=Integer.parseInt(num1S);
		    	i++;
	        	   while(i<cadena.length()){
	        		num2S=num2S+cadena.charAt(i);
	        		i++;
	        	}
	        	
	        	 num2=Integer.parseInt(num2S);	
	    	     resultado=restar(num1,num2);
	             return resultado;	
		    }
		    	
		    
		    
		    if (cadena.charAt(i)=='*') {
		    	num1=Integer.parseInt(num1S);
		    	 i++;
	        	   while(i<cadena.length()){
	        		  
	        		num2S=num2S+cadena.charAt(i);
	        		i++;
	        	}
	        	
	        	num2=Integer.parseInt(num2S);	
	    	    resultado=multiplicar(num1,num2);
	            return resultado;	
		    }
		    	
		    if (cadena.charAt(i)=='/') {
		    	num1=Integer.parseInt(num1S);
		    	i++;
	        	   while(i<cadena.length()){
	        		num2S=num2S+cadena.charAt(i);
	        		i++;
	        	   }
	        	
	        	num2=Integer.parseInt(num2S);	
	    	    resultado=dividir(num1,num2);
	            return resultado;	
		    }
		    	
		    
		  num1S=num1S+(cadena.charAt(i));
		  i++; }
		 
		
		return resultado ;
	}

}
