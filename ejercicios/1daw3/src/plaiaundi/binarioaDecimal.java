package plaiaundi;


import javax.swing.JOptionPane;

public class binarioaDecimal {
	
	public static void main(String[]args) {
		
		int numBinario, numDecimal, numIntro, pot2, digito;
		boolean binario;
		
		pot2 = 1;
		do {
			
			binario= true;
			
			numBinario = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero binario "));
			numIntro = numBinario;
			   
			  if (numBinario > 0) {
				  
				   do {
					    digito = numBinario % 10;
					    if ((digito !=0 ) && (digito !=1));
					    binario = false;
					    numBinario= numBinario / 10;
					    
				   }while ((numIntro < 0) && (binario) );
			   }
		   }while((numIntro < 0) && (!binario));
		
		//Tenemos un numero binario correcto
		
		//Pasar a decimal (sabemos que el numIntro esta en binario)
		
		numDecimal = 0;
		numBinario =numIntro;
		  
		while (numBinario !=0) {
			
			digito = numBinario % 10;
			numDecimal = numDecimal + digito * pot2;
			numBinario = numBinario / 10 ;
			pot2 = pot2 * 2 ;
		}
		
		JOptionPane.showMessageDialog(null, ("El numero " +numIntro+ "en decimal es:  " +numDecimal));		
  }

}