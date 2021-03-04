package claseFile;

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.Normalizer;



public class ejercicio1 {

	public static void main(String []args) {
		
		 FileReader fr =null;
	        String ruta = "C:/PruebasFile/notas.txt";
		   
	        PrintWriter salida =null;
	        String  cadena="";
	        String cadenaResul="";
	        int indiceActual;
	        int []notasEnteras=new int[6];
	        boolean aprobado;
	        double media;
	        int numSuspensos;
	        int numCaracteres;
	        String blancos= "              ";
	      
	         
	        try {
	        	fr =new FileReader(ruta);
	            @SuppressWarnings("resource")
				BufferedReader entrada= new BufferedReader(fr);
                salida= new PrintWriter ("C:/PruebasFile/resultados.txt");
              
                cadena =entrada.readLine();
               
	               while(cadena!=null) {
	                   cadena= limpiarCadena(cadena);
	                   cadenaResul= getInicialMasApellido(cadena);
	                   numCaracteres= cadenaResul.length();
	                   cadenaResul=cadenaResul+blancos.substring(numCaracteres, 14);
	                   indiceActual= getIndice(cadena);
	                   notasEnteras= getNotas(cadena,indiceActual);
	                   aprobado=aprobado(notasEnteras);
	                   media=obtenerMedia(notasEnteras);
	                   numSuspensos= numeroSuspensos(notasEnteras);
	            System.out.println(formarCadenaFinal( cadenaResul, aprobado, media, numSuspensos));
	                   cadenaResul=formarCadenaFinal( cadenaResul, aprobado, media, numSuspensos);
	                   salida.println(cadenaResul);
	                   cadena =entrada.readLine();
	        } 
	            salida.flush();
	            salida.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	         
	}
	
	
	
	public static String limpiarCadena(String cadena) {
	   String cadenaNormalize = Normalizer.normalize(cadena, Normalizer.Form.NFD);   
		cadena = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
		cadena= cadena.replace(';', ' ');
		return cadena;
	}
	
	public static String getInicialMasApellido(String cadena) {
		String nuevaCadena="";
		
		nuevaCadena=nuevaCadena+cadena.charAt(0);
		nuevaCadena=nuevaCadena + ".";
		  int i=1;
          while(cadena.charAt(i)!=' ')
             i++;
          do {
        	  nuevaCadena=nuevaCadena+cadena.charAt(i);
      			i++;   
          }while(cadena.charAt(i)!=' ');
          
		return nuevaCadena;
				
	}
	
	public static int getIndice(String cadena) {
		 int i=1;
		 String nuevaCadena="";
         while(cadena.charAt(i)!=' ')
            i++;
         do {
       	  nuevaCadena=nuevaCadena+cadena.charAt(i);
     			i++;   
         }while(cadena.charAt(i)!=' ');
	
         return i;
	}

	public static int[] getNotas(String cadena, int indice) {
		 String[] notas = new String[6];
         int []notasEnteras=new int[6];
         int x=0;
         
         for(int j=indice ; j<cadena.length();j++) {
        	 
         	if(cadena.charAt(j)!=' ') {
         		if((cadena.charAt(j)=='1' && cadena.charAt(j+1)=='0')) {
         		 notas[x]="10";
         		 j++;
         		 x++;}
         		else {
     		   notas[x]= String.valueOf(cadena.charAt(j));
         	         x++;}
         		}
         }	
         //pasamos las notas de formato string a formato int
         for(int i=0;i<notasEnteras.length;i++) {
     	   notasEnteras[i]=Integer.parseInt(notas[i]);
        }
         
         
		return notasEnteras;
	}
	
	public static boolean aprobado(int[] array) {
		 boolean aprobado=true;
		 for(int i=0;i<array.length;i++) {
      	   if(array[i]<5) 
      		   aprobado=false; }	 
         return aprobado;
 }
	 
	public static double obtenerMedia(int[] array) {
		int suma=0; 
		 for(int k=0;k<array.length;k++) {
      	  
          	suma=suma+array[k];
         }
       double media= (double)suma/array.length;
      
		 return media;
	 }
	 
	public static int numeroSuspensos(int[] array) {
		 int numSuspensos=0;
		 
		  for(int k=0;k<array.length;k++) {
       	   if(array[k]<5) 
       		   numSuspensos++;
		  }
       	   return numSuspensos;
		 
	 }
	 
	public static String formarCadenaFinal(String cadena, boolean aprobado, double media, int numSuspensos ){
		 DecimalFormat df = new DecimalFormat("#.##");
		 
		 if (!aprobado) {
       	  cadena=cadena+ "  "+ "SC";
         }
         else
        	 cadena=cadena+ "  "+ (df.format(media)) ;
        
       if(!aprobado) {
    	   if(numSuspensos==1) {
    		   cadena=cadena + "    " +numSuspensos+" suspenso";
    	   }
    	   else
    	   cadena=cadena + "    " +numSuspensos+" suspensos";
        }
        else {
         if(media<=5)
        	 cadena=cadena + "  SUSPENSO";
         if(media>5 && media<6)
        	 cadena=cadena + "  SUFICIENTE";
         if(media>=6&& media<7)
        	 cadena=cadena + "  BIEN";
         if(media>=7 && media<=8)
        	 cadena=cadena + "  NOTABLE";
         if(media>=8 && media<=10)
        	 cadena=cadena + "  SOBRESALIENTE";
        }
		 
		 return  cadena;
	 }


}
	       
	     
	       
	       
		
	
	
	
	

