package files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;
public class prueba {

public static void main(String[]args) {
	
	String frase;
	PrintWriter salida =null;
	try {
		
	
	salida =new PrintWriter("C:/prueba/prueba.txt");
	frase =JOptionPane.showInputDialog(null,"Introduce un texto");
	while(!frase.equalsIgnoreCase("FIN")) {
		salida.println(frase);
		frase=JOptionPane.showInputDialog(null,"Introduce un texto");
	}
	
	}catch (FileNotFoundException e) {
	System.out.println(e.getMessage());
	
	}finally {
		salida.close();
	}
}
}
