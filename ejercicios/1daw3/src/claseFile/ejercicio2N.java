package claseFile;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.text.Normalizer;



public class ejercicio2N {
  public static void main(String[]args) throws IOException {
	  
		//Preparando los objetos de lectura y escritura
	    PrintWriter salida =null;
	    FileReader fr=null;
	    String rutaFichero ="C:/PruebasFile/notasEjercicio2.txt";
		fr =new FileReader(rutaFichero);
		@SuppressWarnings("resource")
		BufferedReader entrada =new BufferedReader(fr);
		
		//Primera lectura para comenzar el bucle
		
		    String cadena =entrada.readLine();
		   
		while(cadena!=null) {
			
			        //Variables y procesamiento de estas con los metodos generados
			
			         cadena=limpiarCadena(cadena);
		   	String   curso=getCurso(cadena);
			String   cadenaSinCurso=cortarCadena(cadena);
		  	String   nombre=getNombre(cadenaSinCurso);
		  	String   nombreParaFichero=nombre.replace( ' ', '_');
			int      tamanoNombre=nombre.length();
			String   notas=getNotas(cadenaSinCurso ,tamanoNombre);
			int      numSuspensos= numSuspensos(notas);
		    String[] notasTraducidas=new String[6];
			         notasTraducidas=traducirNotas(notas);
			
			      
			         
			         // Generaramos boletines personalizados para cada alumno
			         
			      String rutaBoletin="C:/PruebasFile/boletines/boletines_"+ nombreParaFichero +".txt";
		          salida= new PrintWriter (rutaBoletin);
			         
			         
		            //Escribimos en el fichero con ayuda de los metodos print generados
			      
			salida.println(printCabecera());
			salida.println(printCiclo(curso));
			salida.println(printNombre(nombre));
			salida.println(printCalificaciones(notasTraducidas ,curso));
			salida.println(printSuspensos(numSuspensos));
			salida.println(printGuionesSeparacion());
			
			
				   //Imprimimos en consola para comprobar la salida
			
			System.out.println(printCabecera());
	        System.out.println(printCiclo(curso));
	    	System.out.println(printNombre(nombre));
	        System.out.println(printCalificaciones(notasTraducidas ,curso));
	    	System.out.println(printSuspensos(numSuspensos));
	        System.out.println(printGuionesSeparacion());
	               
	        
	                 //Guardamos datos almacenados en el Buffer
	        
	          salida.flush();
	          
	               //Leemos la siguiente cadena
	        
	          cadena=entrada.readLine();
	        
	         
	          
		}
		           //Fuera del bucle cerramos el puente
		
	          salida.close();
  }
  
                  //Metodos para obtener y manipular datos
  
  public static String getCurso(String cadena) {
	  
	  String subcadena;
	  
	  subcadena=cadena.substring(0,5);
	  
	  return subcadena;
  }
  public static String cortarCadena(String cadena) {
	  String subcadena;
	  
	  subcadena=cadena.substring(6,cadena.length());
	  return subcadena;
  }
  public static String getNombre(String cadena) {
	  String nombreCompleto="";
	   int i=0;
	  while(cadena.charAt(i)!=';') {
		  
		  nombreCompleto=nombreCompleto+cadena.charAt(i);
		  i++;
	  }
	  
	  return nombreCompleto;
  }
  public static String getNotas(String cadena ,int indice) {
	  String subcadena;
	  
	  subcadena=cadena.substring(indice+1, cadena.length());
	  
	  return subcadena;
  }
  public static String limpiarCadena(String cadena) {
	   String cadenaNormalize = Normalizer.normalize(cadena, Normalizer.Form.NFD);   
		cadena = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
		
		return cadena;
	}
  public static String[] traducirNotas(String cadena) {
	    //simplifico las abreviaciones aun más
	    cadena=cadena.replace("SC", "S");
	    cadena=cadena.replace("NP", "N");
	    
	  String[] notasTransformadas =new String[6];
	    int i=0;      
	    int j=0;
	    while(i<cadena.length()) {
	    	if(cadena.charAt(i)!=';') {
	    		notasTransformadas[j]=String.valueOf(cadena.charAt(i));
	    		j++;
	    	}
	    	i++;
	    }
	    
	    for(int k= 0; k<notasTransformadas.length;k++) {
	          if(notasTransformadas[k].equals("S")) {
	        	  notasTransformadas[k]="SIN CALIFICAR";
	          }
	          if(notasTransformadas[k].equals("N")) {
	        	  notasTransformadas[k]="NO PRESENTADO";
	          }
	          if(notasTransformadas[k].equals("1")) {
	        	  notasTransformadas[k]="SUSPENSO";
	          }
	          if(notasTransformadas[k].equals("2")) {
	        	  notasTransformadas[k]="SUSPENSO";
	          }
	          if(notasTransformadas[k].equals("3")) {
	        	  notasTransformadas[k]="SUSPENSO";
	          }
	          if(notasTransformadas[k].equals("4")) {
	        	  notasTransformadas[k]="SUSPENSO";
	          }
	          if(notasTransformadas[k].equals("5")) {
	        	  notasTransformadas[k]="SUFICIENTE";
	          }
	          if(notasTransformadas[k].equals("6")) {
	        	  notasTransformadas[k]="BIEN";
	          }
	          if(notasTransformadas[k].equals("7")) {
	        	  notasTransformadas[k]="NOTABLE";
	          }
	          if(notasTransformadas[k].equals("8")) {
	        	  notasTransformadas[k]="NOTABLE";
	          }
	          if(notasTransformadas[k].equals("9")) {
	        	  notasTransformadas[k]="SOBRESALIENTE";
	          }
	          
	          if(notasTransformadas[k].equals("10")) {
	        	  notasTransformadas[k]="SOBRESALIENTE";
	          }
	    	
	          
	    }
	  return notasTransformadas;
  }
  public static int numSuspensos(String notas) {
	  //como no interesan estos datos, simplemente los elimino
	  notas=notas.replaceAll("NP","");
	  notas=notas.replaceAll("SC","");
	  notas=notas.replaceAll(";","");
	  notas=notas.replaceAll(" ","");
	  
	  int numSuspensos=0;
	 
	      for(int i=0;i<notas.length();i++) {
	    	   if(notas.charAt(i)<'5') {
	    		   numSuspensos++;
	    	   }
	       }
	     
	  return numSuspensos;
  }
  
 
                    //Metodos para Imprimir
  
  public static String  printCabecera() {
	  String dibujo=" IES PLAIAUNDI\n";
	         dibujo=dibujo+"                       BOLETIN DE NOTAS";
	         dibujo=dibujo+"\n";
	         
	  return dibujo;
  }
  public static String  printCiclo(String ciclo) {
	   String dibujo="";
	  if(ciclo.equals("1DAW3")) {
		 
		  dibujo="  Ciclo Formativo de Grado Superior\n ";
		  dibujo=dibujo+"   Desarrollo de Aplicaciones Web";
		  dibujo=dibujo+"\n";
		  dibujo=dibujo+"\n";
		  
	  }
	  if(ciclo.equals("2SMR2")) {
			 
		  dibujo="  Ciclo Formativo de Grado Medio\n ";
		  dibujo=dibujo+"  Sistemas Microinformaticos y Redes";
		  dibujo=dibujo+"\n";
		  dibujo=dibujo+"\n";
		 
	  }
	 
	  if(ciclo.equals("2SMR2")){
			 
		  dibujo="     Ciclo Formativo de Grado Medio\n ";
		  dibujo=dibujo+"  Sistemas Microinformaticos y Redes"; 
		  dibujo=dibujo+"\n";
		  dibujo=dibujo+"\n";
		
	  }
	 
	   return dibujo;
  }
  public static String  printCalificaciones(String[]notas ,String curso) {
	String calificaciones="";
	//String blancos="                                  ";
	String []smr1={"Redes Locales", "Sistemas Operativos", "Montaje Equipos", "Aplicaciones ofimáticas", "Seguridad",
	               "Inglés"};
	String []smr2= {"Servicios en Red", "Sistemas Operativos en red", "Aplicaciones Web", "FOL", "Empresa"};
	String []daw3= {"Programación", "Sistemas Informáticos", "Bases de Datos", "Entornos de desarrollo", "Lenguaje de Marcas", "FOL"};
			
	       if(curso.equals("1DAW3")) {
	    	   calificaciones=daw3[0]+":               "+notas[0]+"\n";
	    	   calificaciones=calificaciones+daw3[1]+":      "+notas[1]+"\n";
	    	   calificaciones=calificaciones+daw3[2]+":             "+notas[2]+"\n";
	    	   calificaciones=calificaciones+daw3[3]+":     "+notas[3]+"\n";
	    	   calificaciones=calificaciones+daw3[4]+":         "+notas[4]+"\n";
	    	   calificaciones=calificaciones+daw3[5]+":                        "+notas[5]+"\n";
	    	   
	       }
	       if(curso.equals("1SMR2")) {
	    	   calificaciones=smr1[0]+"           "+notas[0]+"\n";
	    	   calificaciones=calificaciones+smr1[1]+":           "+notas[1]+"\n";
	    	   calificaciones=calificaciones+smr1[2]+":           "+notas[2]+"\n";
	    	   calificaciones=calificaciones+smr1[3]+":           "+notas[3]+"\n";
	    	   calificaciones=calificaciones+smr1[4]+":           "+notas[4]+"\n";
	    	   calificaciones=calificaciones+smr1[5]+":           "+notas[5]+"\n";
	    	   
	       }
	       
	       if(curso.equals("2SMR2")) {
	    	   calificaciones=daw3[0]+":               "+notas[0]+"\n";
	    	   calificaciones=calificaciones+smr2[1]+": "+notas[1]+"\n";
	    	   calificaciones=calificaciones+smr2[2]+":           "+notas[2]+"\n";
	    	   calificaciones=calificaciones+smr2[3]+":                        "+notas[3]+"\n";
	    	   calificaciones=calificaciones+smr2[4]+":                    "+notas[4]+"\n";
	    	  
	    	   
	       }
	       
	return calificaciones;
}
  public static String  printNombre(String nombre) {
	  String dibujo;
	    
	         dibujo="Nombre:  "+ nombre;
	         dibujo=dibujo+"\n";
	         
	  return dibujo;
  }
  public static String  printSuspensos(int numSuspensos) {
	  String dibujo;
	    
	         dibujo="Numero de suspensos:     " + numSuspensos ;
	         dibujo=dibujo+"\n";
	         
	  return dibujo;
  }
  public static String  printGuionesSeparacion() {
	  String dibujo;
	  
	         dibujo="*******************************************\n";
	         dibujo+="*******************************************";
	         
	  return dibujo;
  }
  
}

