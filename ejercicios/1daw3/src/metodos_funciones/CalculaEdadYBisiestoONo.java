package metodos_funciones;

import javax.swing.JOptionPane;

public class CalculaEdadYBisiestoONo {
		
	public static void main(String[] args) {
		String  seguir;
		char letra;
	  
	do {
		 año=pedirAño();
		 mes=pedirMes();
		 dia=pedirDia();
		  
		 int edad;
		    
		   if (mes<mesActual)
			   edad= añoActual-año;
		   else
			   edad= (añoActual-año)-1;
		  
         System.out.println("Tu fecha de nacimiento es : " +dia+"/"+mes+"/"+año);
         System.out.println("Y tu edad es :" +edad);
         
         seguir =  JOptionPane.showInputDialog(null,"Seguir? (Si/No)");
         letra= seguir.charAt(0);
         
	 }while((letra !='N') && (letra !='n'));
	}

	
    static int[]MaxDiadelMes ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int año;
	static int mes;
	static int dia;
	static int añoActual=2021;
	static int mesActual=2;
	static int diaActual=7;
	static boolean bisiesto=false;
	
	
	public static int pedirAño() {
		do {
		  año=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su año de nacimiento:"));
		if (año<1910)
			JOptionPane.showMessageDialog(null,"Introduzca el año de nacimiento /nde una persona viva por favor ");
		}while(año<1910);
		  if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) 
			 bisiesto = true;
		  else
		     bisiesto=false;
			 
			
		return año;
	}
	
    public static int pedirMes() {
		
    	do {
    		mes=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un mes:"));
     		if (mes<0 || mes>12)
    			JOptionPane.showMessageDialog(null,"Introduzca un mes valido por favor ");
    		}while(mes<0 || mes>12);
    	return mes;
    	
    	
     }public static int pedirDia() {
		
	   int indice;
	   do {
			dia=Integer.parseInt(JOptionPane.showInputDialog("Dia"));
			 indice = mes-1;
			 if(bisiesto)
			  MaxDiadelMes [1]=29;
			 if(bisiesto==false)
			  MaxDiadelMes [1]=28;
			 
			 if (dia>MaxDiadelMes[indice] )
				
				JOptionPane.showMessageDialog(null,"Introduzca un dia valido por favor");    	
			}while(dia>MaxDiadelMes[indice]);
	     return dia;
   }

}
