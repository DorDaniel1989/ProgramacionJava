package plaiaundi;

import javax.swing.JOptionPane;
public class segPasarHorMinSeg {

	public static void main (String[]args) {
		
		
		int horaA, minutosA, segundosA, segIntro, horaT, minT, segT, horaN=0, minN=0, segN=0;
		
	
		//LE PEDIMOS LA ENTRADAD E DATOS AL USUARIO ACOTANDO SUS POSIBLES ENTRADAS A UN FORMATO DE HORAS MINUTOS Y SEGUNDOS
		
		do{
		horaA=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca una hora comprendida entre 0-24 " ));		
		
		} while((horaA > 24) || (horaA < 0));	
		
		do{
			minutosA=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los minutos comprendidos entre 0-60 " ));		
			
			} while((minutosA > 60) || (minutosA < 0));	
		do{
			segundosA=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los segundos comprendida entre 0-60 " ));		
			
			} while((segundosA > 60) || (segundosA < 0));	
		
		do{
			segIntro=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca los segundos que quiera agregarle a la hora inicial " ));		
			
			} while(segundosA< 0);	
				
		
		//TRANSFORMAMOS LOS SEGUNDOS INTRODUCIDOS POR EL USUARIO A HORAS, MINUTOS Y SEGUNDOS
		
		
		segT = segIntro % 60;
		
		minT= (segIntro / 60) % 60 ;
		
		horaT =(segIntro / 60) / 60;
		
		//COMPROBAMOS QUE ES CORRECTO EL RESULTADO
		//System.out.println(horaT+"-"+minT+"-"+segT);
		
		//NOS DISPONEMOS A SUMAR LOS VALORES INICIALES CON LOS VALORES TRANSFORMADOS
		
		
		
		segN= segundosA +segT;
		   if (segN >60) {
			   segN= segN -60;
			   
			    minN++;
			 }  
		  
		minN= minN+ minutosA + minT;
		   if (minN >60) {
			   minN= minN -60;
			    horaN++;
			 }  
		
		horaN=horaN+ horaA + horaT;
			if (horaN >24) {
			   horaN =0;
				 }     	   
		System.out.println("Hora nueva: " +horaN +"h."+minN +"min."+segN+"seg");	
			
		
		
		
		}
}		
		
		
	
		
	