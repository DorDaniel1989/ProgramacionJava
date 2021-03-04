package plaiaundi;
import javax.swing.*;
public class mezclarDigitos {

	public static void main(String[]args) {
		
		int num1, num2, numMez = 0, pot = 1;
		int dig1, dig2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca un numero positivo "));
		num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca otro numero positivo "));
		
		while((num1 !=0) && (num2 !=0)){
			dig1 =num1 % 10;
			numMez= numMez + dig1 * pot;
			pot=pot* 10;
			dig2 =num2 % 10;
			numMez= numMez + dig2 * pot;
			pot=pot * 10;
			num1= num1 / 10;
			num2= num2 / 10;
			}
		//NO ME FUNCIONA LA PARTE DE QUE CONTINUE AÑADIENDO LOS NUMEROS QUE SOBREN
		while( num1 !=0 ){
		dig1 = num1 % 10;
		numMez= numMez+ dig1*pot;
		pot=pot*10;
		num1=num1/10;
		}
		
		while( num2 != 0 ){
			dig2 =num2 % 10;
			numMez= numMez+ dig2 * pot;
			pot=pot*10;
			num2=num2/10;
		}
		
		
		JOptionPane.showMessageDialog(null, "Resultado: " +numMez);
	}
	
}
