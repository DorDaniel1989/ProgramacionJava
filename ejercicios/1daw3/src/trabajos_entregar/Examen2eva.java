package trabajos_entregar;


import javax.swing.JOptionPane;
public class Examen2eva {

	public static void main (String[]arg) {
			
		
		char letra;
		
		do {
			
		String seguir;
		int resultado;	
		int contadorVocales=0;	
		int i=0;
		
		String frase="";
		try {
		  frase=JOptionPane.showInputDialog("Introduzca una frase");
		  frase=frase.toLowerCase();
		
		}catch(RuntimeException e) {
			System.out.println("****ERROR------>"+e.getMessage());
		}
		
		 while(i<frase.length()) {
		 if(frase.charAt(i)==('a')||frase.charAt(i)==('e')||frase.charAt(i)==('i')||frase.charAt(i)==('o')||frase.charAt(i)==('u'))
	        contadorVocales++;
	        i++;
		  } 
		 
		 JOptionPane.showMessageDialog(null,"La frase introducida tiene "+ contadorVocales +" vocales");
         seguir = JOptionPane.showInputDialog(null,"Seguir? (Si/No)");
    	 letra= seguir.charAt(0);
    	
    	 
    	 
		
	}while((letra !='N') && (letra !='n'));	
		}
	
}
