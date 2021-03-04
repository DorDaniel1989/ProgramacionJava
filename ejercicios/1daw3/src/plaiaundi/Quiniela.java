package plaiaundi;
import javax.swing.JOptionPane;


public class Quiniela {

	public static void main(String[]arg) {
	 //String[] equipo= {"equipo1","equipo2","equipo3","equipo4","equipo5","equipo6","equipo7","equipo8","equipo9","equipo10","equipo11","equipo12","equipo13","equipo14","equipo15","equipo16","equipo17","equipo18","equipo19","equipo20","equipo21","equipo22","equipo23","equipo24","equipo25","equipo26","equipo27","equipo28","equipo29","equipo30"};
     
	 String [][] partidos = new String[15][2];	
	 int [][] resultado = new int[15][2];
	 
      
      for(int i=0 ;i<15 ; i++) {
		 for(int j=0; j<2; j++ ) {
			partidos[i][j]=JOptionPane.showInputDialog(null,"Introduzca el equipo ");
		 }
	 }	 
	 
	 
	 for(int i=0 ;i<15 ; i++) {
		 for(int j=0; j<2; j++ ) {
			 resultado[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null," Introduzca el resultado"));
		 }
	 }	 
	
		
	 
	 //IMPRIMO 
	 for(int i=0 ;i<15 ; i++) {
		 for(int j=0; j<2; j++ ) {
			 if(resultado[i][j] > resultado[i][j+1])
	         System.out.print(partidos[i][j]+"-");
		     }   
		 System.out.println();
	
	 }
	 for(int i=0 ;i<15 ; i++) {
		 for(int j=0; j<2; j++ ) {
	         System.out.print(resultado[i][j]+"-");
	    }   
			 System.out.println();
		
	 }
	
	 
	 
}}
